package domain.dice;

import java.util.Random;

public class Dice {
    private final Random random = new Random();

    public int rollNDice(int max){
        return random.nextInt(max)+1;
    }
    public int roll20Dice(){
        return rollNDice(20);
    }
}
