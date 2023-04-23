package dsa.lovebabbar.week4;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {9,1, 2, 3, 4, 5, 8};

        execute(arr);

        // TimeComplexity - O(n2)
    }

    private static void execute(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n-1;i++){
            int minIndex = i;
            for(int j=i+1;j<n;j++){
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            //swap arr[i] with arr[minindex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        Arrays.stream(arr).forEach(System.out::print);
    }
}
