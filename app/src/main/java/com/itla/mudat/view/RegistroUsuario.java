package com.itla.mudat.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.itla.mudat.Entity.TipoDeUsuario;
import com.itla.mudat.Entity.Usuario;
import com.itla.mudat.R;

public class RegistroUsuario extends AppCompatActivity {


    private EditText txNombre;
    private EditText txTipoUsuario;
    private EditText txIdentificacion;
    private EditText txEmail;
    private EditText txTelefono;
    private EditText txClave;
    private EditText txEstatus;
    private Button btGuardar;
    private Usuario usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_usuario);


        txNombre = (EditText) findViewById(R.id.editTextNombre);
        txTipoUsuario = (EditText) findViewById(R.id.editTextTipoUsuario);
        txIdentificacion = (EditText) findViewById(R.id.editTextIdentificacion);
        txEmail = (EditText) findViewById(R.id.editTextEmail);
        txTelefono = (EditText) findViewById(R.id.editTextTelefono);
        txClave = (EditText) findViewById(R.id.editTextClave);
        txEstatus = (EditText) findViewById(R.id.editTextEstatus);
        btGuardar = (Button) findViewById(R.id.buttonGuardar);

        usuario = new Usuario();


        btGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                usuario.setNombre(txNombre.getText().toString());
                usuario.setIdentificacion(txIdentificacion.getText().toString());
                usuario.setClave(txClave.getText().toString());
                usuario.setEstatus(true);
                usuario.setTelefono(txTelefono.getText().toString());
                usuario.setEmail(txEmail.getText().toString());


                Toast.makeText(RegistroUsuario.this, usuario.toString(),Toast.LENGTH_LONG).show();
            }
        });


    }
}
