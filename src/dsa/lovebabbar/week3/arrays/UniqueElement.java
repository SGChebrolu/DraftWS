package dsa.lovebabbar.week3.arrays;

public class UniqueElement {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,5,4,3,2,1};

        //This solution is not working for every input

        System.out.println(execute(arr));
    }

    private static int execute(int[] arr) {
        int xorsum=0; //variable to calculate xor and store unique number
        for(int i=0;i<arr.length;i++)
        {
            xorsum=xorsum^arr[i];
        }
        return xorsum;
    }
}
