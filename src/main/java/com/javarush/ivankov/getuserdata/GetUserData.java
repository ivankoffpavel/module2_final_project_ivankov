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
    private int weight;
    private int maxArealQuantity;
    private int maxAbilityToRun;
    private int maxSatiety;
    private static final GetUserData INSTANCE = new GetUserData();
    private final ArrayList<String> jsonList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void printGreeting() {
        System.out.println("Welcome to game Animal Island!");
    }

    private GetUserData() {
    }


    public void getUserData() {
        try {
            System.out.print("Please enter an island width -");
            width = scanner.nextInt();
            System.out.print("Please enter an island length -");
            length = scanner.nextInt();
            Type[] animalType = Type.values();
            for (Type type : animalType) {
                this.type = type;
                System.out.println("Please enter for animal type " + type + " parameters ");
                System.out.print("Please enter an animal weight -");
                weight = scanner.nextInt();
                System.out.print("Please enter maximal animal quantity of animal -");
                maxArealQuantity = scanner.nextInt();
                System.out.print("Please enter maximal ability of animal to run -");
                maxAbilityToRun = scanner.nextInt();
                System.out.print("Please enter maximal satiety of animal -");
                maxSatiety = scanner.nextInt();
                ClassTypeValues classTypeValues = new ClassTypeValues(type,weight,maxArealQuantity,maxAbilityToRun,maxSatiety);
                ObjectMapper objectMapper = new ObjectMapper();
                String json = objectMapper.writeValueAsString(classTypeValues);
                jsonList.add(json);
                objectMapper.writeValue(new File("config.json"),jsonList);


            }
        } catch (Exception e) {
            System.out.println("You have to input an integer number!");
        } finally {
            scanner.close();
        }
    }

    public void getUserConfig() {
        try {
            System.out.print("Please enter an animal weight -");
            weight = scanner.nextInt();
            System.out.print("Please enter maximal animal quantity of animal -");
            maxArealQuantity = scanner.nextInt();
            System.out.print("Please enter maximal ability of animal to run -");
            maxAbilityToRun = scanner.nextInt();
            System.out.print("Please enter maximal satiety of animal -");
            maxSatiety = scanner.nextInt();

        } catch (Exception e) {
            System.out.println("You have to input an integer number!");
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
