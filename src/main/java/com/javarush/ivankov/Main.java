package com.javarush.ivankov;

import com.javarush.ivankov.islandfield.IslandArea;

public class Main {
    public static void main(String[] args) {
        IslandArea island = new IslandArea(10,20);
        System.out.println(island.fieldCreator());
    }
}
