package dsa.lovebabbar.week2.patterns;

public class FlippedSolidDiamonds {


    public static void main(String[] args) {
        execute(5);
    }

    private static void execute(int n) {

        for(int row=0;row<n;row++){

            //HalfPyramid
            for(int i=0;i<n-row;i++){
                System.out.print("*");
            }
            //Space Diamond
            for(int i=0;i<2*row+1;i++){
                System.out.print(" ");
            }
            //Half Reverse Pyramid
            for(int i=0;i<n-row;i++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
