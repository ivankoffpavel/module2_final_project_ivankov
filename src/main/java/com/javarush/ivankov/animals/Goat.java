package com.javarush.ivankov.animals;

import com.javarush.ivankov.animaltype.Herbivores;

public class Goat extends Herbivores {
    public static int count;
    private int id = 0;

    public Goat() {
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

        Goat goat = (Goat) o;

        return id == goat.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    public static int getCount() {
        return count;
    }

    public int getId() {
        return id;
    }
}
