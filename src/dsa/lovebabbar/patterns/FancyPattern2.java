package dsa.lovebabbar.patterns;

public class FancyPattern2 {

    public static void main(String[] args) {
        execute(5);
    }

    private static void execute(int n) {

        //UpperHalf
       for(int row=0;row<n;row++){
           for(int col=0; col<row+1;col++){
               System.out.print(row+1);
               if(col!=row){
                   System.out.print("*");
               }
           }
           System.out.println();
       }

       //BottomHalf
        for(int row=0;row<n;row++){
            for(int col=0;col<n-row;col++){
                System.out.print(n-row);
                if(col!=n-row-1){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
