package com.javarush.ivankov.plants;

import com.javarush.ivankov.abstraction.Growable;
import com.javarush.ivankov.abstraction.Organism;

public abstract class Plant implements Organism, Growable {
    private int satiety = 100;

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }
}
