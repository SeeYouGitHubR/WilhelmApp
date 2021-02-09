package com.example.wilhelmapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUi();

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InsertData();
            }
        });
    }


    private boolean checkFIllIn()
    {
        return true;
    }

    private void initUi()
    {
        submit = findViewById(R.id.btn_submit);
    }


    public void InsertData() {
        //String username = UsernameEt.getText().toString();
        //String password = PasswordEt.getText().toString();
        String type = "login";
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
      //  backgroundWorker.execute(type, username, password);
    }



}