package com.example.smartblinds;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Roller1 extends AppCompatActivity {
    public static final String MyPREFERENCES = "MyPrefs" ;
    public static final String NameRoller1 ="NameOfRoller1";

    SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roller1);

        //recupero del titolo dell'activity

        sharedpreferences = getSharedPreferences(MyPREFERENCES, MODE_PRIVATE);

        String n= sharedpreferences.getString("NameOfRoller1",NameRoller1);

        TextView title_of_activity= findViewById(R.id.tile_roller1);

        title_of_activity.setText(n);

    }

    // blink_up e blink_down fanno lampeggiare i due bottoni con le frecce


    public void blink_up(View view){

      //  ImageButton b = findViewById(R.id.imageButton2);

        Animation anim = new AlphaAnimation(0.0f, 1.0f);
        anim.setDuration(100); //You can manage the blinking time with this parameter
        anim.setStartOffset(20);
        anim.setRepeatMode(Animation.REVERSE);
        anim.setRepeatCount(Animation.INFINITE);
       // b.startAnimation(anim);
    }

    public void blink_down(View view){

      //  ImageButton b = findViewById(R.id.imageButton3);

        Animation anim = new AlphaAnimation(0.0f, 1.0f);
        anim.setDuration(100); //You can manage the blinking time with this parameter
        anim.setStartOffset(20);
        anim.setRepeatMode(Animation.REVERSE);
        anim.setRepeatCount(Animation.INFINITE);
       // b.startAnimation(anim);

    }

    public void MyAlarm(View view){

        Intent intent =new Intent(this, SetAlarm.class);

        startActivity(intent);

    }

}