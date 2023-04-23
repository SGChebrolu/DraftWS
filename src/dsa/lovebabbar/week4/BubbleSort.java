package dsa.lovebabbar.week4;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {9,1, 2, 3, 4, 5, 8};
        int[] b = {10,1,6,7,9,14};
        execute_ImproveComplexity(b);
        //TimeComplexity - O(n2)
    }
    private static void execute(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=1;j<n-i;j++){
                if(arr[j-1] > arr[j]){
                   int temp= arr[j-1];
                    arr[j-1]= arr[j];
                    arr[j] = temp;
                }
            }
        }
        Arrays.stream(arr).forEach(System.out::print);
    }


    private static void execute_ImproveComplexity(int[] arr) {
        //since after each round the highest element gets to its sorted position
        //after certain rounds it is not needed to sort further, which can be captured if swap is false

        int n = arr.length;
        for(int i=0;i<n-1;i++){
            boolean swap=false;
            for(int j=1;j<n-i;j++){
                if(arr[j-1] > arr[j]){
                    swap = true;
                    int temp= arr[j-1];
                    arr[j-1]= arr[j];
                    arr[j] = temp;
                }
            }
            if(swap == false){
                break;
            }
        }
        Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
    }
}
