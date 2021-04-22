package domain;

import domain.enemy.Being;
import repository.IOFiles;
import utility.KeyboardHelper;

import java.util.ArrayList;
import java.util.List;

public class CombatGame {

    public static void fighting(GameCharacter character, Being enemy) {
        System.out.println(character.getName() + "is fighting a " + enemy.getName());
        System.out.println(character.getName() + " HP = " + character.getHp());
        int hp = character.getHp();
    //    while ( hp != 0) {
            System.out.println("Enter attack:");
            KeyboardHelper.askForText(">");
            System.out.println("[1] Basic attack");
            System.out.println("[2] Skill or spell");
            System.out.println("[3] Using item");
            System.out.println("[4] flee");
            int input = KeyboardHelper.askForNumber("input: ");
            switch (input) {
                case 1:
                    System.out.println(character.getName() + " attackt " + enemy.getName());
                    character.getHp();
                   // character.useBasicAttack(enemy);
                    hp-=10;
                    break;
                case 2:
                    hp-=10;
                    break;
                case 3:
                    hp-=10;
                    break;
                case 4:
                    if (enemy.useDice() > enemy.useDice()) {
                        System.out.println("attempt to flee failed");
                        hp-=20;
                    } else {
                        System.out.println("flee attempt was a success!");
                        hp-=10;
                    }
                    break;
                default:
                    System.out.println("wrong input. please try again");
            }
  //      }
        System.out.println("Game Over Do you want to save your game?\n " +
                "1 : YES\n2 : NO");
        int i = KeyboardHelper.askForNumber(">");
        if(i == 1){
            System.out.println("Dir=> C:\\Users\\11601094\\IdeaProjects\\dungeonanddragons\\SavedGames\\");
            List<String> gameList = new ArrayList<>();
            gameList.add(character.getName());
            gameList.add(enemy.getName());
            IOFiles.saveGame(gameList);
            System.out.println("Game saved");
            Runtime.getRuntime().exit(0);
        }
        else {
            System.out.println("Game not saved");
            Runtime.getRuntime().exit(0);
        }
    }
}
