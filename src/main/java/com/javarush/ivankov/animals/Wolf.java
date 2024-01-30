package com.javarush.ivankov.animals;

import com.javarush.ivankov.abstraction.Organism;
import com.javarush.ivankov.animaltype.Predator;
import com.javarush.ivankov.animaltype.Type;
import com.javarush.ivankov.arealunit.Areal;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Wolf extends Predator {
    private final double weight = 50;
    private int satiety = 4;
    private final int runAbility = 3;
    private final int maxSatiety = 8;

    public static int count;
    public static int maxNumberPerAreal = 30;
    private int id;

    public Wolf() {
        count++;
        id = count;

    }

    @Override
    public void eat(Areal areal)  {

        if (satiety < maxSatiety) {
            System.out.println("Wolf ID:" + id + " is looking for eating.");
            int randomEat = ThreadLocalRandom.current().nextInt(0, 101);
            Type currentType = null;
            if (randomEat > 0 && randomEat <= 8) {
                currentType = Type.HORSE;
            }
            if (randomEat > 8 && randomEat <= 15) {
                currentType = Type.BUFFALO;
            }

            if (randomEat > 15 && randomEat <= 25) {
                currentType = Type.DEER;
            }
            if (randomEat > 25 && randomEat <= 35) {
                currentType = Type.BOAR;
            }
            if (randomEat > 35 && randomEat <= 45) {
                currentType = Type.DUCK;
            }
            if (randomEat > 45 && randomEat <= 60) {
                currentType = Type.GOAT;
            }
            if (randomEat > 60 && randomEat <= 75) {
                currentType = Type.SHEEP;
            }
            if (randomEat > 75 && randomEat <= 100) {
                currentType = Type.MOUSE;
            }

            for (Map.Entry<Type, ArrayList<Organism>> pair : areal.getArealMap().entrySet()) {
                if (pair.getKey().equals(currentType)) {
                    if (!pair.getValue().isEmpty()) {// check if collection has any value
                        Class<? extends Organism> animalClass = pair.getValue().get(0).getClass();




                            System.out.println("Wolf ID:"+id+" ate "+animalClass.getSimpleName());
                            pair.getValue().remove(0);

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

        Wolf wolf = (Wolf) o;

        if (satiety != wolf.satiety) return false;
        return id == wolf.id;
    }

    @Override
    public int hashCode() {
        int result = satiety;
        result = 31 * result + id;
        return result;
    }

    public int getSatiety() {
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

    public int getMaxSatiety() {
        return maxSatiety;
    }


    public int getId() {
        return id;
    }
}
