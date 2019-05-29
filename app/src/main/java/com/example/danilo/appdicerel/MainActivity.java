package com.example.danilo.appdicerel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton = findViewById(R.id.rollButton);

        final ImageView imageLeft = findViewById(R.id.image_leftDice);

        final ImageView imageRight = findViewById(R.id.image_rightDice);

        final int [] diceeArray = { //final torna o array constante
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Log.d("Dice", "Clique no botão!");
                Random numberRandom = new Random();
                int number = numberRandom.nextInt(6); //aleatório [0,5];
                imageLeft.setImageResource(diceeArray[number]);
                number = numberRandom.nextInt(6);
                imageRight.setImageResource(diceeArray[number]);
                Toast.makeText(MainActivity.this, "Clique do botão!", Toast.LENGTH_LONG).show();
            }
        });

    }
}
