package dsa.others.slidingwindow;

import java.util.ArrayList;
import java.util.List;

public class MaxSumOfSubarrayK {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};

        System.out.println(findMaxSubArraySum_BF(a, 3));
        System.out.println(findMaxSubArraySum_SW(a, 3));

    }

    static int findMaxSubArraySum_BF(int[] a, int k) {

        int tempSum;
        int maxSum = 0;
        for (int i = 0; i < a.length; i++) {
            tempSum = 0;
            for (int j = i; j < i + k && j < a.length; j++) {
                tempSum += a[j];
            }
            maxSum = Math.max(tempSum, maxSum);
        }
        return maxSum;
    }

    static int findMaxSubArraySum_SW(int[] a, int k) {
        int tempSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0, j = 0; j < a.length; j++) {
            tempSum += a[j];

            if (j - i + 1 == k) {
                maxSum = Math.max(tempSum, maxSum);
                tempSum = tempSum - a[i];
                i++;
            }
        }
        return maxSum;
    }

    static int findMaxSubArraySum_SW_While(int[] a, int k) {
        int tempSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int i = 0, j = 0;
        while (j < a.length) {
            tempSum += a[j];
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                maxSum = Math.max(tempSum, maxSum);
                tempSum = tempSum - a[i];
                i++;
                j++;
            }
        }
        return maxSum;
    }

}
