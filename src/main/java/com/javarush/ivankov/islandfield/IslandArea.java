package com.javarush.ivankov.islandfield;

import com.javarush.ivankov.arealunit.Areal;

import java.util.ArrayList;

public class IslandArea {
    public int length;
    public int width;


    public IslandArea(int length, int width) {
        this.length = length;
        this.width = width;
    }

    private ArrayList<ArrayList<Areal>> field = new ArrayList<>(width);

    }
    



