package app;

import domain.Controls;
import domain.GameCharacter;
import domain.enemy.Being;
import domain.equipment.Equipment;
import domain.gender.Gender;
import domain.map.textbase.Game;
import domain.map.ui.Combat;
import domain.model.*;
import domain.race.Race;
import utility.KeyboardHelper;

public class GameApp {
    private ChClass chClass;
    GameCharacter gc = new GameCharacter();
    private Inventory inventory = new InventoryClass();
    public void showControls() {
        for (var controls : Controls.values()
        ) {
            System.out.println(controls.toString());

        }
    }

    public GameCharacter characterCreation() throws InterruptedException {

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
            chClass =new WarriorClass("Warrior");
            Equipment.addItem(1,"Castle-forged arming sword");
            Equipment.addItem(1,"Kite-shield");
            Equipment.addItem(1,"royal blue brigandine gambeson");
            gc.addInventory(inventory);
        }
        if(className.equals("mage")){
            chClass =new MageClass("Mage");
            Equipment.addItem(1,"Wonky-looking wand");
            Equipment.addItem(1,"Burgundy robes");
            inventory.add(20, 10);
            gc.addInventory(inventory);

        }
        if(className.equals("ranger")){
           chClass= new RangerClass("Ranger");
            Equipment.addItem(1,"yew warbow");
            Equipment.addItem(1,"Leather chest armor");
            inventory.add(20,10);
            gc.addInventory(inventory);
        }
        if(className.equals("rogue")){
            chClass =new RogueClass("Rogue");
            Equipment.addItem(1,"Short steel dagger");
            Equipment.addItem(1,"Black hooded robe");
            inventory.add(10,10);
            gc.addInventory(inventory);
        }
        gc.setChClass(chClass);
        gc.getSkills();
        gc.addAttributes(chClass.getAttributes(gc.getRace()));
        gc.addHp(gc.getRace().getSpeed());
        gc.setHp(chClass.getHP());
        gc.setXp(chClass.getXP());
        gc.setSp(chClass.getSP());
        gc.setInitiative(chClass.getInitiative());
        System.out.println("Your charachter is being created ...");
        Thread.sleep(3000);
        System.out.println(gc.getRace().getSpeed());
        System.out.println(gc.getName() + " the " + gc.getGender() + " " +gc.getRace() + " " +gc.getName() +" is created ");
        System.out.println(gc);
        return gc;

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
            System.out.println("Map is being loaded ...");
            System.out.println("Field of Generix loaded");
            Combat.main();
        } else {
            characterCreation();
            System.out.println("Map is being loaded ...");
            System.out.println("Cave of Thread");
            Game.main(gc, new Being("Enemy", 10, 20,10));
        }
    }

}
