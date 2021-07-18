package com.example.higherorlowerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randnumb;

    public void guessNumber(View viwe){
        EditText input= findViewById(R.id.input);
        TextView output = findViewById(R.id.output);


        String stringInput =input.getText().toString();
        int intInput = Integer.parseInt(stringInput);


        if (intInput > randnumb) {
            output.setText(" HIGHER !");
        }
        else if(intInput < randnumb){
            output.setText("LOWER !");
        }
        else{
            output.setText("Correct it is "+intInput+"!");
        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random random = new Random();
        int upper = 21;
        randnumb = random.nextInt(upper);
    }
}