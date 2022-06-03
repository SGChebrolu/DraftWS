package dsa.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static void main(String[] args){

        List<List<Integer>> pt = generatePascalTriangle(6);

        pt.forEach(System.out::println);


    }

        public static List<List<Integer>> generatePascalTriangle(int numRows) {
            List<List<Integer>> op = new ArrayList<>();
            List<Integer> row,pre = null;

            List<Integer> firstRow = new ArrayList<>();
            firstRow.add(1);
            op.add(firstRow);

            for(int i=1;i<numRows;i++){
                row = new ArrayList<>();
                for(int j=0;j<=i;j++){

                    if(j==0 | j==i){
                        row.add(1);
                    }
                    else{
                        row.add(pre.get(j)+pre.get(j-1));
                    }

                }
                pre = row;
                op.add(row);
            }
            return op;
        }

}
