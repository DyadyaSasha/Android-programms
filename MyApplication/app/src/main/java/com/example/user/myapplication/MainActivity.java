package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mCrowsCounterButton;
    private int mCount = 0;
    private int mCountCat = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCrowsCounterButton = (Button)findViewById(R.id.button2);
        mCrowsCounterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView mInfoTextView = (TextView)findViewById(R.id.textView2);
                mInfoTextView.setText("Я насчитал " + ++mCount + " ворон");
            }
        });
    }

    public void onClick(View view) {
        TextView helloTextView = (TextView)findViewById(R.id.textView);
        helloTextView.setText("Hello Kitty!");
    }

    public void onClick3(View view) {
        TextView mInfoTextView = (TextView)findViewById(R.id.textView3);
        mInfoTextView.setText("Я насчитал " + ++mCountCat + " котят");
    }
}
