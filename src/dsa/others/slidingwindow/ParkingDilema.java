package dsa.others.slidingwindow;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ParkingDilema {

    public static void main(String[] args){
        int[] a = {2,8,10,17};
        System.out.println(findRoofLen_SW(a,3));
    }

    static int findRoofLen_SW(int[] cars, int k) {

        Arrays.sort(cars);

        int minRoofLen = Integer.MAX_VALUE;
        int roofLen;
        for (int i = 0, j = 0; i <= cars.length -k; j++) {

            if (j - i + 1 < k) {  //till First Window
                continue;
            }

            // for every next Window
            roofLen = cars[j] - cars[i];
            minRoofLen = Math.min(minRoofLen, roofLen);
            i++;
        }
        return minRoofLen+1;
    }

    /*public static int minRoofLength(int[] arr, int k){
        Arrays.sort(arr);
        int start = 0;
        int minRoofLength = Integer.MAX_VALUE;

        for(int j=0;j<arr.length;j++){

            if(j < k-1) continue;

            int currentRoofLength = arr[j]-arr[start++]+1;

            minRoofLength = Math.min(minRoofLength, currentRoofLength);
        }
        return minRoofLength;
    }


    public static long carParkingRoof(int[] cars, int k) {

        Arrays.sort(cars);
        int minRoofLen = Integer.MAX_VALUE;
        int roofLen = 0;

        for (int i = 0; i <= cars.length - k; i++) {

            roofLen = (cars[i+k-1] - cars[i])+1;

            minRoofLen = Math.min(minRoofLen, roofLen);
        }

        return minRoofLen;
    }

    public static long carParkingRoof_WhileApproach(int[] cars, int k) {

        Arrays.sort(cars);
        int minRoofLen = Integer.MAX_VALUE;
        int roofLen = 0;

        int n = cars.length;
        int i=0;
        int j=0;

        for (i = 0; i <= cars.length - k; i++) {

            roofLen = (cars[i+k-1] - cars[i])+1;

            minRoofLen = Math.min(minRoofLen, roofLen);
        }

        return minRoofLen;
    }*/
}
