package com.javarush.ivankov.animals;

import com.javarush.ivankov.animaltype.Predator;

public class Mouse extends Predator {
    public static int count;
    private int id = 0;

    public Mouse() {
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

        Mouse mouse = (Mouse) o;

        return id == mouse.id;
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
