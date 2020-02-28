package com.example.tongkrongin.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.tongkrongin.Activity.LoginActivity;
import com.example.tongkrongin.Activity.MainActivity;
import com.example.tongkrongin.Fragment.ProfileFragment;
import com.example.tongkrongin.R;

public class EditProfileActivity extends AppCompatActivity {

    private EditText name,username,password;
    private Button save,back;
    //    private TextView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);



        save = (Button) findViewById(R.id.btn_SavePro);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Save();
            }
        });

        back = (Button) findViewById(R.id.btn_Back_pro);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bAcK();
            }
        });

    }

    public void Save(){
        Intent intent = new Intent(this, MainActivity.class);

        startActivity(intent);
    }

    public void bAcK(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
