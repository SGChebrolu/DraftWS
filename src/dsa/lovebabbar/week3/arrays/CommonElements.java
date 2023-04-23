package dsa.lovebabbar.week3.arrays;

public class CommonElements {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,8};
        int[] b = {3,5,6,9,7};

        // For duplicate common use marking technique

        execute(a,b);
    }

    private static void execute(int[] a, int[] b) {

        for(int i: a){
            for(int j: b){
                if(i==j){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
