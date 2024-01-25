package com.javarush.ivankov.animals;

import com.javarush.ivankov.animaltype.Predator;

public class Fox extends Predator {
    public static int count;
    private int id = 0;
    private final int weight = 8;
    private int satiety = 1;
    private final int runAbility = 2;
    private final int maxSatiety = 2;

    public Fox() {
        count++;
        id = count;
    }

    @Override
    public void eat() {
        System.out.println("Fox ID:" + id + " is trying to eat.");
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

        Fox fox = (Fox) o;

        if (id != fox.id) return false;
        return satiety == fox.satiety;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + satiety;
        return result;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public int getId() {
        return id;
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
