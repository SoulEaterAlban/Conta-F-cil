package br.com.street.contafacil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CadProduto extends AppCompatActivity {

    private EditText edtNome_prod;
    private EditText edtQtd_Prod;
    private EditText edtPotenc_Prod;
    private EditText edtDias_Uso;
    private EditText edtTempo_uso;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cad_produto);

        edtNome_prod    = (EditText) findViewById(R.id.edtNome_prod);
        edtQtd_Prod     = (EditText) findViewById(R.id.edtQtd_Prod);
        edtPotenc_Prod  = (EditText) findViewById(R.id.edtPotenc_Prod);
        edtDias_Uso     = (EditText) findViewById(R.id.edtDias_Uso);
        edtTempo_uso    = (EditText) findViewById(R.id.edtTempo_uso);

    }
    public void sendMessage(View view){
        //Chamar outra activity
        Intent intent2 = new Intent (this, MainActivity.class);
        startActivity(intent2);

        Toast.makeText(this, edtNome_prod.getText()+" cadastrado com sucesso", Toast.LENGTH_LONG).show();
    }
}
