package dsa.leetcode;

import java.util.Arrays;

class MoveZeros { //283


    public static void main(String[] args) {
        //int[] nums = {0,1,0,3,12};
        int[] nums = {1,2};
        Arrays.stream(moveZeroes(nums)).forEach(System.out::print);
    }

    public static int[] moveZeroes(int[] nums) {
        int index=0;
        int n=nums.length;    
        
        for(int i=0;i<n;i++){
            if(nums[i] != 0){                
                if(index != i) {
                    nums[index] = nums[i];     
                    nums[i]=0;
               }
               index++;
            }
        }

        return nums;
    }
}