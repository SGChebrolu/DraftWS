package dsa.lovebabbar.week4;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a = {9, 1, 2, 3, 4, 5, 8};
        int[] b = {10, 1, 6, 7, 9, 14};
        execute(b);
        //TimeComplexity -
    }

    private static void execute(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++){
            //Step1 -  fetch
           int val = arr[i];
           //Step2 - compare
            int j=i-1;
            for(;j>=0;j--){
                if(arr[j] > val){
                    //shift
                    arr[j+1] = arr[j];
                }
                else {
                    //stop
                    break;
                }
            }
            // Copy
            arr[j+1] = val;
        }
    }

    private static void execute_1(int[] arr) {

        Arrays.sort(arr);

        int n = arr.length;
        for (int i = 1; i < n; i++){
            //Step1 -  fetch
            int val = arr[i];
            //Step2 - compare
            int j=i-1;
            for(;j>=0;j--){
                if(arr[j] > val){
                    //shift
                    arr[j+1] = arr[j];
                }
                else {
                    //stop
                    break;
                }
            }
            // Copy
            arr[j+1] = val;
        }
    }
}
