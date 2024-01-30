package com.javarush.ivankov.Initialization;

import com.javarush.ivankov.abstraction.Organism;
import com.javarush.ivankov.animals.*;
import com.javarush.ivankov.animaltype.Type;
import com.javarush.ivankov.arealunit.Areal;
import com.javarush.ivankov.plants.Grass;

import java.util.*;

public class InitializeField {
    public int length = 2;
    public int width = 3;
    private final ArrayList<ArrayList<Areal>> residents = new ArrayList<>();//arraylist that contains nested arraylist with areal objects
    HashMap<Type, ArrayList<Double>> mapParam = new HashMap<>();//map for saving parameters of object animal

    public void fillField() {
        int n = 0;
        for (int i = 0; i < width; i++) {
            ArrayList<Areal> list = new ArrayList<>();
            for (int j = 0; j < length; j++) {
                Areal areal = new Areal(i, j, new HashMap<>());
                n++;

                addPlantsToAreal(areal); //adding plants to areal unit of island

                addAnimalsToAreal(areal); //adding animals to areal unit of island

                list.add(areal);//add an areal object to length column arraylist

            }
            residents.add(list);//add an arraylist of length column to main arraylist

        }
        System.out.println("Number of animal areals " + n + " were created...");
        System.out.println("Number of " + Type.GRASS + " on total areals " + Grass.count + " were created...");
        System.out.println("Number of " + Type.BEAR + " on total areals " + Bear.count + " were created...");
        System.out.println("Number of " + Type.BOA + " on total areals " + Boa.count + " were created...");
        System.out.println("Number of " + Type.BOAR + " on total areals " + Boar.count + " were created...");
        System.out.println("Number of " + Type.BUFFALO + " on total areals " + Buffalo.count + " were created...");
        System.out.println("Number of " + Type.CATERPILLAR + " on total areals " + Caterpillar.count + " were created...");
        System.out.println("Number of " + Type.DEER + " on total areals " + Deer.count + " were created...");
        System.out.println("Number of " + Type.DUCK + " on total areals " + Duck.count + " were created...");
        System.out.println("Number of " + Type.EAGLE + " on total areals " + Eagle.count + " were created...");
        System.out.println("Number of " + Type.FOX + " on total areals " + Fox.count + " were created...");
        System.out.println("Number of " + Type.GOAT + " on total areals " + Goat.count + " were created...");
        System.out.println("Number of " + Type.HORSE + " on total areals " + Horse.count + " were created...");
        System.out.println("Number of " + Type.MOUSE + " on total areals " + Mouse.count + " were created...");
        System.out.println("Number of " + Type.RABBIT + " on total areals " + Rabbit.count + " were created...");
        System.out.println("Number of " + Type.SHEEP + " on total areals " + Sheep.count + " were created...");
        System.out.println("Number of " + Type.WOLF + " on total areals " + Wolf.count + " were created...");

    }

    public void addPlantsToAreal(Areal areal) {
        int plantsNumber;
        Random random = new Random();
        plantsNumber = random.nextInt(201); // randomize the number of grass
        areal.getArealMap().put(Type.GRASS, new ArrayList<>());
        for (int i = 0; i < plantsNumber; i++) {
            areal.getArealMap().get(Type.GRASS).add(new Grass());
        }
    }

    public void addAnimalsToAreal(Areal areal) {
        Random random = new Random();
        ArrayList<Integer> maxNumberPerAreal = new ArrayList<>(Arrays.asList(30, 30, 5, 20, 30, 20, 20, 500, 140, 150, 140, 50, 10,
                200, 1000));//this arraylist contains values of max quantity of animal type on area unit
        Type[] types = Type.values();
        for (int i = 0; i < types.length - 1; i++) {
            areal.getArealMap().put(types[i], new ArrayList<>());
            for (int j = 0; j < random.nextInt(maxNumberPerAreal.get(i)+1); j++) {
                areal.getArealMap().get(types[i]).add(animalFactoryByType(types[i]));

            }
        }
    }

    public Organism animalFactoryByType(Type type) { //factory method for creating object by type
        Organism returnType = null;
        switch (type) {
            case BOA:
                returnType = new Boa();
                break;
            case BEAR:
                returnType = new Bear();
                break;
            case BOAR:
                returnType = new Boar();
                break;
            case BUFFALO:
                returnType = new Buffalo();
                break;
            case CATERPILLAR:
                returnType = new Caterpillar();
                break;
            case DEER:
                returnType = new Deer();
                break;
            case DUCK:
                returnType = new Duck();
                break;
            case EAGLE:
                returnType = new Eagle();
                break;
            case FOX:
                returnType = new Fox();
                break;
            case GOAT:
                returnType = new Goat();
                break;
            case HORSE:
                returnType = new Horse();
                break;
            case MOUSE:
                returnType = new Mouse();
                break;
            case RABBIT:
                returnType = new Rabbit();
                break;
            case SHEEP:
                returnType = new Sheep();
                break;
            case WOLF:
                returnType = new Wolf();
                break;
        }
        return returnType;
    }

    public ArrayList<ArrayList<Areal>> getField() {
        return residents;
    }

}
