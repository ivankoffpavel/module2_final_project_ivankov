package com.javarush.ivankov.animals;

import com.javarush.ivankov.animaltype.Herbivores;

public class Caterpillar extends Herbivores {
    public static int count;
    private int id = 0;
    private final double weight = 0.01;
    private double satiety = 0;
    private final int runAbility = 0;
    private final double maxSatiety = 0;


    public Caterpillar() {
        count++;
        id = count;
    }

    @Override
    public void eat() {
        System.out.println("Caterpillar ID:" + id + " is trying to eat.");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void move() {

    }

    @Override
    public void reproduce() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Caterpillar that = (Caterpillar) o;

        return id == that.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    public int getId() {
        return id;
    }
}
