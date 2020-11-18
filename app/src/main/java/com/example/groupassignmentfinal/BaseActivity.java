package com.example.groupassignmentfinal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.RecyclerView;

import java.text.DecimalFormat;

public class BaseActivity extends AppCompatActivity {

        private RecyclerView mRecyclerView;
        //    private RecyclerView mRecyclerView;
//    private RecyclerView.LayoutManager layoutManager;
        private ImageView fiveGames;
        private ImageView tenGames;
        private ImageView twentyGames;
        private ImageView fiftyGames;
        private ImageView fullMarks;
        private ImageView topCharts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_badges);

        fiveGames= findViewById(R.id.five_games);
        fiveGames.setVisibility(View.INVISIBLE);
        tenGames = findViewById(R.id.ten_games);
        tenGames.setVisibility(View.INVISIBLE);
        twentyGames = findViewById(R.id.twenty_games);
        twentyGames.setVisibility(View.INVISIBLE);
        fiftyGames = findViewById(R.id.fifty_games);
        fiftyGames.setVisibility(View.INVISIBLE);
        fullMarks = findViewById(R.id.full_marks);
        fullMarks.setVisibility(View.INVISIBLE);
        topCharts = findViewById(R.id.top_charts);
        topCharts.setVisibility(View.INVISIBLE);



            if(gameCount> 5){
                fiveGames.setVisibility(View.VISIBLE);
            }
            else(gameCount<5){
                fiveGames.setVisibility(View.INVISIBLE);
            }

            if(gameCount > 10){
                fiveGames.setVisibility(View.VISIBLE);
                tenGames.setVisibility(View.VISIBLE);
            }
            else if(gameCount<10){
                fiveGames.setVisibility(View.INVISIBLE);
                tenGames.setVisibility(View.INVISIBLE);
            }
            if(gameCount> 20) {
                fiveGames.setVisibility(View.VISIBLE);
                tenGames.setVisibility(View.VISIBLE);
                twentyGames.setVisibility(View.VISIBLE);
            }
            else if (gameCount<20){
                fiveGames.setVisibility(View.INVISIBLE);
                tenGames.setVisibility(View.INVISIBLE);
                twentyGames.setVisibility(View.INVISIBLE);
            }
            if(gameCount> 50) {
                fiveGames.setVisibility(View.VISIBLE);
                tenGames.setVisibility(View.VISIBLE);
                twentyGames.setVisibility(View.VISIBLE);
                fiftyGames.setVisibility(View.VISIBLE);
            }
            else if(gameCount< 50) {
                fiveGames.setVisibility(View.VISIBLE);
                tenGames.setVisibility(View.VISIBLE);
                twentyGames.setVisibility(View.VISIBLE);
                fiftyGames.setVisibility(View.VISIBLE);

        }
            if(score = 100) {
                fullMarks.setVisibility(View.VISIBLE);
            }
            else if(score<100) {
                fullMarks.setVisibility(View.VISIBLE);
            }

            //create a condition for top of the charts





        }
        //To-do select one game out of the list





    }
}
//}