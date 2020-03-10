package com.example.class08shareprefarence;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnLogin;

    private static  PrefConfig prefConfig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnLogin = findViewById(R.id.loginId);

        prefConfig =new PrefConfig(MainActivity.this);

        if (prefConfig.readLoginStatus()){
            Intent secondActivity = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(secondActivity);
            finish();
        }



        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent secondActivity = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(secondActivity);
                finish();
            }
        });

    }
}
