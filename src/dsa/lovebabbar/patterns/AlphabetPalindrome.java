package dsa.lovebabbar.patterns;

public class AlphabetPalindrome {
    public static void main(String[] args) {
        execute(5);
    }

    private static void execute(int n) {
        for(int row=0;row<n;row++){
            int col=0;
            for(col=0; col<row+1;col++){
                //char c = col+1+'A'; //ToDo convert 1 to A
                System.out.print(col+1);
            }
            for(;col>1;col--){
                System.out.print(col-1);
            }

            System.out.println();
        }
    }
}
