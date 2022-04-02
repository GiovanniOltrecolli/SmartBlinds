package com.example.smartblinds;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Roller1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roller1);


        String name = getIntent().getExtras().getString("Titolo");

        // prendo l'id della text view di cui voglio cambiare il nome
        TextView title_of_activity= findViewById(R.id.tile_roller1);


        //applico il metodo .setText per settare il campo di testo della TextView con il nome passato dall'intent
        title_of_activity.setText(name);

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

    public void MyAlarm(){

        Intent intent =new Intent(this, SetAlarm.class);

        startActivity(intent);


    }

}