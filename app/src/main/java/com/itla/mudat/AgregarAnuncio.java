package com.itla.mudat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.itla.mudat.Entity.Anuncio;
import com.itla.mudat.dao.AnuncioDbo;

public class AgregarAnuncio extends AppCompatActivity {


    private static final String LOG_T = "AgregarAnuncio";
    private EditText txCategoria;
    private EditText txUsuario;
    private EditText txFecha;
    private EditText txCondicion;
    private  EditText txPrecio;
    private EditText txTitulo;
    private EditText txUbicacion;
    private EditText txDetalle;
    private Button btnGuardar;

    private AnuncioDbo anuncioDbo;
    Anuncio anuncio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_anuncio);

        anuncio = new Anuncio();

        txCategoria = (EditText) findViewById(R.id.editTextCategoria);
        txUsuario = (EditText) findViewById(R.id.editTextUsuario);
        txFecha = (EditText) findViewById(R.id.editTextFecha);
        txCondicion = (EditText) findViewById(R.id.editTextCondicion);
        txPrecio = (EditText) findViewById(R.id.editTextPrecio);
        txTitulo = (EditText) findViewById(R.id.editTextTitulo);
        txUbicacion = (EditText) findViewById(R.id.editTextUbicacion);
        txDetalle = (EditText) findViewById(R.id.editTextDetalle);
        btnGuardar = (Button) findViewById(R.id.buttonGuardarAnuncio);


        anuncioDbo = new AnuncioDbo(this);

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               // anuncio.setCategoria(txCategoria.getText().toString());
               // anuncio.setUsuario(txUsuario.getText().toString());
              //  anuncio.setFecha(txFecha.getText().toString());
                anuncio.setCondicion(txCondicion.getText().toString());
               // anuncio.setPrecio(txPrecio.getText().toString());
                anuncio.setTitulo(txTitulo.getText().toString());
                anuncio.setUbicacion(txUbicacion.getText().toString());
                anuncio.setDetalle(txDetalle.getText().toString());

                Log.i(LOG_T, "Agregando Anuncio" + anuncio.toString());

            }
        });




    }
}
