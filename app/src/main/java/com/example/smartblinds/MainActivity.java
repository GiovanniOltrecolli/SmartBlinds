package com.example.smartblinds;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_main);

        sharedpreferences = getSharedPreferences(MyPREFERENCES, MODE_PRIVATE);

        // imposto un valore di default al numero di stanze (1)
        String n= sharedpreferences.getString(NRooms,"1");

        // imposto un valore di default al numero di stanze nello spinner
        Spinner spinner_number = findViewById(R.id.planets_spinner);
        spinner_number.setSelection((Integer.parseInt(n)) -1);

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

   /*al cliccare del bottone "Enter" la funzione "number_rooms" rende visibili un numero di bottoni pari al numero selezionato nello spinner e salva nelle preferenze
   tale numero
    */

    public void number_rooms (View view){
        Button b1;
        Button b2;
        Button b3;

        Spinner spinner = findViewById(R.id.planets_spinner);
        String string = String.valueOf(spinner.getSelectedItem());
        sharedpreferences = getSharedPreferences(MyPREFERENCES, MODE_PRIVATE);

        switch (string) {

            case "1": {
                b3 = findViewById(R.id.r3);
                b1 = findViewById(R.id.r1);
                b2 = findViewById(R.id.r2);
                b1.setVisibility(View.VISIBLE);
                b2.setVisibility(View.GONE);
                b3.setVisibility(View.GONE);
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString(NRooms,string);
                editor.apply();
                break;

            }
            case "2": {
                b3 = findViewById(R.id.r3);
                b1 = findViewById(R.id.r1);
                b2 = findViewById(R.id.r2);
                b1.setVisibility(View.VISIBLE);
                b2.setVisibility(View.VISIBLE);
                b3.setVisibility(View.GONE);
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString(NRooms,string);
                editor.apply();
                break;
            }
            case "3": {
                b3 = findViewById(R.id.r3);
                b1 = findViewById(R.id.r1);
                b2 = findViewById(R.id.r2);
                b1.setVisibility(View.VISIBLE);
                b2.setVisibility(View.VISIBLE);
                b3.setVisibility(View.VISIBLE);
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString(NRooms,string);
                editor.apply();
                break;
            }
        }


        EditText editText;
        Button b4;
        Spinner spinner_name;

        editText = findViewById(R.id.name);
        editText.setVisibility(View.VISIBLE);

        b4 = findViewById(R.id.b_enter1);
        b4.setVisibility(View.VISIBLE);

        spinner_name = findViewById(R.id.name_spinner);
        spinner_name.setVisibility(View.VISIBLE);


    }

    // cambia il nome dei bottoni delle stanze e i titoli nelle stanze

    public void change_name (View view){

        Spinner spinner;
        EditText editText;

        editText = findViewById(R.id.name);
        String name = editText.getText().toString();
        spinner = findViewById(R.id.name_spinner);
        String string = String.valueOf(spinner.getSelectedItem());

        Spinner spinnerNumber = findViewById(R.id.planets_spinner);
        String number = String.valueOf(spinnerNumber.getSelectedItem());

        switch (string) {
            case "1": {


                Button b1 = findViewById(R.id.r1);
                b1.setText(name);
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString(NameR1, name);
                editor.apply();

                if((Integer.parseInt(number))>1)

                    spinner.setSelection(Integer.parseInt(string));
                break;
            }

               /* controlliamo che il numero selezionato nello spinner non sia maggiore del numero di stanze selezionato:
                - estraiamo il numero di stanze inserito precedentemento e lo trasformiamo in un intero con la funzione Integer.paseInt()
                        - se il numero è magiore del valore del case corrente allora facciamo la modifica altrimento mostriamo un messaggio di errore*/

            case "2": {

                if((Integer.parseInt(number))>=2) {

                    Button b2 = findViewById(R.id.r2);
                    b2.setText(name);
                    SharedPreferences.Editor editor = sharedpreferences.edit();
                    editor.putString(NameR2, name);
                    editor.apply();

                }

                else{

                    CharSequence text = "Error: number of room selected exceded number of rooms";
                    int duration = Toast.LENGTH_LONG;
                    Toast toast = Toast.makeText(this,text,duration);
                    toast.show();

                }

                if((Integer.parseInt(number))>2)

                    spinner.setSelection(Integer.parseInt(string));


                break;
            }

            case "3": {

                if((Integer.parseInt(number))>=3) {

                    Button b3 = findViewById(R.id.r3);
                    b3.setText(name);
                    SharedPreferences.Editor editor = sharedpreferences.edit();
                    editor.putString(NameR3, name);
                    editor.apply();
                }

                else{
                    CharSequence text = "Error: number of room selected exceded number of rooms";
                    int duration = Toast.LENGTH_LONG;
                    Toast toast = Toast.makeText(this,text,duration);
                    toast.show();
                }
                break;
            }

        }

    }





/* vis_settings è una funzione chiamata al click di "settings" che controlla la visibilità dei settings.
Se questi oggetti sono visibili alloa vegono resi invisibili (o meglio come se non ci fossero "GONE")
Viceversa se sono "GONE" vengono resi visibili. */

    public void vis_settings(View view){

        Button b1,b2;
        EditText editText;
        Spinner spinner_number, spinner_name;

        b1 = findViewById(R.id.b_enter);
        b2 = findViewById(R.id.b_enter1);
        editText = findViewById(R.id.name);
        spinner_number=findViewById(R.id.planets_spinner);
        spinner_name=findViewById(R.id.name_spinner);

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



// esempio di come può essere creata un'activity da zero, cioè costruendo tutte le view. Non funziona per ora,
    // mi spara fuori


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
