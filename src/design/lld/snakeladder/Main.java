package design.lld.snakeladder;

import java.util.Deque;
import java.util.LinkedList;

public class Main {
    Dice dice = new Dice(1);
    Player p1 =  new Player("sandeep",0);
    Player p2 =  new Player("pranavi",0);
    Deque deque = new LinkedList();
    Board board = new Board();


    static void inittilaizeGame() {


        Game game = new Game();
    }


    public static void main(String[] args){
        System.out.println("Hello from Main class");
        inittilaizeGame();
    }


}
