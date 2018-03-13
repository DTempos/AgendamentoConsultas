package com.example.android.brewerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        ImageView imagem_tela_inicial = findViewById(R.id.imagem_tela_inicial);


        TextView txt_inicial = (TextView) findViewById(R.id.textView2);

        Button botao_Login = (Button) findViewById(R.id.botao_login);

        botao_Login.setOnClickListener(clickLogin());
    }

    protected View.OnClickListener clickLogin() {
        return new View.OnClickListener() {
            public void onClick(View view) {

                Intent it = new Intent(MainActivity.this,
                        TelaInicialActivity.class);
                startActivity(it);
            }
        };

    }
}

