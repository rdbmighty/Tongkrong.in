package com.example.tongkrongin.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.tongkrongin.R;

public class LoginActivity extends AppCompatActivity {

    private EditText username,password;
    private Button login;
    private TextView register;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText)findViewById(R.id.edt_username);
        password = (EditText)findViewById(R.id.edt_password);
        login = (Button)findViewById(R.id.btn_login);
        register = (TextView)findViewById(R.id.btn_register);


//        login.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                validate(username.getText().toString(), password.getText().toString());
//            }
//        }
//        );

        login = (Button)findViewById(R.id.btn_login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextActivity();
            }
        });

        register = (TextView) findViewById(R.id.btn_register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RegActivity();
            }
        });

    }

    public void nextActivity(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void RegActivity(){
        Intent intent = new Intent(this,RegisterActivity.class);
        startActivity(intent);
    }

//    private void validate(String userName, String userPassword){
//        if ((userName == "Admin")&&(userPassword == "1234")){
//            Intent intent = new Intent(LoginActivity.this,MainActivity.class);
//            startActivity(intent);
//        }
//    }
}