package com.example.game_new_one.model;

import com.example.game_new_one.R;

import java.util.ArrayList;

/**
 * Created by Артур on 29.05.2017.
 */
public class FishCollection {
    private ArrayList<Fish> arr_fish;
    private int score;

    private static FishCollection ourInstance = null;

    public static FishCollection getInstance() {
        if (ourInstance == null) {
            ourInstance = new FishCollection();
        }
        return ourInstance;
    }

    public void addFish(Fish fish) {
        arr_fish.add(fish);
    }

    public Fish getFish(int pos) { return arr_fish.get(pos); }

    public int getScore() { return score; }

    public void addScore(int score) { this.score+=score; }

    private FishCollection() {
        score = 0;
        arr_fish = new ArrayList<Fish>();
        addDummyData();
    }

    public ArrayList<Fish> getArr() {
        return arr_fish;
    }


    private void addDummyData() {
        addFish(new Fish(R.drawable.fish1,"fish1",10,5));
        addFish(new Fish(R.drawable.fish2,"fish2",7,3));
    }
}
