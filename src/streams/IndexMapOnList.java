package streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IndexMapOnList {
    public static void main(String args[]){

        AtomicInteger counter = new AtomicInteger();
        Map<Integer, Integer> collect = IntStream.of(1, 2, 5, 9, 8,15)
                .boxed()
                .collect(Collectors.toMap(Function.identity(), x -> counter.incrementAndGet()));
        //(Collectors.groupingBy(Function.identity()));

        System.out.println(collect);


    }
}
