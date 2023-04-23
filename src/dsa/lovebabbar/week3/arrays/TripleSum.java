package dsa.lovebabbar.week3.arrays;

public class TripleSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,8};
        int sum = 5;
        execute(arr,sum);
    }
    private static void execute(int[] arr,int tripleSum) {
        //BruteForce Approach ToDo
        for(int i=0;i< arr.length;i++){
            int tempPairSum=0;
            for(int j=i+1;j< arr.length;j++){
                tempPairSum =0;
                for(int k=j+1; k< arr.length;k++) {
                    tempPairSum = arr[i] + arr[j] + arr[k];
                    if (tempPairSum == tripleSum) {
                        System.out.println("(" + arr[i] + "," + arr[j] + ")");
                    }
                }
            }
        }
    }
}
