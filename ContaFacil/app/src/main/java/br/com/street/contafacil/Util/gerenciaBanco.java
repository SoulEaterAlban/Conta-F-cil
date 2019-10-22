package br.com.street.contafacil.Util;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;




public class gerenciaBanco extends SQLiteOpenHelper {

    private static final String NOME_BANCO = "contaFacil.db";
    private static final int VERSAO_SCHEMA = 1;
    private static final String[] sql = {
            "CREATE TABLE tbAparelho(idAparelho INTEGER PRIMARY KEY AUTOINCREMENT, nomeAparelho TEXT, potencia INTEGER,diasUsados INTEGER, horasUsadas INTEGER,status INTEGER)",
            "CREATE TABLE tbCategoria(idCategoria INTEGER PRIMARY KEY AUTOINCREMENT, nomeCategoria TEXT,status INTEGER)",
            "CREATE TABLE tbImposto(idImposto INTEGER PRIMARY KEY AUTOINCREMENT, nomeImposto TEXT, taxaImposto REAL, status INTEGER)",
            "CREATE TABLE tbBandeira(idBandeira INTEGER PRIMARY KEY AUTOINCREMENT, nomeBandeira TEXT, acrescimo REAL,status INTEGER)"
    };
    private static final String[] tabelas = {"tbAparelho", "tbCategoria", "tbImposto", "tbBandeira"};
    public gerenciaBanco(Context context) {
        super(context, NOME_BANCO, null, VERSAO_SCHEMA);
        getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        for (int i = 0; i < sql.length; i++) {
            db.execSQL(sql[i]);
            Log.w(gerenciaBanco.class.getName(), "Tabela " + tabelas[i] + " criada...");
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        for (int i = 0; i < tabelas.length; i++) {
            db.execSQL("DROP TABLE IF EXISTS " + tabelas[i]);
        }
        onCreate(db);
    }

    public void closeDB() {
        SQLiteDatabase db = this.getReadableDatabase();
        if (db != null && db.isOpen())
            db.close();
    }
}
