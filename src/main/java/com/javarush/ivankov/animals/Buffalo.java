package com.javarush.ivankov.animals;

import com.javarush.ivankov.abstraction.Organism;
import com.javarush.ivankov.animaltype.Herbivores;
import com.javarush.ivankov.animaltype.Type;
import com.javarush.ivankov.arealunit.Areal;
import com.javarush.ivankov.plants.Grass;

import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

public class Buffalo extends Herbivores {
    private final int weight = 700;
    private double satiety = 60;
    private final int runAbility = 3;
    private final double maxSatiety = 100;

    public static int count;
    private final int id;
    public String picture = "\uD83D\uDC03";

    public Buffalo() {
        count++;
        id = count;
    }

    @Override
    public void eat(Areal areal) {
        System.out.println("Buffalo ID:" + id + " is looking for eating.");
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
                        System.out.println("The horse ID: " + id + " ate.");
                        isAppropriate = true;
                    }else {
                        System.out.println("There's no food for buffalo.It's hungry.");
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

        Buffalo buffalo = (Buffalo) o;

        if (Double.compare(getSatiety(), buffalo.getSatiety()) != 0) return false;
        return getId() == buffalo.getId();
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getSatiety());
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + getId();
        return result;
    }

    public double getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
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
