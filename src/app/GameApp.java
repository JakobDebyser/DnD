package app;

import domain.Controls;
import domain.GameCharacter;
import domain.classes.Mage;
import domain.classes.Ranger;
import domain.classes.Rogue;
import domain.classes.Warrior;
import domain.gender.Gender;
import domain.race.Race;
import utility.KeyboardHelper;

public class GameApp {
    private Character character;
    public void showControls() {
        for (var controls : Controls.values()
        ) {
            System.out.println(controls);

        }
    }

    public void characterCreation() throws InterruptedException {
        GameCharacter gc = new GameCharacter();
        System.out.println("What is your adventurer's name ?");
        gc.setName(KeyboardHelper.askForText(">"));
        System.out.println(gc.getName() + "... Yes ... that's a good name. A strong name." +
                "One that will be remembered for generations . Tell me, is " + gc.getName() + " is a male or female? ");

        String gender = KeyboardHelper.askForText(">").toLowerCase();
        while (!(gender.equals("male") || gender.equals("female"))) {
            System.out.println("wrong input : ");
            gender = KeyboardHelper.askForText(">").toLowerCase();
        }
        if (gender.equals("male")) {
            gc.setGender(Gender.MALE);
            System.out.println("Can you tell me more about him, such as what race he is ? ");
        } else {
            gc.setGender(Gender.FEMALE);
            System.out.println("Can you tell me more about her, such as what race she is ? ");
        }

        for (
                var race : Race.values()
        ) {
            System.out.println(race);
        }

        String input = KeyboardHelper.askForText(">");
        boolean b = false;
        while (!b) {
            for (var race : Race.values()
            ) {
                if (race.name().equals(input.toUpperCase())) {
                    System.out.println(race.name() + "=" + input.toUpperCase());
                    gc.setRace(race);
                    b = true;
                    System.out.println("boolean = " + b);
                }
            }
            if (!b) {
                System.out.println("Wrong input");
                input = KeyboardHelper.askForText(">");
            }

        }
        if (gender.equals("male")) {
            System.out.println(gc.getName() + " sounds like an interesting " + gc.getRace().name().toLowerCase() + " so far. What is his class");
        } else {
            System.out.println(gc.getName() + " sounds like an interesting " + gc.getRace().name().toLowerCase() + " so far. What is her class");
        }
        System.out.println("Warrior \nMage \nRanger \nRogue");
        String className = KeyboardHelper.askForText(">").toLowerCase();
        while (!(className.equals("warrior") || className.equals("mage")|| className.equals("ranger") || className.equals("rogue"))) {
            System.out.println("wrong input : ");
            className = KeyboardHelper.askForText(">").toLowerCase();
        }
        if(className.equals("warrior")){
            gc.setClass(new Warrior(gc.getName()));
        }
        if(className.equals("mage")){
            gc.setClass(new Mage("Mage"));
        }
        if(className.equals("ranger")){
            gc.setClass(new Ranger("Ranger"));
        }
        if(className.equals("rogue")){
            gc.setClass(new Rogue("Rogue"));
        }
        System.out.println("Your charachter is being created ...");
        Thread.sleep(3000);
        gc.getSkills();
        gc.getEquipment();
        System.out.println("movementspeed: "+gc.getRace().getSpeed());
        System.out.println(gc.getName() + " the " + gc.getGender() + " " +gc.getRace() + " " +className +" is created ");
        System.out.println("Map ");






    }


    public void newGame() throws InterruptedException {
        System.out.println("Wat do you want to play: ");
        System.out.println("1. Fields of Generix ");
        System.out.println("2. Cave of Thread ");
        int i = KeyboardHelper.askForNumber(">");

        while (i < 1 || i > 2) {
            System.out.println("Wrong input: ");
            i = KeyboardHelper.askForNumber(">");
        }
        if (i == 1) {
            characterCreation();
        } else {

            System.out.println("2 de kiezen");
        }
    }



}
