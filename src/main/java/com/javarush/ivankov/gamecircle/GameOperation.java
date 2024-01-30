package com.javarush.ivankov.gamecircle;

import com.javarush.ivankov.Initialization.InitializeField;
import com.javarush.ivankov.abstraction.Organism;
import com.javarush.ivankov.animals.*;
import com.javarush.ivankov.animaltype.Type;
import com.javarush.ivankov.arealunit.Areal;

import java.util.ArrayList;
import java.util.Map;

public class GameOperation {
    private final InitializeField initializeField;
    private Areal arealUnit;

    public GameOperation() {
        initializeField = new InitializeField();
        initializeField.fillField();
    }

    public void simulateTurn()  {
        for (int i = 0; i < initializeField.width; i++) {
            for (int j = 0; j < initializeField.length; j++) {
                Areal areal = initializeField.getField().get(i).get(j);
                arealUnit = areal;
                try {
                    eatRunner(areal);
                } catch (NoSuchFieldException e) {
                    throw new RuntimeException(e);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }

            }
        }
    }

    public void eatRunner(Areal areal) throws NoSuchFieldException, IllegalAccessException {

        for (Map.Entry<Type, ArrayList<Organism>> pair : areal.getArealMap().entrySet()) {

            if (pair.getKey() == Type.DEER) {                  // atfirst I suppose should eat herbivorces
                for (Organism organism : pair.getValue()) {
                    Deer deer = (Deer) organism;
                    deer.eat(areal);
                }
            }
            if (pair.getKey() == Type.SHEEP) {
                for (Organism organism : pair.getValue()) {
                    Sheep sheep = (Sheep) organism;
                    sheep.eat(areal);
                }
            }
            if (pair.getKey() == Type.RABBIT) {
                for (Organism organism : pair.getValue()) {
                    Rabbit rabbit = (Rabbit) organism;
                    rabbit.eat(areal);
                }
            }
            if (pair.getKey() == Type.HORSE) {
                for (Organism organism : pair.getValue()) {
                    Horse horse = (Horse) organism;
                    horse.eat(areal);
                }
            }
            if (pair.getKey() == Type.GOAT) {
                for (Organism organism : pair.getValue()) {
                    Goat goat = (Goat) organism;
                    goat.eat(areal);
                }
            }

            if (pair.getKey() == Type.DUCK) {
                for (Organism organism : pair.getValue()) {
                    Duck duck = (Duck) organism;
                    duck.eat(areal);
                }
            }

            if (pair.getKey() == Type.BUFFALO) {
                for (Organism organism : pair.getValue()) {
                    Buffalo buffalo = (Buffalo) organism;
                    buffalo.eat(areal);
                }
            }

            if (pair.getKey() == Type.BEAR) {
                for (Organism organism : pair.getValue()) {
                    Bear bear = (Bear) organism;
                    bear.eat(areal);
                }
            }

            if (pair.getKey() == Type.BOAR) {
                for (Organism organism : pair.getValue()) {
                    Boar boar = (Boar) organism;
                    boar.eat(areal);
                }
            }

            if (pair.getKey() == Type.BOA) {
                for (Organism organism : pair.getValue()) {
                    Boa boa = (Boa) organism;
                    boa.eat(areal);
                }
            }

            if (pair.getKey() == Type.CATERPILLAR) {
                for (Organism organism : pair.getValue()) {
                    Caterpillar caterpillar = (Caterpillar) organism;
                    caterpillar.eat(areal);
                }
            }

            if (pair.getKey() == Type.EAGLE) {
                for (Organism organism : pair.getValue()) {
                    Eagle eagle = (Eagle) organism;
                    eagle.eat(areal);
                }
            }

            if (pair.getKey() == Type.FOX) {
                for (Organism organism : pair.getValue()) {
                    Fox fox = (Fox) organism;
                    fox.eat(areal);
                }
            }

            if (pair.getKey() == Type.MOUSE) {
                for (Organism organism : pair.getValue()) {
                    Mouse mouse = (Mouse) organism;
                    mouse.eat(areal);
                }
            }

            if (pair.getKey() == Type.WOLF) {            //and then should eat predators
                for (Organism organism : pair.getValue()) {
                    Wolf wolf = (Wolf) organism;
                    wolf.eat(areal);
                }
            }
        }
    }

    public Areal getArealUnit() {
        return arealUnit;
    }
}



