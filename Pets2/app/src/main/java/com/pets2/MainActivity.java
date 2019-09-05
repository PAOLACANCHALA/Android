package com.pets2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText email;
    private EditText password;
    private Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = (EditText)findViewById(R.id.etEmail);
        password= (EditText) findViewById(R.id.etPassword);
        login=(Button) findViewById(R.id.btnLogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(email.getText().toString(),password.getText().toString());

            }

        });





    }

    private void validate(String userName, String userPassword){

        if((userName.equals("admin")) && (userPassword.equals("1234"))){

            Intent intent=new Intent (MainActivity.this, Menu.class);
            startActivity(intent);
        }
    }
}
