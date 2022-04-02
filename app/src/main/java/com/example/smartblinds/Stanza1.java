package com.example.smartblinds;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class Stanza1 extends AppCompatActivity {

    public static final String MyPREFERENCES = "MyPrefs" ;
    public static final String NameR1 = "nameroom1";
    SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_stanza1);

        Button b1 = findViewById(R.id.t1);
        Button b2 = findViewById(R.id.t2);
        Button b3 = findViewById(R.id.t3);
        Button b4 = findViewById(R.id.t4);
        Button b5 = findViewById(R.id.t5);
        Button b6 = findViewById(R.id.t6);

        b1.setVisibility(View.GONE);
        b2.setVisibility(View.GONE);
        b3.setVisibility(View.GONE);
        b4.setVisibility(View.GONE);
        b5.setVisibility(View.GONE);
        b6.setVisibility(View.GONE);

     /*   //prendo l'intent e metto in name_of_activity la stringa passata
        String name = getIntent().getExtras().getString("Titolo");

        // prendo l'id della text view di cui voglio cambiare il nome
        TextView title_of_activity= findViewById(R.id.title_of_activity_r1);


        //applico il metodo .setText per settare il campo di testo della TextView con il nome passato dall'intent
       title_of_activity.setText(name);

      */
        sharedpreferences = getSharedPreferences(MyPREFERENCES,MODE_PRIVATE);

        String n= sharedpreferences.getString("nameroom1",NameR1);

        TextView title_of_activity= findViewById(R.id.title_of_activity_r1);

        title_of_activity.setText(n);

    }



    public void vis_r1(View view){

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
                break;
            }
            case "5":{
                b1.setVisibility(View.VISIBLE);
                b2.setVisibility(View.VISIBLE);
                b3.setVisibility(View.VISIBLE);
                b4.setVisibility(View.VISIBLE);
                b5.setVisibility(View.VISIBLE);
                b6.setVisibility(View.GONE);
                break;
            }
            case "6":{
                b1.setVisibility(View.VISIBLE);
                b2.setVisibility(View.VISIBLE);
                b3.setVisibility(View.VISIBLE);
                b4.setVisibility(View.VISIBLE);
                b5.setVisibility(View.VISIBLE);
                b6.setVisibility(View.VISIBLE);
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
                break;
            }

            case "2": {
                if((Integer.parseInt(number))>=2){

                    Button b2 = findViewById(R.id.t2);
                    b2.setText(name);

                }


                else {
                    CharSequence text = "Error: number of roller selected exceded number of rollers";
                    int duration = Toast.LENGTH_LONG;
                    Toast toast = Toast.makeText(this,text,duration);
                    toast.show();
                }



                break;
            }

            case "3": {

                if((Integer.parseInt(number))>=3){
                    Button b3 = findViewById(R.id.t3);
                    b3.setText(name);
                }
                else{
                    CharSequence text = "Error: number of roller selected exceded number of rollers";
                    int duration = Toast.LENGTH_LONG;
                    Toast toast = Toast.makeText(this,text,duration);
                    toast.show();
                }


                break;
            }
            case "4": {

                if ((Integer.parseInt(number)) >= 4) {
                    Button b4 = findViewById(R.id.t4);
                    b4.setText(name);
                }
                else{
                    CharSequence text = "Error: number of roller selected exceded number of rollers";
                    int duration = Toast.LENGTH_LONG;
                    Toast toast = Toast.makeText(this,text,duration);
                    toast.show();
                }
                break;
            }
            case "5": {

                if((Integer.parseInt(number)) >= 5){
                    Button b5 = findViewById(R.id.t5);
                    b5.setText(name);
                }
                else {
                    CharSequence text = "Error: number of roller selected exceded number of rollers";
                    int duration = Toast.LENGTH_LONG;
                    Toast toast = Toast.makeText(this,text,duration);
                    toast.show();
                }
                break;
            }
            case "6": {

                if((Integer.parseInt(number)) >= 6){
                    Button b6 = findViewById(R.id.t6);
                    b6.setText(name);
                }
                else {
                    CharSequence text = "Error: number of roller selected exceded number of rollers";
                    int duration = Toast.LENGTH_LONG;
                    Toast toast = Toast.makeText(this,text,duration);
                    toast.show();
                }
                break;
            }


        }

    }



    public void gotoRoller1(View view) {

        Intent intent= new Intent(this,Roller1.class);
        startActivity(intent);


        Button button;

        button = findViewById(R.id.t1);
        String name =button.getText().toString();

        Intent nuovoTitolo = new Intent(this, Roller1.class);
        nuovoTitolo.putExtra("Titolo", name);
        startActivity(nuovoTitolo);
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