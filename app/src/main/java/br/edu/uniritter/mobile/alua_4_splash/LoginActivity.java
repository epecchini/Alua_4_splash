package br.edu.uniritter.mobile.alua_4_splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void abrirMainActivity(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void abrirFirstActivity(View view){
        EditText nome = (EditText)findViewById(R.id.editTextTextPersonName);
        EditText senha = (EditText)findViewById(R.id.editTextTextPassword);
        //
        if(!nome.getText().toString().isEmpty() && !senha.getText().toString().isEmpty() && nome.getText().toString().equals(senha.getText().toString())) {
            Intent intent = new Intent(this, FirstActivity.class);
            intent.putExtra("nomeInformado",nome.getText().toString());
            startActivity(intent);
        } else {
            Toast.makeText(this,"Senha inválida!",Toast.LENGTH_LONG).show();
        }
    }
}