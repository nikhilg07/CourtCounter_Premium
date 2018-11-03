package com.example.hppc.courtcounter;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.graphics.Color;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private int sum1 = 0;
    private int sum2 = 0;
    private String variable = "Team A Won";

    protected void decision(){
        if(sum2 > sum1)
            variable="Team B Won";
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int itemThatWasClickedId = item.getItemId();
        if (itemThatWasClickedId == R.id.action_aboutTheGame)
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setCancelable(true);
            builder.setTitle("About The Game");
            builder.setMessage("" + "This is a basic score counter game. Every team has five turns and they have to play it turn by turn. The game will end after pressing the button Reset.");
            builder.setPositiveButton("OK",null);
            builder.show();
            Toast.makeText(MainActivity.this, "About The Game", Toast.LENGTH_SHORT).show();
            return true;
        }
       if (itemThatWasClickedId == R.id.action_aboutMe)
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setCancelable(true);
            builder.setTitle("About Me");
            builder.setMessage("" + "This is the first Android App made by Hargun Singh Sahni");
            builder.setPositiveButton("OK",null);
            builder.show();
            Toast.makeText(MainActivity.this, "About Me", Toast.LENGTH_SHORT).show();
            return true;
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button = findViewById(R.id.button);
        button.setTextColor(Color.RED);
        final TextView textview = (TextView) findViewById(R.id.textView6);
        final TextView textview_2 = (TextView) findViewById(R.id.textView7);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sum1 = sum1 + 3;
                textview.setText("" + sum1);
            }
        });
        final Button button2 = findViewById(R.id.button2);
        button2.setTextColor(Color.RED);
        textview_2.setText("" + sum2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sum1 = sum1 + 2;
                textview.setText("" + sum1);
            }
        });
        final Button button3 = findViewById(R.id.button3);
        button3.setTextColor(Color.RED);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sum1 = sum1 + 0;
                textview.setText("" + sum1);
            }
        });
        final Button button4 = findViewById(R.id.button4);
        button4.setTextColor(Color.RED);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sum2 = sum2 + 3;
                textview_2.setText("" + sum2);
            }
        });
        final Button button5 = findViewById(R.id.button5);
        button5.setTextColor(Color.RED);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sum2 = sum2 + 2;
                textview_2.setText("" + sum2);
            }
        });
        final Button button6 = findViewById(R.id.button6);
        button6.setTextColor(Color.RED);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sum2 = sum2 + 0;
                textview_2.setText("" + sum2);
            }
        });
        final Button button8 = findViewById(R.id.button8);
        button8.setTextColor(Color.BLACK);
        button8.setOnClickListener(
                new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview.setText("" + 0);
                textview_2.setText("" + 0);
                sum1 = 0;
                sum2 = 0;
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setCancelable(true);
                builder.setTitle("Result : ");
                decision();
                builder.setMessage("" + variable);
                builder.setPositiveButton("OK",null);
                builder.show();
            }
        });
        final Button button7 = findViewById(R.id.button7);
        button7.setTextColor(Color.BLACK);
        button7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i=new Intent(MainActivity.this,Main2Activity.class);
                        decision();
                        i.putExtra("KEY",variable);
                        startActivity(i);

                    }
                });
    }
}
