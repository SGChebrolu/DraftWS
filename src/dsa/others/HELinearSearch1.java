/*
package dsa;*/
/* IMPORTANT: Multiple classes and nested static classes are supported *//*


*/
/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*//*


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class HELinearSearch1 {
    public static void main(String args[]) throws Exception {
        */
/* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
 
        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        *//*


        // Write your code here


        Scanner s = new Scanner(System.in);
        String tc_count = s.nextLine();
        int counter = 0;
        //int[] input = new Array(tc_count);

        for (int i = 0; i <= tc_count; i++) {
            int[] input = s.nextLine().split(" ");
            //IntStream.rangeClosed(input[0], input[1]).foreach()
            for (int j = input[0], j<=input[1];
            j++){
                if (findGCD(j, hexaSum(j))) >1 {
                    counter++;
                }
            }
            System.out.println(counter);
        }

        private int findGCD ( int a, int b){
            if (b == 0)
                return a;
            else
                return findGCD(b, a % b);
        }

        private int hexaSum ( int h){
            String hex = Integer.toHexString(h);

            for (int i = 0; i < hex.length(); i++) {
                char ch = hex.charAt(i);
                if (Character.isLetter(ch)) {
                    switch (ch) {
                        case 'a':
                            ch = 10;
                            break;
                        case 'b':
                            ch = 11;
                            break;
                        case 'c':
                            ch = 12;
                            break;
                        case 'd':
                            ch = 13;
                            break;
                        case 'e':
                            ch = 14;
                            break;
                        case 'f':
                            ch = 15;
                            break;
                        default:
                            ch = Integer.parseInt(String.valueOf(ch))
                    }
                    sum = sum + ch;
                }
            }
        }
    }
*/
