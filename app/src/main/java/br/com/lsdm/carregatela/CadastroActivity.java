package br.com.lsdm.carregatela;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    }

    public void voltarMain(View view) {
        //Intent chamaJanela = new Intent(this, MainActivity.class);
        //startActivity(chamaJanela);

        finish();
    }
}