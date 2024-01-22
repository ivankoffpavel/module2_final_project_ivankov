package com.javarush.ivankov;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.javarush.ivankov.getuserdata.GetUserData;

public class Main {
    public static void main(String[] args) {
        GetUserData ui = GetUserData.getInstance();
        ui.printGreeting();
        ui.getUserData();







        ObjectMapper objectMapper = new ObjectMapper();


    }
}
