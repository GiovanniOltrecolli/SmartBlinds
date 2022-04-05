package com.example.smartblinds;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Settings extends AppCompatActivity {

    public static final String MyPREFERENCES = "MyPrefs" ;
    public static final String NRooms = "numberRooms";
    public static final String NameR1 = "nameroom1";
    public static final String NameR2 = "nameroom2";
    public static final String NameR3 = "nameroom2";
    public static final String NRollerRoom1= "NumerOfRollerRoom1";
    public static final String NRollerRoom2= "NumerOfRollerRoom2";
    public static final String NRollerRoom3= "NumerOfRollerRoom3";
    public static final String NameRoller1Room1 ="NameOfRoller1Room1";
    public static final String NameRoller2Room1 ="NameOfRoller2Room1";
    public static final String NameRoller3Room1 ="NameOfRoller3Room1";
    public static final String NameRoller4Room1 ="NameOfRoller4Room1";
    public static final String NameRoller5Room1 ="NameOfRoller5Room1";
    public static final String NameRoller6Room1 ="NameOfRoller6Room1";
    public static final String NameRoller1Room2 ="NameOfRoller1Room2";
    public static final String NameRoller2Room2 ="NameOfRoller2Room2";
    public static final String NameRoller3Room2 ="NameOfRoller3Room2";
    public static final String NameRoller4Room2 ="NameOfRoller4Room2";
    public static final String NameRoller5Room2 ="NameOfRoller5Room2";
    public static final String NameRoller6Room2 ="NameOfRoller6Room2";
    public static final String NameRoller1Room3 ="NameOfRoller1Room3";
    public static final String NameRoller2Room3 ="NameOfRoller2Room3";
    public static final String NameRoller3Room3 ="NameOfRoller3Room3";
    public static final String NameRoller4Room3 ="NameOfRoller4Room3";
    public static final String NameRoller5Room3 ="NameOfRoller5Room3";
    public static final String NameRoller6Room3 ="NameOfRoller6Room3";

    SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        sharedpreferences = getSharedPreferences(MyPREFERENCES, MODE_PRIVATE);

        // imposto un valore di default al numero di stanze
        String nu= sharedpreferences.getString(NRooms,"1");
        Spinner number_room = findViewById(R.id.planets_spinner);
        number_room.setSelection((Integer.parseInt(nu)) -1);


    }

    public void SaveAll(View view){


        Spinner spinner = findViewById(R.id.planets_spinner);
        String string = String.valueOf(spinner.getSelectedItem());
        sharedpreferences = getSharedPreferences(MyPREFERENCES, MODE_PRIVATE);

        switch (string) {

            case "1": {
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString(NRooms,string);
                editor.apply();
                break;

            }
            case "2": {
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString(NRooms,string);
                editor.apply();
                break;
            }
            case "3": {
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString(NRooms,string);
                editor.apply();
                break;
            }
        }

    }


    public void ChangeName(View view){

        Spinner spinner;
        EditText editText;

        editText = findViewById(R.id.name);
        String name = editText.getText().toString();
        spinner = findViewById(R.id.name_spinner);
        String string = String.valueOf(spinner.getSelectedItem());

        Spinner spinnerNumber = findViewById(R.id.planets_spinner);
        String number = String.valueOf(spinnerNumber.getSelectedItem());
        sharedpreferences = getSharedPreferences(MyPREFERENCES, MODE_PRIVATE);

        switch (string) {
            case "1": {

                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString(NameR1, name);
                editor.apply();
                editText.setText("");

                if((Integer.parseInt(number))>1)

                    spinner.setSelection(Integer.parseInt(string));
                break;
            }

               /* controlliamo che il numero selezionato nello spinner non sia maggiore del numero di stanze selezionato:
                - estraiamo il numero di stanze inserito precedentemento e lo trasformiamo in un intero con la funzione Integer.paseInt()
                        - se il numero è magiore del valore del case corrente allora facciamo la modifica altrimento mostriamo un messaggio di errore*/

            case "2": {

                if((Integer.parseInt(number))>=2) {

                    SharedPreferences.Editor editor = sharedpreferences.edit();
                    editor.putString(NameR2, name);
                    editor.apply();
                    editText.setText("");

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

                    SharedPreferences.Editor editor = sharedpreferences.edit();
                    editor.putString(NameR3, name);
                    editor.apply();
                    editText.setText("");
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


    public void NumberRoller(View view){

        //prendo il numero di stanza selezionato
        Spinner spinner_number_room = findViewById(R.id.spinner_1);
        //lo metto in una stringa n
        String stanza =String.valueOf(spinner_number_room.getSelectedItem());

        // prendo il numero ti tapparelle selezionate
        Spinner spinner = findViewById(R.id.spinner_2);
        //lo metto nella stringa string
        String string = String.valueOf(spinner.getSelectedItem());

        sharedpreferences = getSharedPreferences(MyPREFERENCES, MODE_PRIVATE);

        switch (stanza){

            case "1" : {
                switch(string){

                    case "1" :{
                        SharedPreferences.Editor editor = sharedpreferences.edit();
                        editor.putString(NRollerRoom1,string);
                        editor.apply();
                        break;

                    }
                    case "2": {
                        SharedPreferences.Editor editor = sharedpreferences.edit();
                        editor.putString(NRollerRoom1,string);
                        editor.apply();
                        break;
                    }
                    case "3": {
                        SharedPreferences.Editor editor = sharedpreferences.edit();
                        editor.putString(NRollerRoom1,string);
                        editor.apply();
                        break;
                    }

                    case "4":{
                        SharedPreferences.Editor editor = sharedpreferences.edit();
                        editor.putString(NRollerRoom1,string);
                        editor.apply();
                        break;
                    }
                    case "5":{
                        SharedPreferences.Editor editor = sharedpreferences.edit();
                        editor.putString(NRollerRoom1,string);
                        editor.apply();
                        break;
                    }
                    case "6":{
                        SharedPreferences.Editor editor = sharedpreferences.edit();
                        editor.putString(NRollerRoom1,string);
                        editor.apply();
                        break;
                    }
                }
            }

            case "2": {
                switch(string){

                    case "1" :{
                        SharedPreferences.Editor editor = sharedpreferences.edit();
                        editor.putString(NRollerRoom2,string);
                        editor.apply();
                        break;

                    }
                    case "2": {
                        SharedPreferences.Editor editor = sharedpreferences.edit();
                        editor.putString(NRollerRoom2,string);
                        editor.apply();
                        break;
                    }
                    case "3": {
                        SharedPreferences.Editor editor = sharedpreferences.edit();
                        editor.putString(NRollerRoom2,string);
                        editor.apply();
                        break;
                    }

                    case "4":{
                        SharedPreferences.Editor editor = sharedpreferences.edit();
                        editor.putString(NRollerRoom2,string);
                        editor.apply();
                        break;
                    }
                    case "5":{
                        SharedPreferences.Editor editor = sharedpreferences.edit();
                        editor.putString(NRollerRoom2,string);
                        editor.apply();
                        break;
                    }
                    case "6":{
                        SharedPreferences.Editor editor = sharedpreferences.edit();
                        editor.putString(NRollerRoom2,string);
                        editor.apply();
                        break;
                    }
                }
            }

            case "3": {
                switch(string){

                    case "1" :{
                        SharedPreferences.Editor editor = sharedpreferences.edit();
                        editor.putString(NRollerRoom3,string);
                        editor.apply();
                        break;

                    }
                    case "2": {
                        SharedPreferences.Editor editor = sharedpreferences.edit();
                        editor.putString(NRollerRoom3,string);
                        editor.apply();
                        break;
                    }
                    case "3": {
                        SharedPreferences.Editor editor = sharedpreferences.edit();
                        editor.putString(NRollerRoom3,string);
                        editor.apply();
                        break;
                    }

                    case "4":{
                        SharedPreferences.Editor editor = sharedpreferences.edit();
                        editor.putString(NRollerRoom3,string);
                        editor.apply();
                        break;
                    }
                    case "5":{
                        SharedPreferences.Editor editor = sharedpreferences.edit();
                        editor.putString(NRollerRoom3,string);
                        editor.apply();
                        break;
                    }
                    case "6":{
                        SharedPreferences.Editor editor = sharedpreferences.edit();
                        editor.putString(NRollerRoom3,string);
                        editor.apply();
                        break;
                    }
                }
            }


        }


    }




// da sistemare e finire (mettere la scelta della stanza)
    public void ChangeNameRoller(View view){

        Spinner spinner_room, spinner_roller;
        EditText editText;

        editText = findViewById(R.id.name_roller);
        String name = editText.getText().toString();
        spinner_room = findViewById(R.id.n);
        String room = String.valueOf(spinner_room.getSelectedItem());

        spinner_roller = findViewById(R.id.nr);
        String roller = String.valueOf(spinner_roller.getSelectedItem());

        sharedpreferences = getSharedPreferences(MyPREFERENCES, MODE_PRIVATE);




        switch (room){

            case "1": {
                switch (roller) {
                    case "1": {
                        SharedPreferences.Editor editor = sharedpreferences.edit();
                        editor.putString(NameRoller1Room1, name);
                        editor.apply();
                        editText.setText("");


                        break;
                    }

                    case "2": {
                       /* if((Integer.parseInt(number))>=2){




                        }*/

                        SharedPreferences.Editor editor = sharedpreferences.edit();
                        editor.putString(NameRoller2Room1, name);
                        editor.apply();
                        editText.setText("");


                        /*else {
                            CharSequence text = "Error: number of roller selected exceded number of rollers";
                            int duration = Toast.LENGTH_LONG;
                            Toast toast = Toast.makeText(this,text,duration);
                            toast.show();
                        }

                         */




                        break;
                    }

                    case "3": {

                       /* if((Integer.parseInt(number))>=3){


                        }

                        */

                        SharedPreferences.Editor editor = sharedpreferences.edit();
                        editor.putString(NameRoller3Room1, name);
                        editor.apply();
                        editText.setText("");


                       /* else{
                            CharSequence text = "Error: number of roller selected exceded number of rollers";
                            int duration = Toast.LENGTH_LONG;
                            Toast toast = Toast.makeText(this,text,duration);
                            toast.show();
                        }

                        */


                        break;
                    }
                    case "4": {

                        /*if ((Integer.parseInt(number)) >= 4) {


                        }

                         */

                        SharedPreferences.Editor editor = sharedpreferences.edit();
                        editor.putString(NameRoller4Room1, name);
                        editor.apply();
                        editText.setText("");


                       /* else{
                            CharSequence text = "Error: number of roller selected exceded number of rollers";
                            int duration = Toast.LENGTH_LONG;
                            Toast toast = Toast.makeText(this,text,duration);
                            toast.show();
                        }

                        */

                        break;
                    }
                    case "5": {

                       /* if((Integer.parseInt(number)) >= 5){

                        }

                        */

                        SharedPreferences.Editor editor = sharedpreferences.edit();
                        editor.putString(NameRoller5Room1, name);
                        editor.apply();
                        editText.setText("");

                       /* else {
                            CharSequence text = "Error: number of roller selected exceded number of rollers";
                            int duration = Toast.LENGTH_LONG;
                            Toast toast = Toast.makeText(this,text,duration);
                            toast.show();
                        }

                        */

                        break;
                    }
                    case "6": {

                        /*if((Integer.parseInt(number)) >= 6){

                        }

                         */

                        SharedPreferences.Editor editor = sharedpreferences.edit();
                        editor.putString(NameRoller6Room1, name);
                        editor.apply();
                        editText.setText("");

                       /* else {
                            CharSequence text = "Error: number of roller selected exceded number of rollers";
                            int duration = Toast.LENGTH_LONG;
                            Toast toast = Toast.makeText(this,text,duration);
                            toast.show();
                        }

                        */

                        break;
                    }


                }
            }

            case "2": {
                switch (roller) {
                    case "1": {
                        SharedPreferences.Editor editor = sharedpreferences.edit();
                        editor.putString(NameRoller1Room2, name);
                        editor.apply();
                        editText.setText("");


                        break;
                    }

                    case "2": {
                       /* if((Integer.parseInt(number))>=2){




                        }*/

                        SharedPreferences.Editor editor = sharedpreferences.edit();
                        editor.putString(NameRoller2Room2, name);
                        editor.apply();
                        editText.setText("");


                        /*else {
                            CharSequence text = "Error: number of roller selected exceded number of rollers";
                            int duration = Toast.LENGTH_LONG;
                            Toast toast = Toast.makeText(this,text,duration);
                            toast.show();
                        }

                         */




                        break;
                    }

                    case "3": {

                       /* if((Integer.parseInt(number))>=3){


                        }

                        */

                        SharedPreferences.Editor editor = sharedpreferences.edit();
                        editor.putString(NameRoller3Room2, name);
                        editor.apply();
                        editText.setText("");


                       /* else{
                            CharSequence text = "Error: number of roller selected exceded number of rollers";
                            int duration = Toast.LENGTH_LONG;
                            Toast toast = Toast.makeText(this,text,duration);
                            toast.show();
                        }

                        */


                        break;
                    }
                    case "4": {

                        /*if ((Integer.parseInt(number)) >= 4) {


                        }

                         */

                        SharedPreferences.Editor editor = sharedpreferences.edit();
                        editor.putString(NameRoller4Room2, name);
                        editor.apply();
                        editText.setText("");


                       /* else{
                            CharSequence text = "Error: number of roller selected exceded number of rollers";
                            int duration = Toast.LENGTH_LONG;
                            Toast toast = Toast.makeText(this,text,duration);
                            toast.show();
                        }

                        */

                        break;
                    }
                    case "5": {

                       /* if((Integer.parseInt(number)) >= 5){

                        }

                        */

                        SharedPreferences.Editor editor = sharedpreferences.edit();
                        editor.putString(NameRoller5Room2, name);
                        editor.apply();
                        editText.setText("");

                       /* else {
                            CharSequence text = "Error: number of roller selected exceded number of rollers";
                            int duration = Toast.LENGTH_LONG;
                            Toast toast = Toast.makeText(this,text,duration);
                            toast.show();
                        }

                        */

                        break;
                    }
                    case "6": {

                        /*if((Integer.parseInt(number)) >= 6){

                        }

                         */

                        SharedPreferences.Editor editor = sharedpreferences.edit();
                        editor.putString(NameRoller6Room2, name);
                        editor.apply();
                        editText.setText("");

                       /* else {
                            CharSequence text = "Error: number of roller selected exceded number of rollers";
                            int duration = Toast.LENGTH_LONG;
                            Toast toast = Toast.makeText(this,text,duration);
                            toast.show();
                        }

                        */

                        break;
                    }


                }
            }

            case "3": {
                switch (roller) {
                    case "1": {
                        SharedPreferences.Editor editor = sharedpreferences.edit();
                        editor.putString(NameRoller1Room3, name);
                        editor.apply();
                        editText.setText("");


                        break;
                    }

                    case "2": {
                       /* if((Integer.parseInt(number))>=2){




                        }*/

                        SharedPreferences.Editor editor = sharedpreferences.edit();
                        editor.putString(NameRoller2Room3, name);
                        editor.apply();
                        editText.setText("");


                        /*else {
                            CharSequence text = "Error: number of roller selected exceded number of rollers";
                            int duration = Toast.LENGTH_LONG;
                            Toast toast = Toast.makeText(this,text,duration);
                            toast.show();
                        }

                         */




                        break;
                    }

                    case "3": {

                       /* if((Integer.parseInt(number))>=3){


                        }

                        */

                        SharedPreferences.Editor editor = sharedpreferences.edit();
                        editor.putString(NameRoller3Room3, name);
                        editor.apply();
                        editText.setText("");


                       /* else{
                            CharSequence text = "Error: number of roller selected exceded number of rollers";
                            int duration = Toast.LENGTH_LONG;
                            Toast toast = Toast.makeText(this,text,duration);
                            toast.show();
                        }

                        */


                        break;
                    }
                    case "4": {

                        /*if ((Integer.parseInt(number)) >= 4) {


                        }

                         */

                        SharedPreferences.Editor editor = sharedpreferences.edit();
                        editor.putString(NameRoller4Room3, name);
                        editor.apply();
                        editText.setText("");


                       /* else{
                            CharSequence text = "Error: number of roller selected exceded number of rollers";
                            int duration = Toast.LENGTH_LONG;
                            Toast toast = Toast.makeText(this,text,duration);
                            toast.show();
                        }

                        */

                        break;
                    }
                    case "5": {

                       /* if((Integer.parseInt(number)) >= 5){

                        }

                        */

                        SharedPreferences.Editor editor = sharedpreferences.edit();
                        editor.putString(NameRoller5Room3, name);
                        editor.apply();
                        editText.setText("");

                       /* else {
                            CharSequence text = "Error: number of roller selected exceded number of rollers";
                            int duration = Toast.LENGTH_LONG;
                            Toast toast = Toast.makeText(this,text,duration);
                            toast.show();
                        }

                        */

                        break;
                    }
                    case "6": {

                        /*if((Integer.parseInt(number)) >= 6){

                        }

                         */

                        SharedPreferences.Editor editor = sharedpreferences.edit();
                        editor.putString(NameRoller6Room3, name);
                        editor.apply();
                        editText.setText("");

                       /* else {
                            CharSequence text = "Error: number of roller selected exceded number of rollers";
                            int duration = Toast.LENGTH_LONG;
                            Toast toast = Toast.makeText(this,text,duration);
                            toast.show();
                        }

                        */

                        break;
                    }


                }
            }

        }



    }


}