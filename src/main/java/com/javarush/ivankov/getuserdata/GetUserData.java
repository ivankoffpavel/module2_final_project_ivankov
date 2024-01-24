package com.javarush.ivankov.getuserdata;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.javarush.ivankov.animaltype.Type;
import com.javarush.ivankov.config.ClassTypeValues;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class GetUserData {
    private int width;
    private int length;
    public Type type;
    private double weight;
    private int maxArealQuantity;
    private int maxAbilityToRun;
    private double maxSatiety;
    private String reinitialize;

    private static final GetUserData INSTANCE = new GetUserData();
    private final ArrayList<String> jsonList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Scanner scanner1 = new Scanner(System.in);


    public void printGreeting() {
        System.out.println("Welcome to game \"Animal Island\"!");
    }

    public GetUserData() {
    }


    public void getUserData() {
        try {
            System.out.print("Please enter an island width -");
            width = scanner.nextInt();
            System.out.print("Please enter an island length -");
            length = scanner.nextInt();
            System.out.println("Would you like to reinitialize game start parameters y/n?");
            reinitialize = scanner1.nextLine();
            if (reinitialize.equals("y")) {
                Type[] animalType = Type.values();
                for (Type type : animalType) {
                    this.type = type;
                    System.out.println("Please enter for animal type " + type + " parameters ");
                    System.out.print("Please enter an animal weight -");
                    Scanner scanner2 = new Scanner(System.in);
                    weight = scanner2.nextDouble();
                    System.out.print("Please enter maximal animal quantity of animal -");
                    maxArealQuantity = scanner.nextInt();
                    System.out.print("Please enter maximal ability of animal to run -");
                    maxAbilityToRun = scanner.nextInt();
                    System.out.print("Please enter maximal satiety of animal -");
                    maxSatiety = scanner.nextDouble();
                    ClassTypeValues classTypeValues = new ClassTypeValues(type, weight, maxArealQuantity, maxAbilityToRun, maxSatiety);
                    ObjectMapper objectMapper = new ObjectMapper();
                    String json = objectMapper.writeValueAsString(classTypeValues);
                    jsonList.add(json);
                    objectMapper.writeValue(new File("C:/Java/config.json"), jsonList);


                }
            } else {
                System.out.println("Current configuration was loaded...");
            }
        } catch (Exception e) {
            System.out.println("Something went wrong!");
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }


    public static GetUserData getInstance() {
        return INSTANCE;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
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
