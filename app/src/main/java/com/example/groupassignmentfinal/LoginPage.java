package com.example.groupassignmentfinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginPage extends AppCompatActivity {
    private TextView loginText;
    private TextView passText;
    private TextView passField;
    private TextView loginField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);

        loginText = findViewById(R.id.loginText);
        passText = findViewById(R.id.passText);
        passField = findViewById(R.id.passid);
        loginField = findViewById(R.id.name);
    }

    public void movepage(View v)
    {
        String stname = loginField.getText().toString();
        String passname = passField.getText().toString();

        //create a query from the database and if statement

        if(stname.equals("") && passname.equals(""))

            {
                Intent in = new Intent(LoginPage.this, MainActivity.class);
                startActivity(in);
            }

        else if (stname.equals("") || passname.equals(""))
                Toast.makeText(getBaseContext(),"Enter zid and pass",Toast.LENGTH_SHORT.show();


            else {
                Toast.makeText(getBaseContext(),"incorrect pass", Toast.LENGTH_SHORT.show();
            }
        }
}



