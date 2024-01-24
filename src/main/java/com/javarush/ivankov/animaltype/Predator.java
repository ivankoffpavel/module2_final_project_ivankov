package com.javarush.ivankov.animaltype;

import com.javarush.ivankov.abstraction.Eatable;
import com.javarush.ivankov.abstraction.Movable;
import com.javarush.ivankov.abstraction.Organism;
import com.javarush.ivankov.abstraction.Reproducable;

public abstract class Predator implements Eatable, Movable, Reproducable, Organism
{
    private double weight;
    private int satiety;
    private int runAbility;

    @Override
    public String toString() {
        return "Predator{" +
                "weight=" + weight +
                ", satiety=" + satiety +
                ", runAbility=" + runAbility +
                '}';
    }
}
