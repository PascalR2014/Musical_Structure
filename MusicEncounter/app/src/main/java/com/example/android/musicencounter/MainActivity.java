package com.example.android.musicencounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // 1. Find the view that show the bienvenue category
        TextView bienvenue = (TextView)findViewById(R.id.welcome_text);

        // 2. Set a OnClickListener on that View
        bienvenue.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the bienvenue category is clicked on.
            @Override
            public void onClick(View v) {
                // 3. Create a new intent to open the @link BienvenueActivity
                Intent bienvenueIntent = new Intent(MainActivity.this,BienvenueActivity.class);
                // Start the new activity
                startActivity(bienvenueIntent);
            }
        });

        // 1. Find the view that show the Search category
        TextView search = (TextView)findViewById(R.id.search_activity);

        // 2. Set a OnClickListener on that View
        search.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the search category is clicked on.
            @Override
            public void onClick(View v) {
                // 3. Create a new intent to open the @link SearchActivity
                Intent searchIntent = new Intent(MainActivity.this,SearchActivity.class);
                // Start the new activity
                startActivity(searchIntent);
            }
        });

        // 1. Find the view that show the Info category
        TextView info = (TextView)findViewById(R.id.info_activity);

        // 2. Set a OnClickListener on that View
        info.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the search category is clicked on.
            @Override
            public void onClick(View v) {
                // 3. Create a new intent to open the @link InfoActivity
                Intent infoIntent = new Intent(MainActivity.this,InfoActivity.class);
                // Start the new activity
                startActivity(infoIntent);
            }
        });

        // 1. Find the view that show the Player category
        TextView player = (TextView)findViewById(R.id.player);

        // 2. Set a OnClickListener on that View
        player.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the search category is clicked on.
            @Override
            public void onClick(View v) {
                // 3. Create a new intent to open the @link PlayerActivity
                Intent playerIntent = new Intent(MainActivity.this,PlayerActivity.class);
                // Start the new activity
                startActivity(playerIntent);
            }
        });

        // 1. Find the view that show the Playlist category
        TextView playlist = (TextView)findViewById(R.id.playlist);

        // 2. Set a OnClickListener on that View
        playlist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the search category is clicked on.
            @Override
            public void onClick(View v) {
                // 3. Create a new intent to open the @link PlaylistActivity
                Intent playlistIntent = new Intent(MainActivity.this,PlaylistActivity.class);
                // Start the new activity
                startActivity(playlistIntent);
            }
        });

        // 1. Find the view that show the suggestion_playlist category
        TextView suggestion_playlist = (TextView)findViewById(R.id.suggestion_playlist);

        // 2. Set a OnClickListener on that View
        suggestion_playlist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the search category is clicked on.
            @Override
            public void onClick(View v) {
                // 3. Create a new intent to open the @link ImplicitActivity
                Intent suggestion_playlistIntent = new Intent(MainActivity.this,ImplicitActivity.class);
                // Start the new activity
                startActivity(suggestion_playlistIntent);
            }
        });



    }
}
