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
    public static final String NRoller= "NumerOfRoller";
    public static final String NameRoller1 ="NameOfRoller1";
    public static final String NameRoller2 ="NameOfRoller2";
    public static final String NameRoller3 ="NameOfRoller3";
    public static final String NameRoller4 ="NameOfRoller4";
    public static final String NameRoller5 ="NameOfRoller5";
    public static final String NameRoller6 ="NameOfRoller6";


    SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_stanza1);

        sharedpreferences = getSharedPreferences(MyPREFERENCES, MODE_PRIVATE);
        // imposto un valore di default al numero di tapparelle (2)
        String nu= sharedpreferences.getString(NRoller,"2");

        // imposto un valore di default al numero di tapparelle nello spinner
        Spinner spinner_number = findViewById(R.id.number_spinner_r1);
        spinner_number.setSelection((Integer.parseInt(nu)) -1);


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

    }



    public void number_roller(View view){

        Button b1, b2, b3, b4, b5, b6;


        Spinner spinner = findViewById(R.id.number_spinner_r1);
        String string = String.valueOf(spinner.getSelectedItem());
        b3 = findViewById(R.id.t3);
        b1 = findViewById(R.id.t1);
        b2 = findViewById(R.id.t2);
        b4 = findViewById(R.id.t4);
        b5 = findViewById(R.id.t5);
        b6 = findViewById(R.id.t6);

        switch(string){

            case "1" :{
                b1.setVisibility(View.VISIBLE);
                b2.setVisibility(View.GONE);
                b3.setVisibility(View.GONE);
                b4.setVisibility(View.GONE);
                b5.setVisibility(View.GONE);
                b6.setVisibility(View.GONE);
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString(NRoller,string);
                editor.apply();
                break;

            }
            case "2": {
                b1.setVisibility(View.VISIBLE);
                b2.setVisibility(View.VISIBLE);
                b3.setVisibility(View.GONE);
                b4.setVisibility(View.GONE);
                b5.setVisibility(View.GONE);
                b6.setVisibility(View.GONE);
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString(NRoller,string);
                editor.apply();
                break;
            }
            case "3": {
                b1.setVisibility(View.VISIBLE);
                b2.setVisibility(View.VISIBLE);
                b3.setVisibility(View.VISIBLE);
                b4.setVisibility(View.GONE);
                b5.setVisibility(View.GONE);
                b6.setVisibility(View.GONE);
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString(NRoller,string);
                editor.apply();
                break;
            }

            case "4":{
                b1.setVisibility(View.VISIBLE);
                b2.setVisibility(View.VISIBLE);
                b3.setVisibility(View.VISIBLE);
                b4.setVisibility(View.VISIBLE);
                b5.setVisibility(View.GONE);
                b6.setVisibility(View.GONE);
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString(NRoller,string);
                editor.apply();
                break;
            }
            case "5":{
                b1.setVisibility(View.VISIBLE);
                b2.setVisibility(View.VISIBLE);
                b3.setVisibility(View.VISIBLE);
                b4.setVisibility(View.VISIBLE);
                b5.setVisibility(View.VISIBLE);
                b6.setVisibility(View.GONE);
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString(NRoller,string);
                editor.apply();
                break;
            }
            case "6":{
                b1.setVisibility(View.VISIBLE);
                b2.setVisibility(View.VISIBLE);
                b3.setVisibility(View.VISIBLE);
                b4.setVisibility(View.VISIBLE);
                b5.setVisibility(View.VISIBLE);
                b6.setVisibility(View.VISIBLE);
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString(NRoller,string);
                editor.apply();
                break;
            }
        }
    }


    public void vis_settings_r1(View view){

        Button b1,b2;
        EditText editText;
        Spinner spinner_number, spinner_name;

        b1 = findViewById(R.id.b_enter_r1);
        b2 = findViewById(R.id.b_enter1_r1);
        editText = findViewById(R.id.name_r1);
        spinner_number=findViewById(R.id.number_spinner_r1);
        spinner_name= findViewById(R.id.name_spinner_r1);

        if (b1.getVisibility() == View.VISIBLE) {

            b1.setVisibility(View.GONE);
            b2.setVisibility(View.GONE);
            editText.setVisibility(View.GONE);
            spinner_number.setVisibility(View.GONE);
            spinner_name.setVisibility(View.GONE);

        }
        else{
            b1.setVisibility(View.VISIBLE);
            b2.setVisibility(View.VISIBLE);
            editText.setVisibility(View.VISIBLE);
            spinner_number.setVisibility(View.VISIBLE);
            spinner_name.setVisibility(View.VISIBLE);
        }


    }
    // quando verranno create le altre activity "roller" scrivere il codice per cambiare il nome del loro titolo
    public void change_name_r1(View view){

        Spinner spinner, spinner_number;
        EditText editText;

        editText = findViewById(R.id.name_r1);
        String name = editText.getText().toString();
        spinner = findViewById(R.id.name_spinner_r1);
        String string = String.valueOf(spinner.getSelectedItem());

        spinner_number = findViewById(R.id.number_spinner_r1);
        String number = String.valueOf(spinner_number.getSelectedItem());

        switch (string) {
            case "1": {
                Button b1 = findViewById(R.id.t1);
                b1.setText(name);
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString(NameRoller1, name);
                editor.apply();

                if((Integer.parseInt(number))>1)

                    spinner.setSelection(Integer.parseInt(string));

                break;
            }

            case "2": {
                if((Integer.parseInt(number))>=2){

                    Button b2 = findViewById(R.id.t2);
                    b2.setText(name);
                    SharedPreferences.Editor editor = sharedpreferences.edit();
                    editor.putString(NameRoller2, name);
                    editor.apply();

                }


                else {
                    CharSequence text = "Error: number of roller selected exceded number of rollers";
                    int duration = Toast.LENGTH_LONG;
                    Toast toast = Toast.makeText(this,text,duration);
                    toast.show();
                }

                if((Integer.parseInt(number))>2)

                    spinner.setSelection(Integer.parseInt(string));



                break;
            }

            case "3": {

                if((Integer.parseInt(number))>=3){
                    Button b3 = findViewById(R.id.t3);
                    b3.setText(name);
                    SharedPreferences.Editor editor = sharedpreferences.edit();
                    editor.putString(NameRoller3, name);
                    editor.apply();
                }
                else{
                    CharSequence text = "Error: number of roller selected exceded number of rollers";
                    int duration = Toast.LENGTH_LONG;
                    Toast toast = Toast.makeText(this,text,duration);
                    toast.show();
                }

                if((Integer.parseInt(number))>3)

                    spinner.setSelection(Integer.parseInt(string));


                break;
            }
            case "4": {

                if ((Integer.parseInt(number)) >= 4) {
                    Button b4 = findViewById(R.id.t4);
                    b4.setText(name);SharedPreferences.Editor editor = sharedpreferences.edit();
                    editor.putString(NameRoller4, name);
                    editor.apply();

                }
                else{
                    CharSequence text = "Error: number of roller selected exceded number of rollers";
                    int duration = Toast.LENGTH_LONG;
                    Toast toast = Toast.makeText(this,text,duration);
                    toast.show();
                }
                if((Integer.parseInt(number))>4)

                    spinner.setSelection(Integer.parseInt(string));
                break;
            }
            case "5": {

                if((Integer.parseInt(number)) >= 5){
                    Button b5 = findViewById(R.id.t5);
                    b5.setText(name);
                    SharedPreferences.Editor editor = sharedpreferences.edit();
                    editor.putString(NameRoller5, name);
                    editor.apply();
                }
                else {
                    CharSequence text = "Error: number of roller selected exceded number of rollers";
                    int duration = Toast.LENGTH_LONG;
                    Toast toast = Toast.makeText(this,text,duration);
                    toast.show();
                }

                if((Integer.parseInt(number))>5)

                    spinner.setSelection(Integer.parseInt(string));
                break;
            }
            case "6": {

                if((Integer.parseInt(number)) >= 6){
                    Button b6 = findViewById(R.id.t6);
                    b6.setText(name);
                    SharedPreferences.Editor editor = sharedpreferences.edit();
                    editor.putString(NameRoller6, name);
                    editor.apply();
                }
                else {
                    CharSequence text = "Error: number of roller selected exceded number of rollers";
                    int duration = Toast.LENGTH_LONG;
                    Toast toast = Toast.makeText(this,text,duration);
                    toast.show();
                }
                if((Integer.parseInt(number))>6)

                    spinner.setSelection(Integer.parseInt(string));
                break;
            }


        }

    }



    public void gotoRoller1(View view) {

        Intent intent= new Intent(this,Roller1.class);
        startActivity(intent);

    }

    /*
    public void gotoRoller2(View view) {

        Intent intent= new Intent(this,Roller2.class);
        startActivity(intent);


        Button button;

        button = findViewById(R.id.t2);
        String name =button.getText().toString();

        Intent nuovoTitolo = new Intent(this, Roller2.class);
        nuovoTitolo.putExtra("Titolo", name);
        startActivity(nuovoTitolo);
    }

    public void gotoRoller3(View view) {

        Intent intent= new Intent(this,Roller3.class);
        startActivity(intent);


        Button button;

        button = findViewById(R.id.t3);
        String name =button.getText().toString();

        Intent nuovoTitolo = new Intent(this, Roller3.class);
        nuovoTitolo.putExtra("Titolo", name);
        startActivity(nuovoTitolo);
    }

*/


}