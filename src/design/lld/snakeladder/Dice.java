package design.lld.snakeladder;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    int diceCount;
    int min = 1;
    int max = 6;

    public Dice(int diceCount) {
        this.diceCount = diceCount;
    }

    public int rollDice(){
        int diceSum = 0;
        int diceUsed = 0;

        if(diceUsed < diceCount){
            diceSum += ThreadLocalRandom.current().nextInt(min, max - 1);
            diceUsed++;
        }
        return diceUsed;
    }
}
