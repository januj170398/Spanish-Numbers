package com.example.hp.spanishnumbers;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public void playMusic(View view){

        int id=view.getId();
        Log.i("ID","Id value is"+id);

        String nameId=view.getResources().getResourceEntryName(id);
        Log.i("Name id","name id is"+nameId);
        int myMusic=getResources().getIdentifier(nameId,"raw","com.example.hp.spanishnumbers");
        MediaPlayer mediaPlayer=MediaPlayer.create(this,myMusic);
        mediaPlayer.start();
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
