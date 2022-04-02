package com.example.smartblinds;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SetAlarm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_alarm);
    }


   /* AlarmManager mAlarmManger = (AlarmManager)getSystemService(Context.ALARM_SERVICE);

    //Create pending intent & register it to your alarm notifier class
    Intent intent = new Intent(this, AlarmReceiver.class);

    PendingIntent pendingIntent = PendingIntent.getBroadcast(this, 0, intent, 0);





  /*  //set timer you want alarm to work (here I have set it to 9.00)
    Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.HOUR_OF_DAY, 9);
    calendar.set(Calendar.MINUTE, 0);
    calendar.set(Calendar.SECOND, 0);

    mAlarmManger .set(AlarmManager.RTC_WAKEUP, data.getTimeInMillis(), pendingIntent); */






}