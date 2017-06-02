package com.example.game_new_one.model;

/**
 * Created by Артур on 29.05.2017.
 */

public class Fish {
    private int image;
    private String name;
    private int weight;
    private int score;

    public Fish(int image, String name, int weight, int score) {
        this.image = image;
        this.name = name;
        this.weight = weight;
        this.score = score;
    }

    public int getImage() { return image; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String toString() {
        return name+" "+weight+" "+score;
    }
}
