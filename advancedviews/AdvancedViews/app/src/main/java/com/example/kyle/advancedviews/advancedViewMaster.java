package com.example.kyle.advancedviews;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;


public class advancedViewMaster extends Activity {

    private ArrayList<VideoGames> mVideoGames = new ArrayList<VideoGames>();
    private ListView mGamesList;
    private Spinner  mGamesSpinner = (Spinner) findViewById(R.id.gamesSpinner);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_view_master);

        mGamesList = (ListView) findViewById(R.id.landListView);

        mVideoGames = new ArrayList<VideoGames>();
        mVideoGames.add(new VideoGames("The Last of Us", "Playstation 4", "Action/Adventure", 10));
        mVideoGames.add(new VideoGames("Halo: Master Chief Collections", "Xbox One", "First Person Shooter", 9));
        mVideoGames.add(new VideoGames("Madden 15", "Xbox One, Playstation 4", "Sports", 8));
        mVideoGames.add(new VideoGames("Dragon Age: Inquisition", "Playstation 4, Xbox One", "Roleplaying", 9));
        mVideoGames.add(new VideoGames("Evolve", "Xbox One, Playstation 4", "Shooter", 10));
        mVideoGames.add(new VideoGames("Super Mario", "Nintendo Wii U", "Platformer", 9));
        mVideoGames.add(new VideoGames("MLB 14: The Show", "Playstation 4", "Sports", 7));
        mVideoGames.add(new VideoGames("World of Warcraft", "PC", "Massively Multiplayer Online RPG", 9));

        /*ArrayAdapter<VideoGames> myArrayAdapter = new ArrayAdapter<VideoGames>(this, android.R.layout.simple_spinner_item, mVideoGames);
        myArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mGamesSpinner.setAdapter(myArrayAdapter);*/

        mGamesSpinner.setAdapter(new spinnerAdapter(this, mVideoGames));
        mGamesList.setAdapter(new newAdapter(this, mVideoGames));

        //new newAdapter(this, mVideoGames);

        //ArrayAdapter<VideoGames> myArrayAdapter = new ArrayAdapter<VideoGames>(advancedViewMaster.this, android.R.layout.simple_list_item_1, mVideoGames);

        //mGamesList.setAdapter(listAdapter);

        //mGamesList.setAdapter(newAdapter);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.advanced_view_master, menu);
        return true;
    }

}