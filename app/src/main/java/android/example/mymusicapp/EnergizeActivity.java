package android.example.mymusicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class EnergizeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);


        ArrayList<Music> musicArrayList = new ArrayList<>();


        musicArrayList.add(new Music("Perfect", "Ed Sheeran"));
        musicArrayList.add(new Music("Girls Like You", "Maroon5"));
        musicArrayList.add(new Music("Something Just Like This", "The Chainsmokers"));
        musicArrayList.add(new Music("yeah!", "usher"));
        musicArrayList.add(new Music("All of Me", "John Legend"));
        musicArrayList.add(new Music("Right here Waiting", "Music Travel Love"));
        musicArrayList.add(new Music("Where is the Love", "The Black Eyed Peas"));
        musicArrayList.add(new Music("Love Yourself", "JustinBieber"));
        musicArrayList.add(new Music("Dangerous (feat.Akon)", "Kardubak Offishall"));
        musicArrayList.add(new Music("One Day", "Matisyahu"));
        musicArrayList.add(new Music("Marry You", "Bruno Mars"));
        musicArrayList.add(new Music("One Call Away", "Charlie Puth"));
        musicArrayList.add(new Music("Night Changes", "One Direction"));


        MusicAdapter musicAdapter = new MusicAdapter(this, musicArrayList,R.color.category_energize);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(musicAdapter);
    }
}