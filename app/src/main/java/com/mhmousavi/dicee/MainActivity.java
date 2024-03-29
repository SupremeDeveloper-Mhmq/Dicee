package com.mhmousavi.dicee;

import android.support.v7.app.AppCompatActivity;
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

        Button rollButton;
rollButton = (Button) findViewById(R.id.rollButton);
       final ImageView Dice = (ImageView) findViewById(R.id.image_Dice);
int[] DiceArray ={
        R.drawable.dice1,
        R.drawable.dice2,
        R.drawable.dice3,
        R.drawable.dice4,
        R.drawable.dice5,
        R.drawable.dice6
};
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(6);
                Log.d("Dicee","The Random number is "+number);
                Dice.setImageResource(DiceArray[number]);
            }
        });

    }
}