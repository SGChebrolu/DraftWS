package design.lld.snakeladder;

public class Player {
    private String id;
    private int currentPosition; //1-100 on a 10*10 Board

    public Player(String id, int currentPosition) {
        this.id = id;
        this.currentPosition = currentPosition;
    }
}
