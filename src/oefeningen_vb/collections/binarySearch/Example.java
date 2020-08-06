package oefeningen_vb.collections.binarySearch;

import java.util.*;

public class Example {
    public static void main(String[] args) {
        //create an ArrayList<String> from the contents of color array
        String[] colors = {"red", "white", "blue", "black", "yellow", "purple", "tan", "pink"};
        List<String> list = new ArrayList<>(Arrays.asList(colors));

        Collections.sort(list); //zal gesorteerd worden conform natuurlijke volgorde
        System.out.printf("Sorted ArrayList: %s%n", list);

        //search list for various values
        printSearchResults(list,"black");
        printSearchResults(list,"red");
        printSearchResults(list,"pink");
        printSearchResults(list,"aqua");
        printSearchResults(list,"gray"); //steekt er niet in --> dus negatieve waarde
        printSearchResults(list,"teal"); // steekt er niet in --> dus negatieve waarde

    }

        private static void printSearchResults(List<String> list, String k) {
            System.out.printf("%nSearching for: %s%n", k);
            int result = Collections.binarySearch(list,k);

            if (result >= 0) {
                System.out.printf("Found at index %d%n", result);
            } else {
                System.out.printf("Not found (%d)%n", result);
            }
        }
}
