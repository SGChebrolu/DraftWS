package dsa.leetcode;

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        int[] digits = {3, 4, 5, 1, 9};

        Arrays.stream(plusOne_2(digits)).forEach(System.out::println);
    }


    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                break;
            } else {
                digits[i] = 0;
            }
        }
        if (digits[0] == 0) {
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            return res;
        }
        return digits;
    }

    public static int[] plusOne_2(int[] digits){
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i] != 9){
                digits[i]++;
                return digits;
            }
            digits[i] =0;
        }
        int[] output = new int[digits.length+ 1];
        output[0] = 1;

        return output;
    }
}
