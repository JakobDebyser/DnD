package domain.combat;

import domain.dice.Dice;
import domain.GameCharacter;
import domain.enemy.NPC;

public class fight {
    private final GameCharacter player;
    private final NPC enemy;

    public fight(GameCharacter player, NPC goblin) throws InterruptedException {
        this.player = player;
        this.enemy =goblin;
        new Dice();
        while(combat());
    }
    public boolean combat() throws InterruptedException {
        System.out.println(player.getName()+" is fighting a "+ enemy.getName());
        int rounds =1;

        while (player.getHp()>0&& enemy.getHpActual()>0){
            System.out.println("---- Round "+rounds+" ----");
            Thread.sleep(1000);
            System.out.println(player.getName()+" stats:");
            System.out.println("HP: "+player.getHpActual()+"/"+player.getHp());
            System.out.println("SP: "+player.getSpActual()+"/"+player.getSp());
            Thread.sleep(1000);
            System.out.println(enemy.getName()+" stats:");
            System.out.println("HP: "+enemy.getHpActual()+"/"+enemy.getHpMax());
            System.out.println("SP: "+enemy.getSpActual()+"/"+enemy.getSpMax());
            player.chooseOption(enemy);
            if (!enemy.isAlive()|| !player.isAlive())break;
            enemy.useBasicAttack(player);
            rounds++;

        }
        if(player.getHpActual() > 0 && enemy.getHpActual() <= 0) {
            System.out.println("YOU HAVE WON! ");
            player.addXp(10);
            return true;
        } else {
            System.out.println("Game over!");
            return false;
        }
    }

}
