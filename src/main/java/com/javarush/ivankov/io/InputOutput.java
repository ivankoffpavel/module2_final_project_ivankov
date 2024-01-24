package com.javarush.ivankov.io;

import java.io.FileInputStream;

public class InputOutput {
    public String readFromFile(String path) {
        StringBuilder json = new StringBuilder();
        try (FileInputStream fis = new FileInputStream(path)) {

            int i;
            while ((i = fis.read()) != -1) {
                json.append((char) i);
            }

        } catch (Exception e) {
            System.out.println("Oops, something went wrong!");
        }
        ;
        return json.toString();
    }
}
