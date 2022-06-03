package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class ReduceExample {
    public static void main(String[] args){
        List<Integer> elements = Arrays.asList(1, 0, 2, 8, 2, 8, 2, 8, 2);

        Integer reducedInteger = elements.stream().reduce(0, Integer::sum);
        System.out.println(reducedInteger);

    }
}
