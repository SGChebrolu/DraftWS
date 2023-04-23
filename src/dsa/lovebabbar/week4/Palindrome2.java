package dsa.lovebabbar.week4;

public class Palindrome2 {
    public static void main(String[] args) {
    System.out.println(validPalindrome("leveral"));
    }

    //class Solution {
        public static boolean validPalindrome(String s) {
            char[] c = s.toCharArray();
            int i=0;
            int j=s.length()-1;

            while(i<j){
                if(c[i] != c[j]){
                    //Check if i can be removed or J can be removed
                    return(checkPalindrome(s,i+1,j) || checkPalindrome(s,i,j-1));
                }else{
                    i++;
                    j--;
                }
            }
            return true;
        }

        private static boolean checkPalindrome(String s, int i, int j){
            char[] c = s.toCharArray();

            while(i<j){
                if(c[i] != c[j]){
                    return false;
                }else {
                    i++;
                    j--;
                }
            }
            return true;
        }
    }
//}
