package com.piofal.zgadnijliczbe.zgadnij;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import java.util.Random;


public class MainActivity extends ActionBarActivity {

    int userNumber, myNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void wpiszLiczbe(View view) {
        EditText editText = (EditText)findViewById(R.id.editText);
        userNumber = Integer.parseInt(editText.getText().toString());
        String message;

        if (userNumber>myNumber){
            message = "Mój numer jest mniejszy niż twój";
        }
        else if (userNumber<myNumber){
            message = "Mój numer jest większy niż twój";
        }
        else if (userNumber==myNumber){
            message = "Gratulacje! Odgadłeś mój numer";
        }
    }

    public void nowaGra(View view) {
        Random rand = new Random();
        myNumber = rand.nextInt((100-0)+1)+0;
    }
}
