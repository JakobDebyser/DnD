package app;

import domain.Controls;
import domain.Game;
import domain.classes.Mage;
import domain.classes.Ranger;
import domain.race.Race;
import utility.KeyboardHelper;

public class GameApp {
    public void showControls() {
        for (var controls : Controls.values()
        ) {
            System.out.println(controls);

        }
    }

    public void characterCreation() {
        Game game = new Game();
        System.out.println("What is your adventurer's name ?");
        game.setName(KeyboardHelper.askForText(">"));
        System.out.println(game.getName() + "... Yes ... that's a good name. A strong name." +
                "One that will be remembered for generations . Tell me, is " + game.getName() + " is a male or female? ");

        String gender = KeyboardHelper.askForText(">").toLowerCase();
        while (!(gender.equals("male") || gender.equals("female"))) {
            System.out.println("wrong input : ");
            gender = KeyboardHelper.askForText(">").toLowerCase();
        }
        game.setGender(gender);

        if (game.getGender().equals("male")) {
            System.out.println("Can you tell me more about him, such as what race he is ? ");
        } else {
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
                    game.setRace(race);
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
            System.out.println(game.getName() + " sounds like an interesting " + game.getRace().name().toLowerCase() + " so far. What is his class");
        } else {
            System.out.println(game.getName() + " sounds like an interesting " + game.getRace().name().toLowerCase() + " so far. What is her class");
        }

//        List<Object> listClass = new ArrayList<>();
//        listClass.add(new Warrior("Warrior"));
//        listClass.add(new Mage("Wage"));
//        listClass.add(new Ranger("Ranger"));
//        listClass.add(new Thief("Rogue"));
//        listClass.forEach(System.out::println);
//        String className = KeyboardHelper.askForText(">");
//        className ranger = new
//        for (var name : listClass
//        ) {
//            if (className.equals(name.toString())) {
//                System.out.println("Object : " + name);
//                game.setCharacter((Character) name);
//            }
//
//        }
        System.out.println("Warrior \nWage \nRanger \n Rogue\n");
        String className = KeyboardHelper.askForText(">");
        if(className.equals("Ranger")){
            game.setCharacter(new Ranger("Ranger"));

        }
        if(className.equals("Wage")){
            game.setCharacter(new Mage("Mage"));

        }
       // System.out.println("Your " + game.getCharacter().toString());
    }


    public void newGame() {
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
