package com.vietle.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Random;

import static android.support.v7.widget.AppCompatDrawableManager.get;

public class MainActivity extends AppCompatActivity {

    int i1;

    public void highOrlow(View view) {
        EditText enterNumber = (EditText) findViewById(R.id.enterNumber);
        int guessInt = Integer.parseInt(enterNumber.getText().toString());

        if (guessInt>i1){
            Toast.makeText(MainActivity.this, "Too high", Toast.LENGTH_LONG).show();
            Log.i("guess", enterNumber.getText().toString());
        }
        else if (guessInt<i1){
            Toast.makeText(MainActivity.this, "Too low", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(MainActivity.this,"Congratulations",Toast.LENGTH_LONG).show();

            Random r = new Random();
            i1 = r.nextInt(100 - 1) + 1;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random r = new Random();
        i1 = r.nextInt(100 - 1) + 1;
    }
}
