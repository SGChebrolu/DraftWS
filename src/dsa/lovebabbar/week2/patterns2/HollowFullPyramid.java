package dsa.lovebabbar.week2.patterns2;

public class HollowFullPyramid{
    /*
            1
           1 2
          1   3
         1     4
        1 2 3 4 5
    */

    public static void main(String[] args) {
        execute(5);
    }
    private static void execute(int n) {

        for (int row = 0; row < n; row++) {

            //LeftSpaces
            for (int col = 0; col < n - row - 1; col++) {
                System.out.print(" ");
            }

            //RightPyramid
            int counter = 1;
            for (int col = 0; col < 2 * row + 1; col++) {

                //first row & last row
                if (row == 0 || row == n - 1) {
                    if (col % 2 == 0) {
                        System.out.print(counter++);
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (col == 0) {
                        System.out.print("1");
                    } else if (col == 2 * row) {
                        System.out.print(row + 1);
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}