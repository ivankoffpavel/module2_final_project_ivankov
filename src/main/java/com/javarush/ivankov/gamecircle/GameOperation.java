package com.javarush.ivankov.gamecircle;

import com.javarush.ivankov.Initialization.InitializeField;
import com.javarush.ivankov.abstraction.Organism;
import com.javarush.ivankov.animals.*;
import com.javarush.ivankov.animaltype.Type;
import com.javarush.ivankov.arealunit.Areal;

import java.util.HashSet;
import java.util.Map;

public class GameOperation {
    private final InitializeField initializeField;
    private Areal arealunit;

    public GameOperation() {
        initializeField = new InitializeField();
        initializeField.fillField();
    }

    public void simulateTurn() {
        for (int i = 0; i < initializeField.width; i++) {
            for (int j = 0; j < initializeField.length; j++) {
                Areal areal = initializeField.getField().get(i).get(j);
                arealunit = areal;
                eatRunner(areal);


            }
        }
    }

    public void eatRunner(Areal areal) {

        for (Map.Entry<Type, HashSet<Organism>> pair : areal.getArealMap().entrySet()) {

            if (pair.getKey() == Type.DEER) {                  // atfirst I suppose should eat herbivorces
                for (Organism organism : pair.getValue()) {
                    Deer deer = (Deer) organism;
                    deer.eat();
                }
            }
            if (pair.getKey() == Type.SHEEP) {
                for (Organism organism : pair.getValue()) {
                    Sheep sheep = (Sheep) organism;
                    sheep.eat();
                }
            }
            if (pair.getKey() == Type.RABBIT) {
                for (Organism organism : pair.getValue()) {
                    Rabbit rabbit = (Rabbit) organism;
                    rabbit.eat();
                }
            }
            if (pair.getKey() == Type.HORSE) {
                for (Organism organism : pair.getValue()) {
                    Horse horse = (Horse) organism;
                    horse.eat();
                }
            }
            if (pair.getKey() == Type.GOAT) {
                for (Organism organism : pair.getValue()) {
                    Goat goat = (Goat) organism;
                    goat.eat();
                }
            }

            if (pair.getKey() == Type.DUCK) {
                for (Organism organism : pair.getValue()) {
                    Duck duck = (Duck) organism;
                    duck.eat();
                }
            }

            if (pair.getKey() == Type.BUFFALO) {
                for (Organism organism : pair.getValue()) {
                    Buffalo buffalo = (Buffalo) organism;
                    buffalo.eat();
                }
            }

            if (pair.getKey() == Type.BEAR) {
                for (Organism organism : pair.getValue()) {
                    Bear bear = (Bear) organism;
                    bear.eat();
                }
            }

            if (pair.getKey() == Type.BOAR) {
                for (Organism organism : pair.getValue()) {
                    Boar boar = (Boar) organism;
                    boar.eat();
                }
            }

            if (pair.getKey() == Type.BOA) {
                for (Organism organism : pair.getValue()) {
                    Boa boa = (Boa) organism;
                    boa.eat();
                }
            }

            if (pair.getKey() == Type.CATERPILLAR) {
                for (Organism organism : pair.getValue()) {
                    Caterpillar caterpillar = (Caterpillar) organism;
                    caterpillar.eat();
                }
            }

            if (pair.getKey() == Type.EAGLE) {
                for (Organism organism : pair.getValue()) {
                    Eagle eagle = (Eagle) organism;
                    eagle.eat();
                }
            }

            if (pair.getKey() == Type.FOX) {
                for (Organism organism : pair.getValue()) {
                    Fox fox = (Fox) organism;
                    fox.eat();
                }
            }

            if (pair.getKey() == Type.MOUSE) {
                for (Organism organism : pair.getValue()) {
                    Mouse mouse = (Mouse) organism;
                    mouse.eat();
                }
            }

            if (pair.getKey() == Type.WOLF) {            //and then should eat predators
                for (Organism organism : pair.getValue()) {
                    Wolf wolf = (Wolf) organism;
                    wolf.eat();
                }
            }
        }
    }
}



