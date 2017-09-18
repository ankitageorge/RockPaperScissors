package com.example.ankitageorge.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;
//name instead of p1, multiplayer
public class MainActivity extends AppCompatActivity {
    int pCPU = 0;
    int pP = 0;
    static final int ROCK = 0;
    static final int PAPER = 1;
    static final int SCISSORS = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton imageButton_rock = (ImageButton) findViewById(R.id.imageButton_rock);
        ImageButton imageButton_paper = (ImageButton) findViewById(R.id.imageButton_paper);
        ImageButton imageButton_scissors = (ImageButton) findViewById(R.id.imageButton_scissors);
        Button button_reset = (Button) findViewById(R.id.button_reset);

        imageButton_rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView editText_player= (TextView) findViewById(R.id.editText_player);
                TextView editText_CPU= (TextView) findViewById(R.id.editText_CPU);
                Random r = new Random();
                int i = r.nextInt(3);
                if(i==ROCK) {
                    String message = "CPU picked rock...";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                    String message2 = "It's a tie!";
                    Toast.makeText(getApplicationContext(), message2, Toast.LENGTH_SHORT).show();
                }
                if(i == PAPER){
                    String message = "CPU picked paper...";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                    String message2 = "CPU Wins!";
                    Toast.makeText(getApplicationContext(), message2, Toast.LENGTH_SHORT).show();
                    ++pCPU;
                    editText_CPU.setText(""+pCPU);
                }
                if(i==SCISSORS) {
                    String message = "CPU picked scissors...";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                    String message2 = "Player 1 Wins!";
                    Toast.makeText(getApplicationContext(), message2, Toast.LENGTH_SHORT).show();
                    ++pP;
                    editText_player.setText(""+pP);
                }

            }
        });
        imageButton_paper.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View view){
        TextView editText_player = (TextView) findViewById(R.id.editText_player);
        TextView editText_CPU = (TextView) findViewById(R.id.editText_CPU);
        Random r = new Random();
        int i = r.nextInt(3);
        if (i == ROCK) {
            String message = "CPU picked rock...";
            Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
            String message2 = "Player 1 Wins!";
            Toast.makeText(getApplicationContext(), message2, Toast.LENGTH_SHORT).show();
            pP++;
            editText_player.setText("" + pP);
        }
        if (i == PAPER) {
            String message = "CPU picked paper...";
            Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
            String message2 = "It's a tie!";
            Toast.makeText(getApplicationContext(), message2, Toast.LENGTH_SHORT).show();
        }
        if (i == SCISSORS) {
            String message = "CPU picked scissors...";
            Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
            String message2 = "CPU Wins!";
            Toast.makeText(getApplicationContext(), message2, Toast.LENGTH_SHORT).show();
            pCPU++;
            editText_CPU.setText("" + pCPU);

        }
    }
    });
        imageButton_scissors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView editText_player= (TextView) findViewById(R.id.editText_player);
                TextView editText_CPU= (TextView) findViewById(R.id.editText_CPU);
                Random r = new Random();
                int i = r.nextInt(3);
                if (i == ROCK) {
                    String message = "CPU picked rock...";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                    String message2 = "CPU Wins!";
                    Toast.makeText(getApplicationContext(), message2, Toast.LENGTH_SHORT).show();
                    pCPU++;
                    editText_CPU.setText(""+pCPU);
                }
                if(i==PAPER){
                    String message = "CPU picked paper...";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                    String message2 = "Player 1 Wins!";
                    Toast.makeText(getApplicationContext(), message2, Toast.LENGTH_SHORT).show();
                    pP++;
                    editText_player.setText(""+pP);
                }
                if(i==SCISSORS) {
                    String message = "CPU picked scissors...";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                    String message2 = "It's a tie!";
                    Toast.makeText(getApplicationContext(), message2, Toast.LENGTH_SHORT).show();
                }
            }
        });

        button_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView editText_player= (TextView) findViewById(R.id.editText_player);
                TextView editText_CPU= (TextView) findViewById(R.id.editText_CPU);
                pP = 0;
                pCPU = 0;
                editText_player.setText(""+pP);
                editText_CPU.setText(""+pCPU);
            }
        });

    }
};







