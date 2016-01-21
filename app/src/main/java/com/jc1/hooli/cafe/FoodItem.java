package com.jc1.hooli.cafe;

import android.content.Intent;

public class FoodItem {

    private int weissmanScore;

    private String title;
    private String description;
    private double cost;

    public FoodItem(int weissmanScore, String title, String description, double cost) {
        this.weissmanScore = weissmanScore;
        this.title = title;
        this.description = description;
        this.cost = cost;
    }

    public FoodItem(Intent intent) {
        weissmanScore = intent.getIntExtra(MainActivity.EXTRA_FOODITEM_NUMBER, 0);
        title = intent.getStringExtra(MainActivity.EXTRA_TITLE);
        description = intent.getStringExtra(MainActivity.EXTRA_DESC);
        cost = intent.getDoubleExtra(MainActivity.EXTRA_COST, 0);
    }

    public int getWeissmanScore() {
        return weissmanScore;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }

    public String getImageName() {
        return "image_" + weissmanScore;
    }

    @Override
    public String toString() {
        return title;
    }
}
