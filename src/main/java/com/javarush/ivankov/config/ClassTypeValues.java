package com.javarush.ivankov.config;

import com.javarush.ivankov.animaltype.Type;

public class ClassTypeValues {
    public Type type;
    public int weight;
    public int maxArealQuantity;
    public int maxAbilityToRun;
    public int maxSatiety;

    public ClassTypeValues(Type type, int weight, int maxArealQuantity, int maxAbilityToRun, int maxSatiety) {
        this.type = type;
        this.weight = weight;
        this.maxArealQuantity = maxArealQuantity;
        this.maxAbilityToRun = maxAbilityToRun;
        this.maxSatiety = maxSatiety;
    }

    public Type getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    public int getMaxArealQuantity() {
        return maxArealQuantity;
    }

    public int getMaxAbilityToRun() {
        return maxAbilityToRun;
    }

    public int getMaxSatiety() {
        return maxSatiety;
    }
}









