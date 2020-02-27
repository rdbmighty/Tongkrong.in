package com.example.tongkrongin.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.tongkrongin.R;

public class RegisterActivity extends AppCompatActivity {

    private EditText name,username,password;
    private Button signup,back;
//    private TextView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);



        signup = (Button) findViewById(R.id.btn_Signup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Signup();
            }
        });

        back = (Button) findViewById(R.id.btn_Back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bACK();
            }
        });

    }

    public void Signup(){
        Intent intent = new Intent(this,LoginActivity.class);
        startActivity(intent);
    }

    public void bACK(){
        Intent intent = new Intent(this,LoginActivity.class);
        startActivity(intent);
    }
    }

