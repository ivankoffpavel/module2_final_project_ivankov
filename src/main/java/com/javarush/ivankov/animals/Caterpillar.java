package com.javarush.ivankov.animals;

import com.javarush.ivankov.abstraction.Organism;
import com.javarush.ivankov.animaltype.Herbivores;
import com.javarush.ivankov.animaltype.Type;
import com.javarush.ivankov.arealunit.Areal;
import com.javarush.ivankov.plants.Grass;

import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

public class Caterpillar extends Herbivores {
    public static int count;
    private int id = 0;
    private final double weight = 0.01;
    private double satiety = 0;
    private final int runAbility = 0;
    private final double maxSatiety = 0;


    public Caterpillar() {
        count++;
        id = count;
    }

    @Override
    public void eat(Areal areal) {
        System.out.println("Caterpillar ID:" + id + " is looking for eating.");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);//for better project visualisation made a delay 250 ms
        }

        for (Map.Entry<Type, ArrayList<Organism>> pair : areal.getArealMap().entrySet()) {
            if (pair.getKey().equals(eatType)) {
                ArrayList<Organism> grassArrayList = pair.getValue();
                Random random = new Random();
                boolean isAppropriate = false;
                while (!isAppropriate) {
                    int randomIndex = random.nextInt(grassArrayList.size());
                    Grass takenRandomGrass = (Grass) grassArrayList.get(randomIndex);
                    if (takenRandomGrass.getSatiety() > 30) {
                        satiety = Math.min(satiety + takenRandomGrass.getSatiety(), maxSatiety);
                        takenRandomGrass.setSatiety(takenRandomGrass.getSatiety() - (maxSatiety - satiety));
                        System.out.println("The caterpillar ID: " + id + " ate.");
                        isAppropriate = true;
                    }else {
                        System.out.println("There's no food for caterpillar.It's hungry.");
                    }
                }
            }
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

        Caterpillar that = (Caterpillar) o;

        return id == that.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    public int getId() {
        return id;
    }
}
