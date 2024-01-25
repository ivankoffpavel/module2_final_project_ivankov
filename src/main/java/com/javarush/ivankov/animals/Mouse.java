package com.javarush.ivankov.animals;

import com.javarush.ivankov.animaltype.Predator;

public class Mouse extends Predator {
    private final double weight = 0.05;
    private double satiety = 0.01;
    private final int runAbility = 1;
    private final double maxSatiety = 0.01;

    public static int count;
    private int id = 0;

    public Mouse() {
        count++;
        id = count;
    }

    @Override
    public void eat() {
        System.out.println("Mouse ID:" + id + " is trying to eat.");
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

        Mouse mouse = (Mouse) o;

        if (Double.compare(satiety, mouse.satiety) != 0) return false;
        return id == mouse.id;
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

    public double getWeight() {
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
