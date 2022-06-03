package dsa.leetcode;

public class NeedleHaystack {

    public static void main(String[] args) {


       //System.out.println(strStr("Hello", "ll"));
        System.out.println(strStr("12345", "bba"));


    }


    public static int strStr(String haystack, String needle) {

        int i = 0, j = 0;
        int n = haystack.length();
        int k = needle.length(); //2

        while (j <= n) {
            if (j - i + 1 < k) { //till First Window is Found
                j++;
            } else { //Computation for every Window
                if (haystack.substring(i, j+1).equals(needle))
                    return i;
                i++;
                j++;
            }
        }
        return -1;
    }
}
