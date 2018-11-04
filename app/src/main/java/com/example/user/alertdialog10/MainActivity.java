package com.example.user.alertdialog10;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    LinearLayout LL1;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    AlertDialog.Builder adb;
    int r,g,b;
    Random rnd = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        LL1 = (LinearLayout) findViewById(R.id.LL1);


    }

    public void ome1(View view) {

        adb = new AlertDialog.Builder(this);

        adb.setTitle("hello");
        adb.setMessage("only text");

        AlertDialog ad = adb.create();
        ad.show();
    }

    public void ome2(View view) {

        adb = new AlertDialog.Builder(this);

        adb.setTitle("hello");
        adb.setMessage("only text");
        adb.setIcon(R.drawable.hamster);
        AlertDialog ad = adb.create();
        ad.show();

    }

    public void ome3(View view) {

        adb = new AlertDialog.Builder(this);

        adb.setTitle("hello");
        adb.setMessage("only text");
        adb.setIcon(R.drawable.hamster);
        adb.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        AlertDialog ad = adb.create();
        ad.show();
    }

    public void ome4(View view) {

        r=rnd.nextInt(255);
        g=rnd.nextInt(255);
        b=rnd.nextInt(255);

        adb.setTitle("change the background");
        adb.setMessage("you want to change the color?");
        adb.setIcon(R.drawable.hamster);
        adb.setPositiveButton("change color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                LL1.setBackgroundColor(Color.rgb(r,g,b));


            }
        });
        adb.setNegativeButton("close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        AlertDialog ad = adb.create();
        ad.show();
    }

    public void ome5(View view){
        r=rnd.nextInt(255);
        g=rnd.nextInt(255);
        b=rnd.nextInt(255);

        adb.setTitle("change the background");
        adb.setMessage("you want to change the color?");
        adb.setIcon(R.drawable.hamster);
        adb.setPositiveButton("change color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                LL1.setBackgroundColor(Color.rgb(r,g,b));


            }
        });
        adb.setNeutralButton("rest", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                LL1.setBackgroundColor(Color.WHITE);

            }
        });
        adb.setNegativeButton("close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        AlertDialog ad = adb.create();
        ad.show();
    }

    public boolean onCreateOptionsMenu (Menu menu) {

        getMenuInflater().inflate(R.menu.main, menu);
        return true;

    }

    public boolean onOptionsItemSelected(MenuItem item){

        int nextActivity = item.getItemId();
        if (nextActivity == R.id.NextActivity) {
            Intent go = new Intent(this, Main2Activity.class);
            startActivity(go);
        }

        return true;

    }
}

