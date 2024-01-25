package com.javarush.ivankov.animals;

import com.javarush.ivankov.animaltype.Herbivores;

public class Duck extends Herbivores {
    public static int count;
    private int id = 0;
    private final int weight = 1;
    private double satiety = 0.09;
    private final int runAbility = 4;
    private final double maxSatiety = 0.15;


    public Duck() {
        count++;
        id = count;
    }

    @Override
    public void eat() {
        System.out.println("Duck ID:" + id + " is trying to eat.");
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

        Duck duck = (Duck) o;

        if (id != duck.id) return false;
        return Double.compare(satiety, duck.satiety) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        temp = Double.doubleToLongBits(satiety);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public double getSatiety() {
        return satiety;
    }

    public void setSatiety(double satiety) {
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

    public double getMaxSatiety() {
        return maxSatiety;
    }
}
