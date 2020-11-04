package com.eggy.myprofile;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout linProfile, linInput, linInfo, linExit;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        linProfile = (LinearLayout) findViewById(R.id.ll_profile);
        linInput = (LinearLayout) findViewById(R.id.ll_input);
        linInfo = (LinearLayout) findViewById(R.id.ll_info);
        linExit = (LinearLayout) findViewById(R.id.ll_exit);


        linProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentProfile = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intentProfile);
            }
        });

        linInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentInput = new Intent(MainActivity.this, InputDataActivity.class);
                startActivity(intentInput);
            }
        });
        linInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentInfo = new Intent(MainActivity.this, InfoActivity.class);
                startActivity(intentInfo);
            }
        });

        linExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });




    }



}

