package dsa.others.slidingwindow;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountAnagrams {
    public static void main(String[] args) {
        String s = "ffoorr";
        String pattern = "for";

        System.out.println(countAnagrams(s, pattern));
    }

    private static List countAnagrams(String s, String p) {
        int k = p.length();
        char[] arr = s.toCharArray();
        int i = 0, j = 0;

        Map<Character, Integer> map = new HashMap();

        for (int t = 0; t < p.length(); i++) {
            map.put(p.charAt(t), map.getOrDefault(p.charAt(t), 0) + 1);
        }
        int count = map.size();

        while (j < arr.length) {
            if (j + i - 1 < k) {  //till First Window
                if (map.containsKey(arr[j])) {
                    map.put(arr[j], map.get(arr[j]) - 1);
                }
                if (map.get(arr[j]) == 0) {
                    count--;
                }
            } else if (j+i-1 == k) { //Sliding the Window

            }


        }
        return null;
    }
}
