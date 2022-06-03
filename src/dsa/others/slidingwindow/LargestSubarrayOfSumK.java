package dsa.others.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LargestSubarrayOfSumK {

    public static void main(String[] args) {
        int[] a = {5, 2, 3, 4, 5,1,4,1,0};

        //System.out.println(findLargestSubarrayOfSumK_SW(a, 5));
        System.out.println(findLargestSubarrayOfSumK_SW_HM(a, 5));
        //System.out.println(countSubarraysWithSumK(a, 5));

    }



    private static int findLargestSubarrayOfSumK_SW(int[] a, int k) {

        int i=0,j=0;
        int sum=0;
        int max = Integer.MIN_VALUE;
        int count=0;
        while(j<a.length){
            sum = sum + a[j];

            if(sum < k)
                j++;
            else if(sum == k){
                max = Math.max(max,j-i+1);
                count ++;
                j++;
            }else if(sum > k){
                sum = sum - a[i];
                j++;
                i++;
            }
        }
        return count;
    }


    public static int countSubarraysWithSumK(int[] a, int K) {
        int n = a.length;
        HashMap < Integer, Integer > hash = new HashMap < > ();
        int count = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
            if (sum == K) {
                count++;
            }
            if (hash.get(sum - K) != null) {
                count += hash.get(sum - K);
            }
            if (hash.get(sum) != null) {
                hash.put(sum, hash.get(sum) + 1);
            } else {
                hash.put(sum, 1);
            }
        }
        return count;
    }

    private static int countSubarrayOfSumK_SW_HM(int[] a, int k) {
        Map map = new HashMap();
        int sum =0;
        int count =0;

        //for(int i:a){
        for(int i=0;i<a.length;i++){
            sum += a[i];

            if (sum == k) {
                count++;
            }

            if(map.containsKey(sum-k)){
                count += (int)map.get(sum-k);
            }

            map.put(sum,(int)map.getOrDefault(sum,0)+1);
        }
        return count;
    }

    private static int findLargestSubarrayOfSumK_SW_HM(int[] a, int k) {
        Map map = new HashMap();
        int max = Integer.MIN_VALUE;
        int sum =0;
        int i = 0;
        map.put(sum,-1);

        for(i=0;i<a.length;i++){
            sum += a[i];

            if(!map.containsKey(sum - k)){
                map.putIfAbsent(sum,i);
            }
            else{
                max = Math.max(max,i-(int)map.get(sum-k));
            }
        }
        return max;
    }

}
