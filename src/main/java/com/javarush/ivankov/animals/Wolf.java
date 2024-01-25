package com.javarush.ivankov.animals;

import com.javarush.ivankov.animaltype.Predator;

import java.util.Random;

public class Wolf extends Predator {
    private final double weight = 50;
    private int satiety = 4;
    private final int runAbility = 3;
    private final int maxSatiety = 8;

    public static int count;
    public static int maxNumberPerAreal = 30;
    private int id = 0;

    public Wolf() {
        count++;
        id = count;

    }

    @Override
    public void eat() {
        if(satiety < maxSatiety){
            System.out.println("Wolf ID:" + id + " is trying to eat.");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        Random random = new Random();
        System.out.println("Wolf is eating...");

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

        Wolf wolf = (Wolf) o;

        if (satiety != wolf.satiety) return false;
        return id == wolf.id;
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
