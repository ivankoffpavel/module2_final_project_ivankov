package com.javarush.ivankov.config;

import com.javarush.ivankov.animaltype.Type;

public class ClassTypeValues {
    public Type type;
    public double weight;
    public int maxArealQuantity;
    public int maxAbilityToRun;
    public double maxSatiety;

    public ClassTypeValues(Type type, double weight, int maxArealQuantity, int maxAbilityToRun, double maxSatiety) {
        this.type = type;
        this.weight = weight;
        this.maxArealQuantity = maxArealQuantity;
        this.maxAbilityToRun = maxAbilityToRun;
        this.maxSatiety = maxSatiety;
    }

    public Type getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public int getMaxArealQuantity() {
        return maxArealQuantity;
    }

    public int getMaxAbilityToRun() {
        return maxAbilityToRun;
    }

    public double getMaxSatiety() {
        return maxSatiety;
    }
}









