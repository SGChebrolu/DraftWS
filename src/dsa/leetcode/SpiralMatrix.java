package dsa.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> spiralMatrix = spiralOrder(matrix);

        spiralMatrix.forEach(System.out::println);


    }
        public static List<Integer> spiralOrder(int[][] matrix) {

            int minRow = 0;
            int minCol = 0;
            int maxRow = matrix.length-1;
            int maxCol = matrix[0].length-1;

            int tEle = (maxRow+1) * (maxCol+1);
            List<Integer> op = new ArrayList<>();
            int counter=0;

            while(counter < tEle) {  //check for all boxes

                //Top Wall
                for(int i=minRow,j=minCol;j<=maxCol && counter < tEle;j++){
                    op.add(matrix[i][j]);
                    counter++;
                } minRow++;

                //Right Wall
                for(int i=minRow,j=maxCol;i<=maxRow && counter < tEle;i++){
                    op.add(matrix[i][j]);
                    counter++;
                }maxCol--;

                //Bottom Wall
                for(int i=maxRow,j=maxCol;j>=minCol && counter < tEle;j--){
                    op.add(matrix[i][j]);
                    counter++;
                }maxRow--;

                //Left Wall
                for(int i=maxRow,j=minCol;i>=minRow && counter < tEle;i--){
                    op.add(matrix[i][j]);
                    counter++;
                }minCol++;

            }
            return op;


        }

}
