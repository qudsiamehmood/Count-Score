package com.example.android.countscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA=0;
    int scoreTeamB=0;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void DisplayForTeamA(int ScoreA)
    {
        TextView scoreView=(TextView) findViewById(R.id.Team_A_Score);
        scoreView.setText(String.valueOf(ScoreA));

    }
    public void AddThreeToA(View v)
    {
        scoreTeamA=scoreTeamA+3;

        DisplayForTeamA(scoreTeamA);

    }
    public void AddTwoToA(View v)
    {
        scoreTeamA=scoreTeamA+2;
        DisplayForTeamA(scoreTeamA);

    }
    public void FreethrowfToA(View v)
    {
        scoreTeamA=scoreTeamA+1;
        DisplayForTeamA(scoreTeamA);

    }
    public void DisplayForTeamB(int ScoreB)
    {
        TextView scoreView=(TextView) findViewById(R.id.Team_B_Score);
        scoreView.setText(String.valueOf(ScoreB));

    }
    public void AddThreeToB(View v)
    {
        scoreTeamB=scoreTeamB+3;
        DisplayForTeamB(scoreTeamB);

    }
    public void AddTwoToB(View v)
    {
        scoreTeamB=scoreTeamB+2;
        DisplayForTeamB(scoreTeamB);

    }
    public void FreethrowfToB(View v)
    {
        scoreTeamB=scoreTeamB+1;
        DisplayForTeamB(scoreTeamB);

    }
    public void resetScore(View v)
    {
        scoreTeamA=0;
        scoreTeamB=0;
        DisplayForTeamA(scoreTeamA);
        DisplayForTeamB(scoreTeamB);

    }

}
