package com.example.nctbbookof1to6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void web1(View view) {
        Intent intent = new Intent(MainActivity.this, BanglaActivity.class);
        startActivity(intent);
    }

    public void web2(View view) {

    Intent intent = new Intent(MainActivity.this, English.class);
    startActivity(intent);
    }
    public void web3(View view) {
        Intent intent = new Intent(MainActivity.this, Math.class);
        startActivity(intent);
    }

    public void web4(View view) {
        Intent intent = new Intent(MainActivity.this, Science.class);
        startActivity(intent);
    }

    public void web5(View view) {
        Intent intent = new Intent(MainActivity.this, Social.class);
        startActivity(intent);
    }

    public void web6(View view) {
        Intent intent = new Intent(MainActivity.this, ICT.class);
        startActivity(intent);
    }

    public void web7(View view) {
    }

    public void web8(View view) {
    }

    public void web9(View view) {
        Intent intent = new Intent(MainActivity.this, About.class);
        startActivity(intent);
    }
}
