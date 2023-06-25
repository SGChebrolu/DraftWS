package design.lld.snakeladder;

import java.util.Deque;

public class Game {
    private Board board;
    private Dice dice;
    private Deque<Player> dequeP;

    public Game(Board board, Dice dice, Deque<Player> dequeP) {
        this.board = board;
        this.dice = dice;
        this.dequeP = dequeP;
    }
}
