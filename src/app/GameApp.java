package app;

import domain.*;
import domain.equipment.Equipment;
import domain.gender.Gender;
import domain.inventory.Inventory;
import domain.map.Combat;
import domain.model.*;
import domain.race.Race;
import domain.skills.Skill;
import utility.KeyboardHelper;


import java.util.ArrayList;
import java.util.List;

public class GameApp {
    private ChClass chClass;

    public void showControls() {
        for (var controls : Controls.values()
        ) {
            System.out.println(controls.toString());

        }
    }

    public void characterCreation() throws InterruptedException {
        List<GameCharacter> team = new ArrayList<>();
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
        while (!(className.equals("warrior") || className.equals("mage") || className.equals("ranger") || className.equals("rogue"))) {
            System.out.println("wrong input : ");
            className = KeyboardHelper.askForText(">").toLowerCase();
        }
        if (className.equals("warrior")) {
            chClass = new WarriorClass("Warrior");
            Skill.add(new Skill("Shield Bash"));
            Equipment.addItem(1, "Castle-forged arming sword");
            Equipment.addItem(1, "Kite-shield");
            Equipment.addItem(1, "royal blue brigandine gambeson");
        }
        if (className.equals("mage")) {
            chClass = new MageClass("Mage");
            Skill.add(new Skill("lightning bolt"));
            Equipment.addItem(1, "Wonky-looking wand");
            Equipment.addItem(1, "Burgundy robes");
            Inventory.add("Weak mana potion");

        }
        if (className.equals("ranger")) {
            chClass = new RangerClass("Ranger");
            Skill.add(new Skill("Piercing Shot"));
            Equipment.addItem(1, "yew warbow");
            Equipment.addItem(1, "Leather chest armor");
            Inventory.add(20, "barbed head arrow");
        }
        if (className.equals("rogue")) {
            chClass = new RogueClass("Rogue");
            Skill.add(new Skill("Stealth"));
            Skill.add(new Skill("Backstab"));
            Equipment.addItem(1, "Short steel dagger");
            Equipment.addItem(1, "Black hooded robe");
            Inventory.add(10, "lockpick");

        }
        gc.setChClass(chClass);
        gc.getSkills();
        gc.addAttributes(chClass.getAttributes(gc.getRace()));
        gc.addHp(gc.getRace().getSpeed());
        System.out.println("Your charachter is being created ...");
        Thread.sleep(3000);
        System.out.println(gc.getRace().getSpeed());
        System.out.println(gc.getName() + " the " + gc.getGender() + " " + gc.getRace() + " " + gc.getName() + " is created ");
        System.out.println(gc);
        System.out.println("Map is being loaded ...");
        //Map aanmaken
        Combat.main();
        System.out.println("Field of Generix loaded");

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
