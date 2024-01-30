package com.javarush.ivankov.abstraction;

import com.javarush.ivankov.arealunit.Areal;

public interface Eatable {
    void eat(Areal areal) throws NoSuchFieldException, IllegalAccessException;
}
