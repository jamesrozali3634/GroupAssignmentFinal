package com.example.groupassignmentfinal;

import android.annotation.SuppressLint;
import android.os.Bundle;


import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

 public class MainMenu extends AppCompatActivity {
      //private RecyclerView mRecyclerView;
      private Toolbar toolbar;
      //private RecyclerView rvList;
      private Button learn;
      private Button pratice;
      private Button quiz;
      private Button leader;
      private Button badges;
      private TextView title;



//    private RecyclerView mRecyclerView;
//    private RecyclerView.LayoutManager layoutManager;


@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

learn =findViewById(R.id.btn_Learn);
pratice =findViewById(R.id.btn_Practice);
quiz =findViewById(R.id.btn_Quiz);
leader =findViewById(R.id.btn_Leader);
badges =findViewById(R.id.btn_Badges);



//To-do select one game out of the list




    }
    public void showBadges(){

    }
    public void showLeaders(){

    }
     public void showPractice(){

     }
     public void showLearn(){

     }
     public void showQuiz(){

     }

    }
