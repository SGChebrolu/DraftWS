package dsa.others;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class ScannerCheck{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        String k = s.nextLine();

        System.out.println(n);
        System.out.println(k);
    }
}