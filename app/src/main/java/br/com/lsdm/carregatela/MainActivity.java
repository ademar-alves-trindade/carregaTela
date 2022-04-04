package br.com.lsdm.carregatela;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //MÉTODO DO BOTÃO COM O PARÂMETRO VIEW
    //NECESSITA DE UM OBJETO COM A INTEÇÃO DE CHAMAR UMA NOVA JANELA
    //USA A CLASSE INTERNA DO JAVA --> INTENT
    public void chamaCadastro(View view) {
        Intent chamaJanela = new Intent(MainActivity.this, CadastroActivity.class);
        startActivity(chamaJanela);
    }
}