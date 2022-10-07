package android.example.mymusicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Find the View that shows the relax_button_view
        Button relaxButton = findViewById(R.id.relax_button_view);
        // Set a click listener on that View
        relaxButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent relaxIntent = new Intent(MainActivity.this, RelaxActivity.class);
                // Start the new activity
                startActivity(relaxIntent);

            }
        });

        Button workoutButton = findViewById(R.id.workout_button_view);
        workoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent workoutIntent = new Intent(MainActivity.this, WorkoutActivity.class);
                startActivity(workoutIntent);

            }
        });

        Button energizeButton = findViewById(R.id.energize_button_view);
        energizeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent EnergizeIntent = new Intent(MainActivity.this, EnergizeActivity.class);
                startActivity(EnergizeIntent);

            }
        });

        Button commuteButton = findViewById(R.id.commute_button_view);
        commuteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent commuteIntent = new Intent(MainActivity.this, CommuteActivity.class);
                startActivity(commuteIntent);

            }
        });

        Button focusButton = findViewById(R.id.focus_button_view);
        focusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent focusIntent = new Intent(MainActivity.this, FocusActivity.class);
                startActivity(focusIntent);

            }
        });


        TextView musicPlayPath = findViewById(R.id.music_play_path);
        musicPlayPath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent musicPlayPathActivity = new Intent(MainActivity.this, MusicActivity.class);
                startActivity(musicPlayPathActivity);
            }
        });


    }
}