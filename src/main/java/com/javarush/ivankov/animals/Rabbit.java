package com.javarush.ivankov.animals;

import com.javarush.ivankov.abstraction.Eatable;
import com.javarush.ivankov.abstraction.Movable;
import com.javarush.ivankov.abstraction.Organism;
import com.javarush.ivankov.abstraction.Reproducable;
import com.javarush.ivankov.animaltype.Herbivores;
import com.javarush.ivankov.animaltype.Type;
import com.javarush.ivankov.arealunit.Areal;
import com.javarush.ivankov.plants.Grass;

import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

public class Rabbit extends Herbivores implements Eatable, Movable, Reproducable {
    private final double weight = 2;
    private double satiety = 0.35;
    private final int runAbility = 2;
    private final double maxSatiety = 0.45;

    public static int count;
    private final int id;

    public Rabbit() {
        count++;
        id = count;
    }

    @Override
    public void eat(Areal areal) {
        System.out.println("Rabbit ID:" + id + " is looking for eating.");
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
                        System.out.println("The rabbit ID: " + id + " ate.");
                        isAppropriate = true;
                    }else {
                        System.out.println("There's no food for rabbit.It's hungry.");
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

        Rabbit rabbit = (Rabbit) o;

        if (Double.compare(satiety, rabbit.satiety) != 0) return false;
        return id == rabbit.id;
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
