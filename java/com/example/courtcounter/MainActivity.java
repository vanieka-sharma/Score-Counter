package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int ScoreA = 0;
    int ScoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(ScoreA);
        displayForTeamB(ScoreB);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void pointThree(View view){
        ScoreA = ScoreA + 3;
        displayForTeamA(ScoreA);
    }
    public void pointTwo(View view){
        ScoreA = ScoreA + 2;
        displayForTeamA(ScoreA);
    }
    public void pointOne(View view){
        ScoreA = ScoreA + 1;
        displayForTeamA(ScoreA);
    }
    public void pointThrees(View view){
        ScoreB = ScoreB + 3;
        displayForTeamB(ScoreB);
    }
    public void pointTwos(View view){
        ScoreB = ScoreB + 2;
        displayForTeamB(ScoreB);
    }
    public void pointOnes(View view){
        ScoreB = ScoreB + 1;
        displayForTeamB(ScoreB);
    }
    public void reset(View view){
        ScoreA = 0;
        ScoreB = 0;
        displayForTeamA(ScoreA);
        displayForTeamB(ScoreB);

    }

}