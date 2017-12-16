package com.itla.mudat;

import android.content.Intent;
import android.hardware.fingerprint.FingerprintManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.itla.mudat.Entity.Anuncio;
import com.itla.mudat.Entity.Usuario;
import com.itla.mudat.dao.AnuncioDbo;
import com.itla.mudat.dao.UsuarioDbo;
import com.itla.mudat.view.RegistroUsuario;
import com.itla.mudat.view.listAdapter.AnuncioListAdapter;
import com.itla.mudat.view.listAdapter.UsuarioListAdapter;

import java.util.List;

public class Anuncios extends AppCompatActivity {

    private Button btnMisAnuncios;
    private Button btnAgregarAnuncio;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anuncios);


        btnMisAnuncios= (Button) findViewById(R.id.buttonMisAnuncios);
        btnAgregarAnuncio = (Button) findViewById(R.id.buttonAgregarAnuncio);
        listView =(ListView) findViewById(R.id.listaAnuncio);
        btnAgregarAnuncio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent agregarAnuncio =new Intent(Anuncios.this,AgregarAnuncio.class);

                startActivity(agregarAnuncio);
            }
        });

        AnuncioDbo anuncioDbo =new AnuncioDbo(this);
try {
    List<Anuncio> anuncios = anuncioDbo.buscar();
    Log.i("anuncios", "Cantidad de anuncios:" + anuncios.size());


    listView.setAdapter(new AnuncioListAdapter(anuncios, this));
  listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent rAnuncios= new Intent(Anuncios.this, AgregarAnuncio.class );
                Anuncio a = (Anuncio) adapterView.getItemAtPosition(i);
//
                rAnuncios.putExtra("anuncio", a);
                startActivity(rAnuncios);
            }
        });
} catch (Exception e)
{
    Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_LONG).show();
}


    }
}
