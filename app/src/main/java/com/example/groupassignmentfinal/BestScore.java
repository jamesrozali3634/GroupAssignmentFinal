package com.example.groupassignmentfinal;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BestScore extends AppCompatActivity {
    private TextView scores;
    private int lastScore;
    private int top1, top2, top3;

    //Load scores from Graces Quiz/database - Score needs to be saved at end of game.
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.best_score);

        scores = (TextView) findViewById(R.id.score_id);

        SharedPreferences preferences = getSharedPreferences("PREFS",0);
        lastScore = preferences.getInt("lastScore", 0);
        top1 = preferences.getInt("top1",0);
        top2 = preferences.getInt("top2",0);
        top3 = preferences.getInt("top3",0);

//if there is a high score it will replaced
        if(lastScore > top3){
            top3 = lastScore;
            SharedPreferences.Editor editor = preferences.edit();
            editor.putInt("top3", top3);
            editor.apply();
        }
        if(lastScore > top2){
            int temp = top2;
            top3 = lastScore;
            top3 = temp;
            SharedPreferences.Editor editor = preferences.edit();
            editor.putInt("top3", top3);
            editor.putInt("top2", top2);
            editor.apply();
        }
        if(lastScore > top1){
            int temp = top1;
            top2 = lastScore;
            top2 = temp;
            SharedPreferences.Editor editor = preferences.edit();
            editor.putInt("top2", top2);
            editor.putInt("top1", top1);
            editor.apply();
        }


//display your top scores in game
        scores.setText("LAST SCORE:" + lastScore + "\n" +

                        "TOP 1: " + top1 +   "\n"  +
                        "TOP 2: " + top2 +   "\n"  +
                        "TOP 3: " + top3);


    }
}
