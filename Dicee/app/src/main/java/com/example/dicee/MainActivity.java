package com.example.dicee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final int[] diceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6,
        };

        Button rollButton;
        rollButton =  findViewById(R.id.roll_button);

        final ImageView leftDice = findViewById(R.id.image_Leftdice);
        final ImageView rightDice = findViewById(R.id.image_Rightdice);

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dicee","This is gay" );

                Random randgen = new Random();

                int number = randgen.nextInt(6);
                int num = randgen.nextInt(6);
                Log.d("Dicee","The random number is "+ number);

                leftDice.setImageResource(diceArray[number]);
                rightDice.setImageResource(diceArray[num]);
            }
        });
    }
}