package dsa.codechef;

/* package codechef; // don't place package name! */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/* Name of the class has to be "ScannerCheck" only if the class is public. */
class WaterSports {
    public static void main(String[] args) throws java.lang.Exception {

        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tcCount = Integer.parseInt(br.readLine());

        while (tcCount-- > 0) {

            *//*String inputString = "";

            StringTokenizer tokenizer = new StringTokenizer(br.readLine());*//*

            String inputString = br.readLine();
            System.out.println(verifySpendingPosibility(inputString));
        }*/
        Scanner s = new Scanner(System.in);
        int tcCount = s.nextInt();

        while (tcCount-- > 0) {
            ArrayList<String> inputA = new ArrayList();
            while(s.hasNext()){
                inputA.add(s.next());
            }

            //String inputString = s.nextLine();
            System.out.println("Hello "+ inputA);
            System.out.println(verifySpendingPosibility(inputA));
        }
    }

    private static String verifySpendingPosibility(ArrayList<String> inputArray) {
        //String[] inputArray = inputString.split(" ");
        int z = Integer.parseInt(inputArray.get(0));
        int y = Integer.parseInt(inputArray.get(1));
        int threeActPrice = inputArray.stream().skip(2).mapToInt(x -> Integer.parseInt(x)).sum();
        if ((z - (y + threeActPrice)) > 0) {
            return "YES";
        }
        return "NO";
    }
}