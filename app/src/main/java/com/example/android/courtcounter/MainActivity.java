package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int teamAScore;
    private int teamBScore;
    private final int SCORE_3_POINTS=3;
    private final int SCORE_2_POINTS=2;
    private final int SCORE_FREE_THROW=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addThreePointsA(View view){
        teamAScore +=SCORE_3_POINTS;
        displayForTeamA(teamAScore);
    }

    public void addTwoPointsA(View view){
        teamAScore+=SCORE_2_POINTS;
        displayForTeamA(teamAScore);
    }
    public void freeThrowA(View view){
        teamAScore +=SCORE_FREE_THROW;
        displayForTeamA(teamAScore);
    }

    public void addThreePointsB(View view){
        teamBScore +=SCORE_3_POINTS;
        displayForTeamB(teamBScore);
    }

    public void addTwoPointsB(View view){
        teamBScore+=SCORE_2_POINTS;
        displayForTeamB(teamBScore);
    }
    public void freeThrowB(View view){
        teamBScore +=SCORE_FREE_THROW;
        displayForTeamB(teamBScore);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
