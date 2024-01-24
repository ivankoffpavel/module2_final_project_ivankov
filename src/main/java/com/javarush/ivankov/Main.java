package com.javarush.ivankov;

import com.javarush.ivankov.Initialization.InitializeField;

public class Main {
    public static void main(String[] args) {
        InitializeField init = new InitializeField();
        init.fillField();
        for (int i = 0; i < init.width; i++) {
            for (int j = 0; j < init.length ; j++) {
                System.out.println(init.getField().get(i).get(j).getId());
            }

        }




    }
}
