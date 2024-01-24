package com.javarush.ivankov.animals;

import com.javarush.ivankov.animaltype.Herbivores;

public class Duck extends Herbivores {
    public static int count;
    private int id = 0;

    public Duck() {
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

        Duck duck = (Duck) o;

        return id == duck.id;
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
