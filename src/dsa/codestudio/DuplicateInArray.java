package dsa.codestudio;

import java.util.*;

public class DuplicateInArray {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 5, 3, 5, 4,6));
        
        //findDuplicateBruteForceApproach(list);
        //System.out.println(findDuplicateCountIterationApproach(list));
        System.out.println(findDuplicateNegativeMarkingApproach(list,6));
    }

    private static void findDuplicateBruteForceApproach(ArrayList<Integer> arr) {

      for (int i=0;i<arr.size();i++){
          for(int j=i+1;j<arr.size();j++){
              if(arr.get(i)==arr.get(j)){
                  System.out.println(arr.get(i));
                  break;
              }
          }
      }

    }

    private static int findDuplicateCountIterationApproach(ArrayList<Integer> list){
        if(list.size() <= 1) {
            return -1;
        }

        int[] count = new int[list.size() - 1];

        for (int i = 0; i < list.size(); i++) {
            int n = list.get(i)-1;
            count[n]++;

            if (count[n] > 1) {
                return list.get(i);
            }
        }

        return -1;
    }

    private static int findDuplicateNegativeMarkingApproach(ArrayList<Integer> list,int n) {
        /*if(list.size() < 1){
            return -1;
        }*/

        for(int i=0;i<n;i++){
            int absval =  Math.abs(list.get(i));
            if(list.get(absval) > 0){
                list.set(absval,list.get(absval)*-1);

            }else {
                return absval;
            }
        }

        return -1;
    }
}
