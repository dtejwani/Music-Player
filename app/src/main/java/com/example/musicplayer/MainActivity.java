package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button play, pause, stop;
    MediaPlayer mediaPlayer;
    int pauseCurrent;
    int sec=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView song1=(TextView) findViewById(R.id.song1);
        song1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songplayers= new Intent(MainActivity.this, songplay.class);
                sec=0;
                songplayers.putExtra("songsss", sec);
                startActivity(songplayers);

            }
        });
        TextView song2= findViewById(R.id.song2);
        TextView song3= findViewById(R.id.song3);
        TextView song4= findViewById(R.id.song4);
        TextView song5= findViewById(R.id.song5);
        TextView song6= findViewById(R.id.song6);
        TextView song7= findViewById(R.id.song7);
        song2.setOnClickListener(this);
        song3.setOnClickListener(MainActivity.this);
        song4.setOnClickListener(MainActivity.this);
        song5.setOnClickListener(MainActivity.this);
        song6.setOnClickListener(MainActivity.this);
        song7.setOnClickListener(MainActivity.this);
        Button bestsongs= findViewById(R.id.bestsong);
        bestsongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,bestsong.class);
                startActivity(intent);
            }
        });
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.song2:
                sec=2;
                break;
            case R.id.song3:
                sec=3;
                break;
            case R.id.song4:
                sec=4;
                break;
            case R.id.song5:
                sec=5;
                break;
            case R.id.song6:
                sec=6;
                break;
            case R.id.song7:
                sec=7;
                break;
        }
        Intent songplayers= new Intent(MainActivity.this, songplay.class);
        songplayers.putExtra("songsss", sec);
        startActivity(songplayers);
        sec=0;
    }
}
