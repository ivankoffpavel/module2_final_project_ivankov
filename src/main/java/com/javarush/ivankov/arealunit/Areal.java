package com.javarush.ivankov.arealunit;

import com.javarush.ivankov.abstraction.Organism;
import com.javarush.ivankov.animaltype.Type;

import java.util.ArrayList;
import java.util.HashMap;

public class Areal {
    public static int arealCount = 0;
    private int id = 0;
    private final int widthValue;
    private final int lengthValue;

    private final HashMap<Type, ArrayList<Organism>> arealMap;

    public Areal(int widthValue,int lengthValue,HashMap<Type, ArrayList<Organism>> arealMap) {
        this.widthValue = widthValue;
        this.lengthValue = lengthValue;
        this.arealMap = arealMap;
        arealCount++;
        id = arealCount;
    }

    public HashMap<Type, ArrayList<Organism>> getArealMap() {
        return arealMap;
    }

    public int getId() {
        return id;
    }
    public int getArealCount(){
        return arealCount;
    }

    public int getWidthValue() {
        return widthValue;
    }

    public int getLengthValue() {
        return lengthValue;
    }
}