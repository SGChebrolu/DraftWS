package dsa.codestudio;

import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;


public class MaxSubarraySum {

    public static void main(String[] args) {
        //int[] arr = { 1 ,2 ,7, -4, 3, 2, -10, 9 ,1};
       // int[] arr = {10, 20, -30, 40, -50, 60};
        int[] arr = {-1, -2, -5, 0, 6, 8,10};
       // int[] arr = {-7, -8, -16, -4, -8, -5, -7, -11, -10, -12, -4, -6, -4, -16, -10 };
       // int[] arr = {-1,2,7};
        System.out.println(maxSubArrayProductSandeep(arr, arr.length));

    }

    public static long maxSubArraySum(int[] arr, int n) {

        int max = Arrays.stream(arr).max().getAsInt();

        for (int i = 0; i < arr.length; i++) {
            int subarraysum = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                subarraysum += arr[j];
                if (subarraysum > max) {
                    max = subarraysum;
                    // subarraysum = 0;
                }
            }
        }
        return max>0?max:0;


    }

    public static long maxSubArraySumUsingKadeneAlgo(int[] arr, int n) {

        int sum = 0;
        int max = arr[0];

        for(int i=0; i<n; i++){
            sum += arr[i];

            if(sum < 0){
                sum =0;
            }
            max = Math.max(sum,max);
            }

        return max;
    }


    public static long madhuriCode(int[] arr, int n) {
        int tempSum, sum = 0;
        //int sum;

        for (int i = 0; i < arr.length; ) {

            tempSum = 0;

            for (int j = i + 1; j < arr.length - 1; j++) {
                tempSum = arr[j];
                if ((tempSum + arr[j + 1]) <= 0) {
                    i = j;
                    break;
                }
                tempSum += arr[j];
            }
            if (sum < tempSum) {
                sum = tempSum;
            }

        }
        return sum;

    }

    public static long maxSubArrayProductUsingKadeneAlgo(int[] arr, int n) {
        int product = 0;
        int max = arr[0];
        int min = arr[0];

        for(int i=0; i<n; i++){

            if(arr[i] <0){
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(arr[i],arr[i]*max);
            min = Math.min(arr[i],arr[i]*min);

            max = Math.max(product,max);
        }

        return max;
    }
    public static long maxSubArrayProductSandeep(int[] arr, int n) {
        int tillNowMaxProduct = 1;
        int maxProduct = 1;

        for(int i=0; i<n; i++){
            if(arr[i] != 0){
                if(tillNowMaxProduct<0){
                    tillNowMaxProduct = 1;
                }

            tillNowMaxProduct *= arr[i];

            maxProduct = Math.max(maxProduct,tillNowMaxProduct);
        }}

        return maxProduct;
    }

}
