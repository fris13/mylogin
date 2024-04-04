package com.example.mylogin;

import static com.example.mylogin.R.id.buttonlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
button pindahactivity;

 @SuppressLint("WrongViewCast")
 @Override
 protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_main);

  pindahactivity = findViewById(R.id.buttonlogin);


  pindahactivity.setOnClickListener(new View.OnClickListener(){
   @Override
   public void onClick(View v){

    Intent pindahkehome = new Intent(MainActivity.this,Home.class);
    startActivities(new Intent[]{pindahkehome});
   }

  });
 }
}