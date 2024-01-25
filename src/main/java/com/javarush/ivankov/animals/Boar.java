package com.javarush.ivankov.animals;

import com.javarush.ivankov.animaltype.Predator;

public class Boar extends Predator {
    private final int weight = 400;
    private int satiety = 35;
    private final int runAbility = 2;
    private final int maxSatiety = 50;

    public static int count;
    private int id = 0;

    public Boar() {
        count++;
        id = count;
    }

    @Override
    public void eat() {
        System.out.println("Boar ID:" + id + " is trying to eat.");
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

        Boar boar = (Boar) o;

        if (satiety != boar.satiety) return false;
        return id == boar.id;
    }

    @Override
    public int hashCode() {
        int result = satiety;
        result = 31 * result + id;
        return result;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWeight() {
        return weight;
    }

    public int getRunAbility() {
        return runAbility;
    }

    public int getMaxSatiety() {
        return maxSatiety;
    }
}
