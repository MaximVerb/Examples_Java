package oefeningen_vb.collections.set;

import java.util.*;

public class Example {
    public static void main(String[] args) {
        String[] colors = {"red", "white", "blue", "green", "gray", "orange", "tan", "white", "cyan", "peach", "gray",
                "orange"};
        List<String> list = Arrays.asList(colors);
        System.out.printf("List: %s%n", list);

        //verwijder duplicaten en print ze dan af
        printNonDuplicates(list);
    }

    //create a Set from a Collection to eliminate all duplicates
    private static void printNonDuplicates(Collection<String> values) {
        //create a HashSet
        Set<String> set = new HashSet<>(values);

        System.out.printf("%nNonduplicates are: %n");

        set.forEach(System.out::println); //lambda expressie
    }

}
