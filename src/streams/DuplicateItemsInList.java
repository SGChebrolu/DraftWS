package streams;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateItemsInList {

    public static void main(String[] args) {
        List elements = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 6, 7, 8, 9, 10, 0);

        Set uniqueElements = new HashSet();

        Set<Integer> duplicateElements = (Set<Integer>) elements.stream().filter(x -> !uniqueElements.add(x)).collect(Collectors.toSet());

        duplicateElements.forEach(System.out::println);

        Map<Integer,Long > map = (Map<Integer, Long>) elements.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Set<Integer> duplicateElements2 = map.entrySet().stream().filter(x -> x.getValue() > 1).map(x -> x.getKey()).collect(Collectors.toSet());

        duplicateElements2.forEach(System.out::println);

        Set<Integer> duplicateElements3 = (Set<Integer>) elements.stream().filter(x -> Collections.frequency(elements, x) > 1).collect(Collectors.toSet());
        duplicateElements3.forEach(System.out::println);
    }

}