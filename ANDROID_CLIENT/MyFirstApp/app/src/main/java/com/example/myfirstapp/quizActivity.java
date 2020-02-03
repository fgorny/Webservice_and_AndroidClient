package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class quizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);


         String elo; {

            String[] quiz = new String[4];
            quiz[0] = "pyt1";
            quiz[1] = "pyt2";
            quiz[2] = "pyt3";
            quiz[3] = "pyt4";

            Random r = new Random();

            TextView pytTextView = findViewById(R.id.pyt);

            pytTextView.setText("Pytanie: " + quiz[r.nextInt(4)] );

            //pytTextView.setText(Build.PYT);

        }
    }
}
