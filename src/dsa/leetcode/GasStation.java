package dsa.leetcode;

class GasStation { //#134
    public static void main(String[] args) {
        int[] gas = {5,2,1,4,3};
        int[] cost = {3,4,5,1,2};

        System.out.println(canCompleteCircuit(gas,cost));
    }



    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int sum=0;
        int start =0;
        int tank =0;
        int n = gas.length;
        
      for(int i=0;i<n;i++){
          
            tank += gas[i]-cost[i];
            sum += gas[i]-cost[i];
          
          if(tank < 0){
              start = i+1;
              tank=0;
          }       
      }
        
        return sum>=0 ? start : -1;
      }       
}