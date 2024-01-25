package com.javarush.ivankov.animals;

import com.javarush.ivankov.animaltype.Predator;

public class Bear extends Predator {
    private final int weight = 500;
    private int satiety = 60;
    private final int runAbility = 2;
    private final int maxSatiety = 80;

    public static int count;
    private int id = 0;

    public Bear() {
        count++;
        id = count;
    }

    @Override
    public void eat() {
        System.out.println("Bear ID:" + id + " is trying to eat.");
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

        Bear bear = (Bear) o;

        if (satiety != bear.satiety) return false;
        return id == bear.id;
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

    public int getWeight() {
        return weight;
    }

    public int getRunAbility() {
        return runAbility;
    }

    public int getMaxSatiety() {
        return maxSatiety;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
