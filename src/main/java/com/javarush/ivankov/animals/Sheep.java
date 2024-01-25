package com.javarush.ivankov.animals;

import com.javarush.ivankov.animaltype.Herbivores;

public class Sheep extends Herbivores {
    private final double weight = 70;
    private int satiety = 8;
    private final int runAbility = 3;
    private final int maxSatiety = 15;

    public static int count;
    private int id = 0;

    public Sheep() {
        count++;
        id = count;
    }

    @Override
    public void eat() {
        System.out.println("Sheep ID:" + id + " is trying to eat.");
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

        Sheep sheep = (Sheep) o;

        if (satiety != sheep.satiety) return false;
        return id == sheep.id;
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

    public double getWeight() {
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
}
