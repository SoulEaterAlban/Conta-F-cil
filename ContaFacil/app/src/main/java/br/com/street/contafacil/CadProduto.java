package br.com.street.contafacil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.security.PrivateKey;

public class CadProduto extends AppCompatActivity {


    private TextInputLayout edtNome_prod;
    private TextInputLayout edtQtd_Prod;
    private TextInputLayout edtPotenc_Prod;
    private TextInputLayout edtDias_Uso;
    private TextInputLayout edtTempo_uso;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cad_produto);

        edtNome_prod    = findViewById(R.id.edtNome_prod);
        edtQtd_Prod     = findViewById(R.id.edtQtd_Prod);
        edtPotenc_Prod  = findViewById(R.id.edtPotenc_Prod);
        edtDias_Uso     = findViewById(R.id.edtDias_Uso);
        edtTempo_uso    = findViewById(R.id.edtTempo_uso);

    }
    public void sendMessage(View view){
        //Chamar outra activity
        Intent intent2 = new Intent (this, MainActivity.class);
        startActivity(intent2);

        Toast.makeText(this, edtNome_prod.getEditText().getText().toString()+
                " cadastrado com sucesso", Toast.LENGTH_LONG).show();
    }
    public void DescartarProd(View view){
        Intent intent2 = new Intent (this, MainActivity.class);
        startActivity(intent2);

        Toast.makeText(this, "Produto descartado", Toast.LENGTH_SHORT).show();
    }
}
