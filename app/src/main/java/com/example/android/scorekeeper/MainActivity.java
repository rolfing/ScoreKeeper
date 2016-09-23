package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // track score for Miami
    // team A--Miami Heat  Team B--- Lakers
    int scoreTeamA = 0;
    // Track score for LA
    int scoreTeamB = 0;
    // Track fouls for Miami
    int foulsMiami = 0;
    // Track fouls for LA
    int foulsLakers = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when addThreeTeamA button is clicked
     */
    public void addThreeTeamA(View v) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);


    }

    /**
     * This method is called when addTwoTeamA button is clicked
     */
    public void addTwoTeamA(View v) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);

    }

    /**
     * This method is called when addFreeThrowTeamA button is clicked
     */
    public void addOneTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);

    }

    /**
     * This method is called when addThreeTeamB button is clicked
     */
    public void addThreeTeamB(View v) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);


    }

    /**
     * This method is called when addTwoTeamB button is clicked
     */
    public void addTwoTeamB(View v) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);

    }

    /**
     * This method is called when addFreeThrowTeamB button is clicked
     */
    public void addOneTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);

    }

    /**
     * This method is called when Reset button is clicked
     */
    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulsLakers = 0;
        foulsMiami = 0;
        displayFoulslaker(0);
        displayFoulsMiami(0);
        displayForTeamA(0);
        displayForTeamB(0);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_miami_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_lakers_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given fouls for Miami Heat
     */
    public void displayFoulsMiami(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_miami_fouls);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given fouls for Lakers
     */
    public void displayFoulslaker(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_lakers_fouls);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * This method is called when addOneFoulsMiami button is clicked
     */
    public void addOneFoulsMiami(View v) {
        foulsMiami = foulsMiami + 1;
        displayFoulsMiami(foulsMiami);

    }

    /**
     * This method is called when addOneFoulslakers button is clicked
     */
    public void addOneFoulslakers(View v) {
        foulsLakers = foulsLakers + 1;
        displayFoulslaker(foulsLakers);

    }
}



