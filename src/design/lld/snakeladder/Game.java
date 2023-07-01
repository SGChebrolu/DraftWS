package design.lld.snakeladder;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
    Board board;
    Dice dice;
    Deque<Player> dequeP;
    Player winner;

    public Game() {
        board = new Board(10, 4, 2);
        dice = new Dice(1);
        winner = null;
        dequeP = new LinkedList<>();
        dequeP.add(new Player("sandeep", 0));
        dequeP.add(new Player("pranavi", 0));
    }

    public void startGame() {

        // check winner
        // pick player
        // roll dice
        // check Jump
        // check if completed

        while (null == winner) {

            Player currentPlayer = pickPlayer(dequeP);
            System.out.println("player turn is:" + currentPlayer.getId() + " current position is: " + currentPlayer.getCurrentPosition());

            int diceSum = dice.rollDice();

            int newPosition = diceSum + currentPlayer.getCurrentPosition();

            newPosition = checkJump(newPosition);

            currentPlayer.setCurrentPosition(newPosition);
            System.out.println("player turn is:" + currentPlayer.getId() + " current position is: " + currentPlayer.getCurrentPosition());

            if (currentPlayer.getCurrentPosition() > board.cells.length * board.cells.length - 1) {
                winner = currentPlayer;
                System.out.println("Winner is " + currentPlayer.getId() + " current position is: " + currentPlayer.getCurrentPosition());
            }
        }
        System.out.println("Winner is " + winner.getId());
    }

    private int checkJump(int newPosition) {
        if (newPosition > (board.cells.length * board.cells.length - 1))
            return newPosition;

        Cell cell = board.getCell(newPosition);
        if (null != cell.getJump()) {
            newPosition = cell.getJump().getEnd();
        }

        return newPosition;
    }

    private Player pickPlayer(Deque<Player> dequeP) {
        Player player = dequeP.removeFirst();
        dequeP.add(player);
        return player;
    }
}
