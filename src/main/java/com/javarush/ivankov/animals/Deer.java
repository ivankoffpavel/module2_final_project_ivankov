package com.javarush.ivankov.animals;

import com.javarush.ivankov.animaltype.Herbivores;

public class Deer extends Herbivores {
    public static int count;
    private int id = 0;
    private final int weight = 300;
    private int satiety = 35;
    private final int runAbility = 4;
    private final int maxSatiety = 50;


    public Deer() {
        count++;
        id = count;
    }

    @Override
    public void eat() {
        System.out.println("Deer ID:" + id + " is trying to eat.");
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

        Deer deer = (Deer) o;

        if (getId() != deer.getId()) return false;
        return getSatiety() == deer.getSatiety();
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + getSatiety();
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
}
