package com.example.tomcoapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private  static int Time_splash = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openmainmenu();
    }
    private void openmainmenu(){
       new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {
               Intent intent = new Intent(MainActivity.this,T_list.class);
               startActivity(intent);
               finish();
           }
       },Time_splash);



    }
}

 /*Button next = (Button)findViewById(R.id.but06);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity.this,T_list.class);
                startActivity(i);

            }
        });
        */



