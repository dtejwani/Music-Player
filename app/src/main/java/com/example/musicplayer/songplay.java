package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class songplay extends AppCompatActivity implements View.OnClickListener{
    Button play, pause, stop;
    MediaPlayer mediaPlayer;
    int pauseCurrent;
    int sec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songplay);
        play= (Button) findViewById(R.id.btn_play);
        stop= (Button) findViewById(R.id.btn_stop);
        pause= (Button) findViewById(R.id.btn_pause);
        play.setOnClickListener(this);
        pause.setOnClickListener(this);
        stop.setOnClickListener(this);
        sec=getIntent().getIntExtra("songsss",sec);

    }

    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btn_play:
                if(mediaPlayer==null){
                    if(sec==2){
                        mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.song2);
                    }
                    else if(sec==3){
                        mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.song3);
                    }
                    else if(sec==4){
                        mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.song4);
                    }
                    else if(sec==5){
                        mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.song5);
                    }
                    else if(sec==6){
                        mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.song6);
                    }
                    else if(sec==7){
                        mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.song7);
                    }

                    else {mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.music);}
                    mediaPlayer.start();}

                else if (!mediaPlayer.isPlaying()){
                    mediaPlayer.seekTo(pauseCurrent);
                    mediaPlayer.start();
                }
                break;
            case R.id.btn_pause:
                if (mediaPlayer!=null) {
                    mediaPlayer.pause();
                    pauseCurrent = mediaPlayer.getCurrentPosition();
                }
                break;
            case R.id.btn_stop:
                if(mediaPlayer!=null){
                    mediaPlayer.stop();}
                mediaPlayer=null;
                break;
        }
    }
}
