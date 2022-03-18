package dsa.others;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {
        GroupAnagrams solution = new GroupAnagrams();

        // should be 100'
        //String[] sts = new String[]{"eat","tea","tan","ate","nat","bat"};
        System.out.println(solution.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));

        // should be 10101
        //System.out.println(solution.groupAnagrams("1010", "1011"));
    }


    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> rst = new ArrayList<>();
        if (strs == null) {
            return rst;
        }

        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] arr = str.toCharArray();

            Arrays.sort(arr);

            String s = new String(arr);

            if (!map.containsKey(s)) map.put(s, new ArrayList<>());
            map.get(s).add(str);
        }
        for (String str : map.keySet()) {
            Collections.sort(map.get(str));
            rst.add(map.get(str));
        }
        return rst;
    }
}
