package com.javarush.ivankov.plants;

public class Grass extends Plant {
    private int id;
    public static int count = 0;

    public Grass() {
        count++;
        id = count;
    }

    @Override
    public void grow() {
        setSatiety(100);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Grass grass = (Grass) o;

        return id == grass.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    public int getId() {
        return id;
    }
}
