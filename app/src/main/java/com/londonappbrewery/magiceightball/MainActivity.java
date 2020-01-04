package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button askButton=findViewById(R.id.askButton);
        final ImageView ball_Image=findViewById(R.id.ball_Image);

        final int[]answers={R.drawable.ball1,R.drawable.ball2,R.drawable.ball3,R.drawable.ball4,R.drawable.ball5};

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random ranGenerator=new Random();
                int ansNumber= ranGenerator.nextInt(5);
                ball_Image.setImageResource(answers[ansNumber]);
            }
        });

    }
}
