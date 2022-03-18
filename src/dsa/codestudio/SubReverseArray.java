package dsa.codestudio;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SubReverseArray {

    public static void main(String[] args) {
        /*Scanner s = new Scanner(System.in);
        int tc = s.nextInt();
        while (tc-- > 0) {
            int totalLen = s.nextInt();
            int m = s.nextInt();
            List<Integer> alist = new ArrayList<>();
            for (int i = 0; i < totalLen; i++) {
                alist.add(Integer.parseInt(s.next()));
            }
            reverseArray(alist, m);
        }*/
        // static input
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        reverseSubArray(list, 5);
        System.out.println();
        reverseSubArrayOptimalSolution(list,2);
		System.out.println();
        reverseArray(list);
    }

    public static void reverseSubArray(List<Integer> arr, int m) {
        List<Integer> copyArr = arr.stream().collect(Collectors.toList());

        int n = arr.size() - 1;
        for (int i = m + 1, j = n; i <= n; i++, j--) {
            arr.set(i, copyArr.get(j));
        }
        arr.forEach(System.out::print);
    }

    public static void reverseArray(List<Integer> arr) {
        int n = arr.size();
        int i = 0;
        int j = n - 1;
        while (i <= j) {
            Collections.swap(arr, i, j);
            i++;
            j--;
        }
        arr.forEach(System.out::print);
    }

    public static void reverseSubArrayOptimalSolution(List<Integer> arr, int m) {
        int n = arr.size();

        // Declare two pointers.
        int i = m + 1;
        int j = n - 1;

        // Till the i<j condition holds swap the elements.
        while (i < j) {
            Collections.swap(arr, i, j);
            i++;
            j--;
        }

        arr.forEach(System.out::print);
    }
}
