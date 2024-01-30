package com.javarush.ivankov.animals;

import com.javarush.ivankov.animaltype.Predator;
import com.javarush.ivankov.arealunit.Areal;

public class Boa extends Predator  {
    private final int weight = 15;
    private double satiety = 1.7999999999999998;
    private final int runAbility = 1;
    private final double maxSatiety = 3;

    public static int count;
    private int id = 0;

    public Boa() {
        count++;
        id = count;
    }

    @Override
    public void eat(Areal areal) {
        System.out.println("Boa ID:" + id + " is looking for eating.");


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

        Boa boa = (Boa) o;

        if (Double.compare(satiety, boa.satiety) != 0) return false;
        return id == boa.id;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(satiety);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + id;
        return result;
    }

    public double getSatiety() {
        return satiety;
    }

    public void setSatiety(double satiety) {
        this.satiety = satiety;
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

    public int getId() {
        return id;
    }
}
