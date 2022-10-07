package android.example.mymusicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);
//        getSupportActionBar().hide();



        ArrayList<Music> musicArrayList = new ArrayList<>();

        musicArrayList.add(new Music("Photograph", "Ed Sheeran",R.drawable.album1));
        musicArrayList.add(new Music("Uptown Funk", "Mark Ronson",R.drawable.album2));
        musicArrayList.add(new Music("Fly Me to the Moon", "The Macarons Project",R.drawable.album3));
        musicArrayList.add(new Music("Leave The Door Open", "Bruno Mars, Anderson, Paak..",R.drawable.album4));
        musicArrayList.add(new Music("Night Changes", "One Direction",R.drawable.album5));
        musicArrayList.add(new Music("Shalala Lala", "Vengaboys",R.drawable.album6));
        musicArrayList.add(new Music("Empire State of Mind", "Jay-Z",R.drawable.profile_1));
        musicArrayList.add(new Music("This is Me", "Keala Settle & The Greatest..",R.drawable.profile_2));
        musicArrayList.add(new Music("Angel Baby", "Troye Sivan",R.drawable.profile_3));
        musicArrayList.add(new Music("Dangerous", "Akon",R.drawable.profile_4));
        musicArrayList.add(new Music("Stuck On You", "Lionel Richie",R.drawable.profile_5));
        musicArrayList.add(new Music("Hotel California", "Eagles",R.drawable.profile_6));
        musicArrayList.add(new Music("I Swear", "All-4-One",R.drawable.profile_7));


        MusicAdapter musicAdapter = new MusicAdapter(this, musicArrayList,R.color.black_status_bar);
        ListView relaxListView = (ListView) findViewById(R.id.list);
        relaxListView.setAdapter(musicAdapter);




//        ArrayList<String> words = new ArrayList<>();
//
//        words.add("One");
//        words.add("two");
//        words.add("three");
//        words.add("four");
//        words.add("five");
//        words.add("six");
//        words.add("seven");
//        words.add("eight");
//        words.add("nine");
//        words.add("ten");
//
//
//        //ListView & ArrayAdapter View Recycle
//        ArrayAdapter<String> itemAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, words);
//        ListView listView = findViewById(R.id.list);
//        listView.setAdapter(itemAdapter);



        //list View Recycle
//        LinearLayout rootView = findViewById(R.id.rootView);
//        int index = 0;
//        while (index < words.size()){
//            TextView textView = new TextView(this);
//            textView.setText(words.get(index));
//            rootView.addView(textView);
//            index++;
//        }


    }
}