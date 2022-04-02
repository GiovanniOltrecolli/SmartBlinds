package com.example.smartblinds;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;

public class Stanza2 extends AppCompatActivity {

    public static final String MyPREFERENCES = "MyPrefs" ;
    public static final String NameR2 = "nameroom2";
    SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stanza2);
    }
}