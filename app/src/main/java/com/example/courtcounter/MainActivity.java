package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamAScore = 0;
    int teamBScore = 0;

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int teamBScore) {
        TextView teamBScoreView = (TextView) findViewById(R.id.team_b_score);
        teamBScoreView.setText(String.valueOf(teamBScore));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }
    /**
     * Displays the given teamAScore for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void threePointIncrement(View v) {
        teamAScore = teamAScore + 3;
        displayForTeamA(teamAScore);
    }
    public void twoPointIncrement(View v) {
        teamAScore = teamAScore + 2;
        displayForTeamA(teamAScore);
    }
    public void freeThrow(View v) {
        teamAScore = teamAScore + 1;
        displayForTeamA(teamAScore);
    }

    public void threePointIncrementB(View v) {
        teamBScore = teamBScore + 3;
        displayForTeamB(teamBScore);
    }
    public void twoPointIncrementB(View v) {
        teamBScore = teamBScore + 2;
        displayForTeamB(teamBScore);
    }
    public void freeThrowB(View v) {
        teamBScore = teamBScore + 1;
        displayForTeamB(teamBScore);
    }
    public void reset(View v) {
        teamBScore = 0;
        teamAScore = 0;
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }
}