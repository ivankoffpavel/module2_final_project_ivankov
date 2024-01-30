package com.javarush.ivankov.animals;

import com.javarush.ivankov.abstraction.Organism;
import com.javarush.ivankov.animaltype.Herbivores;
import com.javarush.ivankov.animaltype.Type;
import com.javarush.ivankov.arealunit.Areal;
import com.javarush.ivankov.plants.Grass;

import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

public class Sheep extends Herbivores {

    private final double weight = 70;
    private double satiety = 8;
    private final int runAbility = 3;
    private final double maxSatiety = 15;

    public static int count;
    private final int id;

    public Sheep() {
        count++;
        id = count;
    }

    @Override
    public void eat(Areal areal) {
        System.out.println("Sheep ID:" + id + " is looking for eating.");
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
                    Grass takenRandomGrass = (Grass) grassArrayList.get(randomIndex); //randomly looking for food type Grass
                    if (takenRandomGrass.getSatiety() > 30) {
                        satiety = Math.min(satiety + takenRandomGrass.getSatiety(), maxSatiety);//operate case when animal eats more than maxSatiety
                        takenRandomGrass.setSatiety(takenRandomGrass.getSatiety() - (maxSatiety - satiety));
                        System.out.println("The sheep ID: " + id + " ate.");
                        isAppropriate = true;
                    }else {
                        System.out.println("There's no food for sheep.It's hungry.");
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

        Sheep sheep = (Sheep) o;

        if (satiety != sheep.satiety) return false;
        return id == sheep.id;
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
