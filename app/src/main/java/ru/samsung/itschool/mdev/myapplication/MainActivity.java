package ru.samsung.itschool.mdev.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv;
    private int counter = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("RRR", "onCreate()");
        tv = findViewById(R.id.textView);

    //    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); // вертикальная

      //  if(savedInstanceState != null) {
     //       counter = savedInstanceState.getInt("value");
      //  }
        tv.setText(Integer.toString(counter));
    }

    public void doCalc(View v) {
        counter++;
        tv.setText(Integer.toString(counter));
    }

   /* @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putInt("value",counter);
        super.onSaveInstanceState(outState);
    }
*/

    @Override
    // Перед отображением разметки активности
    protected void onStart() {
        super.onStart();
        Log.d("RRR", "onStart()");
    }

    @Override
    // Остановка
    protected void onStop() {
        super.onStop();
        Log.d("RRR", "onStop()");
    }

    @Override
    // Приостановка обновления пользовательского интерфейса
    protected void onPause() {
        super.onPause();
        Log.d("RRR", "onPause()");
    }

    @Override
    // Завершение отображения активности
    protected void onResume() {
        super.onResume();
        Log.d("RRR", "onResume()");
    }

    @Override
    // Возобновление
    protected void onRestart() {
        super.onRestart();
        Log.d("RRR", "onRestart()");
    }

    @Override
    // Удаление
    protected void onDestroy() {
        super.onDestroy();
        Log.d("RRR", "onDestroy()");
    }
}