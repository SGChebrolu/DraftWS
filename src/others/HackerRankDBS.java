package others;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;


/*
 * Create the Filter and Mapper classes here.
 */
 
 
 class Mapper{

     static Function<String, CharactersCount> getDistinctCharactersCount() {
         return x -> new CharactersCount(x,(int)x.chars().distinct().count());
     }
 }
 
 class Filter{
     static Predicate<String> nameStartingWithPrefix(String prefix){
         return x -> x.startsWith(prefix);
    }
}
 
class CharactersCount {
    private final String name;
    private final Integer distinctCharacterCount;
    
    public CharactersCount(String name, Integer distinctCharacterCount) {
        this.name = name;
        this.distinctCharacterCount = distinctCharacterCount;
    }
    
    @Override
    public String toString() {
        return "\"" + this.name + "\" has " + this.distinctCharacterCount + " distinct characters.";
    }
}

public class HackerRankDBS {
    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "aaryanna",
                "aayanna",
                "airianna",
                "alassandra",
                "allanna",
                "allannah",
                "allessandra",
                "allianna",
                "allyanna",
                "anastaisa",
                "anastashia",
                "anastasia",
                "annabella",
                "annabelle",
                "annebelle"
        );
        
        names.stream()
                .filter(Filter.nameStartingWithPrefix("aa"))
                .map(Mapper.getDistinctCharactersCount())
                .forEachOrdered(System.out::println);
    }
}