package design.lld.snakeladder;

public class Player {
    private String id;
    private int currentPosition; //1-100 on a 10*10 Board

    public Player(String id, int currentPosition) {
        this.id = id;
        this.currentPosition = currentPosition;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }

    public String getId() {
        return id;
    }
}
