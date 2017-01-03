package com.example.user.myapplication3;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView text;
    private RelativeLayout rellayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView)findViewById(R.id.textView3);
        rellayout = (RelativeLayout)findViewById(R.id.activity_main);
        final Button button = (Button)findViewById(R.id.buttonYellow);
        button.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M) // annotation for correct working getColor() method
            @Override
            public void onClick(View v) {
                text.setText(R.string.Yellow);
                Toast.makeText(MainActivity.this, "You choose yellow", Toast.LENGTH_SHORT).show();
                rellayout.setBackgroundColor(getResources().getColor(R.color.yellowColor, null));
            }
        });
    }

    public void onRedButtonClick(View view) {
        text.setText(R.string.Red);
        Toast.makeText(this, "You choose red", Toast.LENGTH_SHORT).show();
        rellayout.setBackgroundColor(getResources().getColor(R.color.redColor));
    }


    public void onGreenButtonClick(View view) {
        text.setText(R.string.Green);
        Toast.makeText(this, "You choose green", Toast.LENGTH_SHORT).show();
        rellayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.greenColor));
    }

//    public void ManyButtonClick(View view){ //for many buttons with simular property android:onClick
//        switch (view.getId()){
//            case R.id.buttonRed:
//                Toast.makeText(this, "You choose red", Toast.LENGTH_SHORT).show();
//                rellayout.setBackgroundColor(getResources().getColor(R.color.redColor));
//                break;
//            case R.id.buttonYellow:
//                Toast.makeText(this, "You choose yellow", Toast.LENGTH_SHORT).show();
//                rellayout.setBackgroundColor(getResources().getColor(R.color.yellowColor));
//                break;
//            case R.id.buttonGreen:
//                Toast.makeText(this, "You choose green", Toast.LENGTH_SHORT).show();
//                rellayout.setBackgroundColor(getResources().getColor(R.color.greenColor));
//        }
//    }
}
