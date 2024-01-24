package com.javarush.ivankov.arealunit;

import com.javarush.ivankov.abstraction.Organism;
import com.javarush.ivankov.animaltype.Type;

import java.util.HashMap;
import java.util.HashSet;

public class Areal {
    public static int arealCount = 0;
    private int id = 0;

    private HashMap<Type, HashSet<Organism>> arealMap;

    public Areal(HashMap<Type, HashSet<Organism>> arealMap) {

        this.arealMap = arealMap;
        arealCount++;
        id = arealCount;
    }

    public HashMap<Type, HashSet<Organism>> getArealMap() {
        return arealMap;
    }

    public int getId() {
        return id;
    }
    public int getArealCount(){
        return arealCount;
    }

}