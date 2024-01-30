package com.javarush.ivankov.animals;

import com.javarush.ivankov.animaltype.Predator;
import com.javarush.ivankov.arealunit.Areal;

public class Eagle extends Predator {
    public static int count;
    private int id = 0;
    private final int weight = 6;
    private double satiety = 0.5;
    private final int runAbility = 3;
    private final double maxSatiety = 1;


    public Eagle() {
        count++;
        id = count;
    }

    @Override
    public void eat(Areal areal) {
        System.out.println("Eagle ID:" + id + " is looking for eating.");


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

        Eagle eagle = (Eagle) o;

        if (id != eagle.id) return false;
        return Double.compare(satiety, eagle.satiety) == 0;
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
