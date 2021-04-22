package domain.combat;

import domain.GameCharacter;
import domain.dice.Dice;
import domain.enemy.Being;
import domain.enemy.NPC;
import utility.KeyboardHelper;

public class Fight {
    private GameCharacter player;
    private NPC enemy;

    public Fight(GameCharacter player, NPC enemy) throws InterruptedException {
        this.player = player;
        this.enemy = enemy;
        new Dice();
        while(combat());
    }

    public boolean combat() throws InterruptedException {
        System.out.println(player.getName() + " is fighting a " + enemy.getName());
        int rounds = 1;

        while (player.getHp() > 0 && enemy.getHpActual() > 0) {
            System.out.println("---- Round " + rounds + " ----");
            Thread.sleep(1000);
            System.out.println(player.getName() + " stats:");
            System.out.println("HP: " + player.getHp() + "/" + player.getHp());
            System.out.println("SP: " + player.getSp() + "/" + player.getSp());
            Thread.sleep(1000);
            System.out.println(enemy.getName() + " stats:");
            System.out.println("HP: " + enemy.getHpActual() + "/" + enemy.getHpMax());
            System.out.println("SP: " + enemy.getSpActual() + "/" + enemy.getSpMax());
            chooseOption(enemy);
            if (enemy.isAlive()) break;
            enemy.useBasicAttack(enemy);
            rounds++;

        }
        if (player.getHp() > 0 && enemy.getHpActual() <= 0) {
            System.out.println("YOU HAVE WON! ");
            player.addXp(10);
            return true;
        } else {
            System.out.println("Game over!");
            return false;
        }
    }
    public static void chooseOption(Being enemy) {

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
            case 4:
                if (enemy.useDice() > enemy.useDice()) {
                    System.out.println("attempt to flee failed");
                } else {
                    System.out.println("flee attempt was a success!");
                    break;
                }
            default:
                System.out.println("wrong input. please try again");
        }

    }

}
