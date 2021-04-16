package app;

import domain.Controls;
import domain.Game;
import domain.race.Race;
import utility.KeyboardHelper;

public class GameApp {
    public void showControls() {
        for (var controls : Controls.values()
        ) {
            System.out.println(controls);

        }
    }
    public void characterCreation(){
        Game game = new Game();
        System.out.println("What is your adventurer's name ?");
        game.setName(KeyboardHelper.askForText(">"));
        System.out.println(game.getName() + "... Yes ... that's a good name. A strong name." +
                "One that will be remembered for generations . Tell me, is " + game.getName() + " is a male or female? ");


        String gender =KeyboardHelper.askForText(">");
        while ( (gender.equals("male") || gender.equals("female"))){
            game.setGender(gender);
            if (gender.equals("male")){
                System.out.println("Can you tell me more about him, such as what race he is ? ");
            }
            else {
                System.out.println("Can you tell me more about her, such as what race she is ? ");
            }
            gender =KeyboardHelper.askForText(">");

        }


        for (var race: Race.values()
             ) {
            System.out.println(race);
        }
        String input = KeyboardHelper.askForText(">");
        boolean b=false;
        while (!b){
            for (var race: Race.values()
            ) {
                if (race.name().equals(input))
                    game.setRace(race);
                b = true;
            }
            System.out.println("Wrong input");
            input = KeyboardHelper.askForText(">");
        }
        if(gender.equals("male")){
            System.out.println(game.getName() + " sounds like an interesting " + game.getRace().name() + " so far. What is his class");
        }
        else {
            System.out.println(game.getName() + " sounds like an interesting " + game.getRace().name() + " so far. What is her class");
        }


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
