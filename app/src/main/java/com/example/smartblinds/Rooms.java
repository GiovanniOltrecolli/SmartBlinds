package com.example.smartblinds;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Rooms extends AppCompatActivity {
    public static final String MyPREFERENCES = "MyPrefs" ;
    public static final String NameR1 = "nameroom1";
    public static final String NameR2 = "nameroom2";
    public static final String NameR3 = "nameroom2";
    public static final String NRooms = "numberRooms";
    SharedPreferences sharedpreferences;
    Button b1;
    Button b2;
    Button b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rooms);

        sharedpreferences = getSharedPreferences(MyPREFERENCES, MODE_PRIVATE);

        // imposto un valore di default al numero di stanze (1)
        String n= sharedpreferences.getString(NRooms,"1");

        // imposto un valore di default al numero di stanze nello spinner
        // Spinner spinner_number = findViewById(R.id.planets_spinner);
        // spinner_number.setSelection((Integer.parseInt(n)) -1);

        // in base al numero di stanze selezionate rendo visibili o no i bottoni per accedere alle stanze

        switch (n) {

            case "1": {
                b3 = findViewById(R.id.r3);
                b1 = findViewById(R.id.r1);
                b2 = findViewById(R.id.r2);
                b1.setVisibility(View.VISIBLE);
                b2.setVisibility(View.GONE);
                b3.setVisibility(View.GONE);
                break;
            }
            case "2": {
                b3 = findViewById(R.id.r3);
                b1 = findViewById(R.id.r1);
                b2 = findViewById(R.id.r2);
                b1.setVisibility(View.VISIBLE);
                b2.setVisibility(View.VISIBLE);
                b3.setVisibility(View.GONE);
                break;
            }
            case "3": {
                b3 = findViewById(R.id.r3);
                b1 = findViewById(R.id.r1);
                b2 = findViewById(R.id.r2);
                b1.setVisibility(View.VISIBLE);
                b2.setVisibility(View.VISIBLE);
                b3.setVisibility(View.VISIBLE);
                break;
            }
        }

        // imposto un valore di default del nome dei bottoni delle stanze

        String nameBotton1 = sharedpreferences.getString(NameR1,"Rooms 1");
        b1.setText(nameBotton1);

        String nameBotton2 = sharedpreferences.getString(NameR2,"Rooms 2");
        b2.setText(nameBotton2);

        String nameBotton3 = sharedpreferences.getString(NameR3,"Rooms 3");
        b3.setText(nameBotton3);

    }


    public void  gotoRoom1(View view){
        Intent intent= new Intent(this,Stanza1.class);
        startActivity(intent);

    }
    public void  gotoRoom2(View view){

        Intent intent= new Intent(this,Stanza2.class);
        startActivity(intent);

    }
    public void  gotoRoom3(View view){
        Intent intent= new Intent(this,Stanza3.class);
        startActivity(intent);

    }
}