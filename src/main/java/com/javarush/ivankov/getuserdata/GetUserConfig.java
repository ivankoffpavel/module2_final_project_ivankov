package com.javarush.ivankov.getuserdata;

import com.javarush.ivankov.animaltype.Type;

import java.util.Scanner;

public class GetUserConfig {
    public Type type;
    public int weight;
    public int maxArealQuantity;
    public int maxAbilityToRun;
    public int maxSatiety;
    private static final GetUserConfig GET_USER_CONFIG = new GetUserConfig();
    Scanner scanner = new Scanner(System.in);

    private GetUserConfig() {
    }

    public void getUserConfig() {
        try {
            //this.type = type;
            System.out.print("Please enter an animal weight -");
            weight = scanner.nextInt();
            System.out.print("Please enter a maximal quantity per area -");
            maxArealQuantity = scanner.nextInt();
            System.out.print("Please enter a maximal ability to run -");
            maxAbilityToRun = scanner.nextInt();
            System.out.print("Please enter a maximal satiety for animal -");
            maxSatiety = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("You have to input an integer number!");
        } finally {
            scanner.close();
        }
    }
    public GetUserConfig getInstance(){
        return GET_USER_CONFIG;
    }
}

