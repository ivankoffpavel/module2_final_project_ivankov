package com.javarush.ivankov.animals;

import com.javarush.ivankov.abstraction.Eatable;
import com.javarush.ivankov.abstraction.Movable;
import com.javarush.ivankov.abstraction.Reproducable;
import com.javarush.ivankov.animaltype.Herbivores;

public class Sheep extends Herbivores implements Eatable,Movable,Reproducable {

    @Override
    public void eat() {

    }

    @Override
    public void move() {

    }

    @Override
    public void reproduce() {

    }
}
