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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void  GoToSettings(View view){
        Intent intent= new Intent(this,Settings.class);
        startActivity(intent);

    }
    public void  GoToRooms(View view){
        Intent intent= new Intent(this,Rooms.class);
        startActivity(intent);

    }

}
