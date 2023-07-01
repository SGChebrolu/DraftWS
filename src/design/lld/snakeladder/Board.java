package design.lld.snakeladder;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Board {
    Cell[][] cells;
    Board(int boardSize, int numberOfSnakes, int numberOfLadders){
        initializeCells(boardSize);
        populateSnakesAndLadders(numberOfSnakes,numberOfLadders);
        
    }

    private void populateSnakesAndLadders(int numberOfSnakes, int numberOfLadders) {
        while(numberOfSnakes > 0){
            int snHead = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
            int snTail = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
            if(snTail > snHead)
                continue;
            Jump snJump = new Jump(snHead,snTail);
            Cell cell = getCell(snHead);
            cell.setJump(snJump);
            numberOfSnakes--;
        }


        while(numberOfLadders > 0){
            int lkStart = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
            int lkEnd = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
            if(lkStart > lkEnd)
                continue;
            Jump lkJump = new Jump(lkStart,lkEnd);
            Cell cell = getCell(lkStart);
            cell.setJump(lkJump);
            numberOfLadders--;
        }
    }

    Cell getCell(int position) {
        int i = position / cells.length;
        int j = position % cells.length;
        return cells[i][j];
    }


    private void initializeCells(int boardSize) {
        cells = new Cell[boardSize][boardSize];

        for(int i=0;i<boardSize;i++){
            for(int j=0;j<boardSize;j++){
                Cell cellObj = new Cell();
                cells[i][j] = new Cell();
            }
        }
    }
}
