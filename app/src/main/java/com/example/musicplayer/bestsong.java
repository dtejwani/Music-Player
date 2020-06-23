package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
public class bestsong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bestsong);
        ArrayList<Song> songAdapters=new ArrayList<>();
        songAdapters.add(new Song("Challa","Rabbi") );
        songAdapters.add(new Song("Growing Pains","Alessia Cara"));
        songAdapters.add(new Song("Mann Bharrya","B. Praak"));
        songAdapters.add(new Song("F.F.F","Bebe Rexha"));
        songAdapters.add(new Song("Me, Myslef And I","G eazy & Bebe Rexha"));
        songAdapters.add(new Song("Radioactive","Imagine Dragons"));
        songAdapters.add(new Song("Thunder","Imagine Dragons"));
        songAdapters.add(new Song("Believer","Imagine Dragons"));
        songAdapters.add(new Song("Natural","Imagine Dragons"));
        songAdapters.add(new Song("Wow","Post Malone"));
        songAdapters.add(new Song("Circles","Post Malone"));
        songAdapters.add(new Song("Psycho","Post Malone"));
        songAdapters.add(new Song("Goodbyes","Post Malone"));
        songAdapters.add(new Song("La La La","Shakira"));
        songAdapters.add(new Song("Waka Waka","Shakira"));
        songAdapters.add(new Song("Judgement Day","Stealth"));
        songAdapters.add(new Song("Teri Mitti","B Praak"));
        songAdapters.add(new Song("Let Me","Zayn"));
        songAdapters.add(new Song("Lose Yourself","Eminem"));
        songAdapters.add(new Song("Venom","Eminem"));
        songAdapters.add(new Song("Rap God","Eminem"));



        SongAdapter musicAdapter=new SongAdapter(this, songAdapters);
        ListView listView = (ListView) findViewById(R.id.listview_flavor);
        listView.setAdapter(musicAdapter);
    }
}
