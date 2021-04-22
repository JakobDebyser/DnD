package domain.combat;

import domain.GameCharacter;
import domain.dice.Dice;
import domain.enemy.Being;

import utility.KeyboardHelper;

public class Fight {
    private static boolean runAway =false;
    private final GameCharacter player;
    private final Being enemy;

    public Fight(GameCharacter player, Being enemy)  {
        this.player = player;
        this.enemy = enemy;
        new Dice();

    }

    public void combat()  {
        System.out.println(player.getName() + " is fighting a " + enemy.getName());
        int rounds = 1;

        while (player.getHpActual() > 0 && enemy.getHpActual() > 0) {
            System.out.println("---- Round " + rounds + " ----");

            System.out.println(player.getName() + " stats:");
            System.out.println("HP: " + player.getHpActual() + "/" + player.getHp());
            System.out.println("SP: " + player.getSpActual() + "/" + player.getSp());

            System.out.println(enemy.getName() + " stats:");
            System.out.println("HP: " + enemy.getHpActual() + "/" + enemy.getHpMax());
            System.out.println("SP: " + enemy.getSpActual() + "/" + enemy.getSpMax());
            chooseOption(enemy);
            if (!enemy.isAlive()|| runAway) break;
            enemy.useBasicAttack(player);
            rounds++;

        }
        if (player.getHp() > 0 && enemy.getHpActual() <= 0) {
            System.out.println("YOU HAVE WON! ");
            player.addXp(10);
        } else {
            System.out.println("Game over!");

        }
    }
    public static void chooseOption(Being enemy) {

        while(!runAway) {
            System.out.println("[1] Basic attack");
            System.out.println("[2] Skill or spell");
            System.out.println("[3] use item");
            System.out.println("[4] flee");
            int input = KeyboardHelper.askForNumber("input: ");
            switch (input) {
                case 1:
                    enemy.useBasicAttack(enemy);
                    break;
                case 2:

                case 3:
                    break;
                case 4:
                    if (enemy.useDice() > enemy.useDice()) {
                        System.out.println("attempt to flee failed");
                    } else {
                        System.out.println("flee attempt was a success!");
                        runAway = true;
                        break;
                    }
                default:
                    System.out.println("wrong input. please try again");
            }
        }
    }

}
