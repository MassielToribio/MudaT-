package com.itla.mudat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.itla.mudat.view.RegistroUsuario;

public class Anuncios extends AppCompatActivity {

    private Button btnMisAnuncios;
    private Button btnAgregarAnuncio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anuncios);


        btnMisAnuncios= (Button) findViewById(R.id.buttonMisAnuncios);
        btnAgregarAnuncio = (Button) findViewById(R.id.buttonAgregarAnuncio);

        btnAgregarAnuncio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent agregarAnuncio =new Intent(Anuncios.this,AgregarAnuncio.class);

                startActivity(agregarAnuncio);
            }
        });

    }
}
