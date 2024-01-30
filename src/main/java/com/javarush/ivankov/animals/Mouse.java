package com.javarush.ivankov.animals;

import com.javarush.ivankov.abstraction.Organism;
import com.javarush.ivankov.animaltype.Herbivores;
import com.javarush.ivankov.animaltype.Type;
import com.javarush.ivankov.arealunit.Areal;
import com.javarush.ivankov.plants.Grass;

import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

public class Mouse extends Herbivores {
    private final double weight = 0.05;
    private double satiety = 0.01;
    private final int runAbility = 1;
    private final double maxSatiety = 0.01;

    public static int count;
    private int id = 0;

    public Mouse() {
        count++;
        id = count;
    }

    @Override
    public void eat(Areal areal) {
        System.out.println("Mouse ID:" + id + " is looking for eating.");

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
                        System.out.println("The mouse ID: " + id + " ate.");
                        isAppropriate = true;
                    }else {
                        System.out.println("There's no food for mouse.It's hungry.");
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

        Mouse mouse = (Mouse) o;

        if (Double.compare(satiety, mouse.satiety) != 0) return false;
        return id == mouse.id;
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
