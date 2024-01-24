package com.javarush.ivankov.animals;

import com.javarush.ivankov.animaltype.Predator;

public class Wolf extends Predator {
    public static int count;
    private int id = 0;

    public Wolf() {
        count++;
        id = count;

    }

    @Override
    public void eat() {

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

        return getId() == wolf.getId();
    }

    @Override
    public int hashCode() {
        return getId();
    }

    public int getId() {
        return id;
    }

    public static int getCount() {
        return count;
    }
}
