package dsa.lovebabbar.week2.patterns;

public class HollowDiamondPattern {

    public static void main(String[] args) {
        execute(4);
    }
    private static void execute(int n) {

        //UpperHalf
        for(int row=0;row<n;row++){
            //First print spaces
            for(int col=0;col<n-row-1;col++){
                System.out.print(" ");
            }

            //Print Chars and Spaces inbtwn
            for(int col=0;col<2*row+1;col++){
                if(col==0 || col==2*row){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        
        //BottomHalf
        for(int row=0;row<n;row++){
            //First print spaces
            for(int col=0;col<row;col++){
                System.out.print(" ");
            }


        }
    }
}