package com.example.csc250_mergesort_spring2021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private EditText inputET;
    private TextView answerTV;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.inputET = this.findViewById(R.id.inputET);
        this.answerTV = this.findViewById(R.id.answerTV);
    }

    public void onFactorialButtonClicked(View v)
    {
        String currValue = this.inputET.getText().toString();
        int answer = factorial(Integer.parseInt(currValue));
        this.answerTV.setText("" + answer);
    }

    public int factorial(int n)
    {
        if(n == 1)
        {
            return 1;
        }
        else
        {
            return n * factorial(n - 1);
        }
    }

}