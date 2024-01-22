package com.javarush.ivankov.plants;

import com.javarush.ivankov.abstraction.Growable;
import com.javarush.ivankov.abstraction.Organism;

public abstract class Plant implements Organism, Growable {
    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
