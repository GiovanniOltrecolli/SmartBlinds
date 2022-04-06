package com.example.smartblinds;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class Stanza1 extends AppCompatActivity {

    public static final String MyPREFERENCES = "MyPrefs" ;
    public static final String NameR1 = "nameroom1";
    public static final String NRollerRoom1= "NumerOfRollerRoom1";
    public static final String NameRoller1Room1 ="NameOfRoller1Room1";
    public static final String NameRoller2Room1 ="NameOfRoller2Room1";
    public static final String NameRoller3Room1 ="NameOfRoller3Room1";
    public static final String NameRoller4Room1 ="NameOfRoller4Room1";
    public static final String NameRoller5Room1 ="NameOfRoller5Room1";
    public static final String NameRoller6Room1 ="NameOfRoller6Room1";


    SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_stanza1);

        sharedpreferences = getSharedPreferences(MyPREFERENCES, MODE_PRIVATE);
        // imposto un valore di default al numero di tapparelle (2)
        String nu= sharedpreferences.getString(NRollerRoom1,"2");


        Button b1 = findViewById(R.id.t1);
        Button b2 = findViewById(R.id.t2);
        Button b3 = findViewById(R.id.t3);
        Button b4 = findViewById(R.id.t4);
        Button b5 = findViewById(R.id.t5);
        Button b6 = findViewById(R.id.t6);


        switch (nu) {

            case "1": {
                b1.setVisibility(View.VISIBLE);
                b2.setVisibility(View.GONE);
                b3.setVisibility(View.GONE);
                b4.setVisibility(View.GONE);
                b5.setVisibility(View.GONE);
                b6.setVisibility(View.GONE);

                break;
            }
            case "2": {
                b1.setVisibility(View.VISIBLE);
                b2.setVisibility(View.VISIBLE);
                b3.setVisibility(View.GONE);
                b4.setVisibility(View.GONE);
                b5.setVisibility(View.GONE);
                b6.setVisibility(View.GONE);

                break;
            }
            case "3": {
                b1.setVisibility(View.VISIBLE);
                b2.setVisibility(View.VISIBLE);
                b3.setVisibility(View.VISIBLE);
                b4.setVisibility(View.GONE);
                b5.setVisibility(View.GONE);
                b6.setVisibility(View.GONE);

                break;
            }

            case "4":{
                b1.setVisibility(View.VISIBLE);
                b2.setVisibility(View.VISIBLE);
                b3.setVisibility(View.VISIBLE);
                b4.setVisibility(View.VISIBLE);
                b5.setVisibility(View.GONE);
                b6.setVisibility(View.GONE);

            }

            case "5":{
                b1.setVisibility(View.VISIBLE);
                b2.setVisibility(View.VISIBLE);
                b3.setVisibility(View.VISIBLE);
                b4.setVisibility(View.VISIBLE);
                b5.setVisibility(View.VISIBLE);
                b6.setVisibility(View.GONE);
            }

            case "6":{
                b1.setVisibility(View.VISIBLE);
                b2.setVisibility(View.VISIBLE);
                b3.setVisibility(View.VISIBLE);
                b4.setVisibility(View.VISIBLE);
                b5.setVisibility(View.VISIBLE);
                b6.setVisibility(View.VISIBLE);
            }
        }


        //setto il titolo

        String n= sharedpreferences.getString("nameroom1",NameR1);

        TextView title_of_activity= findViewById(R.id.title_of_activity_r1);

        title_of_activity.setText(n);

        // imposto un valore di default del nome dei bottoni delle stanze

        String nameBotton1 = sharedpreferences.getString(NameRoller1Room1,"NameOfRoller1Room1");
        b1.setText(nameBotton1);

        String nameBotton2 = sharedpreferences.getString(NameRoller2Room1,"NameOfRoller2Room1");
        b2.setText(nameBotton2);

        String nameBotton3 = sharedpreferences.getString(NameRoller3Room1,"NameOfRoller3Room1");
        b3.setText(nameBotton3);

        String nameBotton4 = sharedpreferences.getString(NameRoller4Room1,"NameOfRoller4Room1");
        b4.setText(nameBotton4);

        String nameBotton5 = sharedpreferences.getString(NameRoller5Room1,"NameOfRoller5Room1");
        b5.setText(nameBotton5);

        String nameBotton6 = sharedpreferences.getString(NameRoller6Room1,"NameOfRoller6Room1");
        b6.setText(nameBotton6);



    }

    public void gotoRoller1(View view) {

        Intent intent= new Intent(this,Roller1.class);
        startActivity(intent);

    }


    public void gotoRoller2(View view) {

        Intent intent= new Intent(this,Roller2.class);
        startActivity(intent);


    }

    public void gotoRoller3(View view) {

        Intent intent= new Intent(this,Roller3.class);
        startActivity(intent);
    }


}