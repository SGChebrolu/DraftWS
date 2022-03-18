package dsa.others;

import java.util.Arrays;
import java.util.function.ToIntFunction;

public class SumOfHexaDecimalDigits {

    public static void main(String[] args){

    findHexaDigitsSum(5);

    }

    private static void findHexaDigitsSum(int i) {
        String hexString = Integer.toHexString(i);
        int originalNum = Integer.parseInt(hexString, 16);

        ToIntFunction<String> toIntFunction = value -> 10;
        int sum = Arrays.stream(hexString.split("")).mapToInt(toIntFunction).sum();


        System.out.println(hexString);
        System.out.println(originalNum);
        System.out.println(sum);
    }
}
