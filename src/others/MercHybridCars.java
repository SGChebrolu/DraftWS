package others;

import java.util.Arrays;
import java.util.OptionalInt;

public class MercHybridCars {

    void findDistance(int[] a, int[] b, int k){
         for (int i=0;i<a.length;i++){
             checkHybridResult(a,b,k,i);
         }
     }

    private int checkHybridResult(int[] a, int[] b, int k, int i) {
        OptionalInt maxFuelCapacity = Arrays.stream(a).limit(i).max();
        OptionalInt minMileage = Arrays.stream(b).limit(i).min();

        int hybridFuelCapacity =maxFuelCapacity.getAsInt()-k;
        int result = i*hybridFuelCapacity*minMileage.getAsInt();

        return result;

    }

}
