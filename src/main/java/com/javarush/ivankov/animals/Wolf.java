package com.javarush.ivankov.animals;

import com.javarush.ivankov.abstraction.Organism;
import com.javarush.ivankov.animaltype.Predator;
import com.javarush.ivankov.animaltype.Type;
import com.javarush.ivankov.arealunit.Areal;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Wolf extends Predator {
    private double satiety = 4;
    private final int runAbility = 3;
    private final double maxSatiety = 8;

    public static int count;
    public static int maxNumberPerAreal = 30;
    private final int id;

    public Wolf() {
        count++;
        id = count;

    }

    @Override
    public void eat(Areal areal) throws NoSuchFieldException, IllegalAccessException {

        if (satiety < maxSatiety) {
            System.out.println("Wolf ID:" + id + " is looking for eating.");
            int randomEat = ThreadLocalRandom.current().nextInt(0, 101);
            final Type currentType = getType(randomEat);

            for (Map.Entry<Type, ArrayList<Organism>> pair : areal.getArealMap().entrySet()) {
                if (pair.getKey().equals(currentType)) {
                    if (!pair.getValue().isEmpty()) {// check if collection has any value
                        Class<?> animalClass = pair.getValue().get(0).getClass();
                        Field fieldId = animalClass.getDeclaredField("id");
                        Field fieldWeight = animalClass.getDeclaredField("weight");
                        fieldId.setAccessible(true);
                        fieldWeight.setAccessible(true);
                        try{
                            Object idValue = fieldId.get(pair.getValue().get(0));
                            double weightValue = fieldWeight.getDouble(pair.getValue().get(0));
                            System.out.println("Wolf ID:" + id + " ate " + animalClass.getSimpleName() + " ID:"+idValue);
                            satiety = Math.min(satiety + weightValue, maxSatiety);
                            System.out.println("Wolf ID:"+id+" satiety "+satiety);
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                        pair.getValue().remove(0);


                    }else {
                        System.out.println("Wolf ID:" + id +"has not found a food");
                    }
                }
            }
        }
    }

    private static Type getType(int randomEat) {
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
        return currentType;
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

        if (Double.compare(getSatiety(), wolf.getSatiety()) != 0) return false;
        return getId() == wolf.getId();
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

    public void setSatiety(double satiety) {
        this.satiety = satiety;
    }

    public double getWeight() {
        double weight = 50;
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
