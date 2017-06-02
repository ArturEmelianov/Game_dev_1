package com.example.game_new_one;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.game_new_one.model.Fish;
import com.example.game_new_one.model.FishCollection;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity { //main activity, contains the game
    private TextView tv1;
    public ImageView iv_b,iv_1;
    public FishCollection fc;
    public ArrayList<Fish> arr;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fc = FishCollection.getInstance();
        arr = fc.getArr();


        setContentView(R.layout.activity_main);
        iv_b = (ImageView)findViewById(R.id.iv_background);
        iv_b.setImageResource(R.drawable.bac1);
        iv_1 = (ImageView)findViewById(R.id.iv_rod1);
        iv_1.setImageResource(R.drawable.rod1);


        iv_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv_1.setImageResource(R.drawable.rod2);
                timer((int)(Math.random()*6+1));
            }
        });
    }

    public void timer(int time) { //timer, which executes a fishpopup activity with information about the caught fish
        new CountDownTimer(time*1000,1000) {

            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                fc = FishCollection.getInstance();
                tv1 = (TextView)findViewById(R.id.tv_add_score);
                tv1.setText(String.valueOf(fc.getScore()));
                //tv1.setText("asd");
                iv_1.setImageResource(R.drawable.rod1);
                iv_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        iv_1.setImageResource(R.drawable.rod2);
                        timer((int)(Math.random()*6+1));
                    }
                });
                Intent intent = new Intent(MainActivity.this, FishPopup.class);
                intent.putExtra("fish",(int)Math.random()*2);
                startActivity(intent);
                //Toast.makeText(MainActivity.this,arr.get(1).toString(),Toast.LENGTH_SHORT).show();
            }
        }.start();
    }
}
