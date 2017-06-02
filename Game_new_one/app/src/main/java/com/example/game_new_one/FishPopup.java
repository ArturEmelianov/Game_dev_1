package com.example.game_new_one;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.game_new_one.model.Fish;
import com.example.game_new_one.model.FishCollection;

import java.util.ArrayList;

/**
 * Created by Артур on 31.05.2017.
 */

public class FishPopup extends Activity { //popup window, containig information about the fish

    public ImageView iv_fish;
    public Fish fish;
    public TextView tv_fish_name, tv_fish_price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fishpopup);

        Intent intent = getIntent();
        int position = intent.getIntExtra("fish",-1);

        FishCollection inst = FishCollection.getInstance();


        fish = inst.getFish(position);

        inst.addScore(fish.getScore());

        iv_fish = (ImageView)findViewById(R.id.iv_fish);
        iv_fish.setImageResource(fish.getImage());

        tv_fish_name = (TextView)findViewById(R.id.tv_fish_name);
        tv_fish_price = (TextView)findViewById(R.id.tv_fish_price);

        tv_fish_name.setText(fish.getName());
        tv_fish_price.setText(String.valueOf(fish.getScore()));

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.6));
    }
}
