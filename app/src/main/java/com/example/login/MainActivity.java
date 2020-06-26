package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText usuario, contraseña;
    Button btn_ingreso;
    Button btn_limpiar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_limpiar = (Button) findViewById(R.id.btnLimpiar);
        btn_limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                usuario.setText("");
                contraseña.setText("");
            }
        });

        usuario = (EditText) findViewById(R.id.Usuario);
        contraseña = (EditText) findViewById(R.id.Contraseña);
        btn_ingreso = (Button) findViewById(R.id.btnIngresar);
        btn_ingreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                String txt_usr = usuario.getText().toString();
                String txt_pass = contraseña.getText().toString();
                if (txt_usr.equals("bonilla") && txt_pass.equals("12345"))
                {
                    Intent intent = new Intent(getApplicationContext(),SegundoActivity.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Usuario o Contraseña Errónea", Toast.LENGTH_SHORT).show();
                }


            }

        });


    }


}