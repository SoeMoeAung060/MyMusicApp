package android.example.mymusicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FocusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);


        ArrayList<Music> musicArrayList = new ArrayList<>();

        musicArrayList.add(new Music("Perfect", "Ed Sheeran",R.drawable.profile_1));
        musicArrayList.add(new Music("Girls Like You", "Maroon5",R.drawable.profile_2));
        musicArrayList.add(new Music("Something Just Like This", "The Chainsmokers",R.drawable.profile_3));
        musicArrayList.add(new Music("yeah!", "usher",R.drawable.profile_4));
        musicArrayList.add(new Music("All of Me", "John Legend",R.drawable.profile_5));
        musicArrayList.add(new Music("Right here Waiting", "Music Travel Love",R.drawable.profile_6));
        musicArrayList.add(new Music("Where is the Love", "The Black Eyed Peas",R.drawable.profile_7));
        musicArrayList.add(new Music("Love Yourself", "JustinBieber",R.drawable.album6));
        musicArrayList.add(new Music("Dangerous (feat.Akon)", "Kardubak Offishall",R.drawable.album5));
        musicArrayList.add(new Music("One Day", "Matisyahu",R.drawable.album4));
        musicArrayList.add(new Music("Marry You", "Bruno Mars",R.drawable.album3));
        musicArrayList.add(new Music("One Call Away", "Charlie Puth",R.drawable.album2));
        musicArrayList.add(new Music("Night Changes", "One Direction",R.drawable.album1));


        MusicAdapter musicAdapter = new MusicAdapter(this, musicArrayList,R.color.category_focus);
        ListView relaxListView = (ListView) findViewById(R.id.list);
        relaxListView.setAdapter(musicAdapter);
    }
}