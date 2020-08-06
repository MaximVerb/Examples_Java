package oefeningen_vb.collections.map;

import java.util.*;

public class Example {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();

        createMap(myMap); //create a Map based on user input
        displayMap(myMap); //display Map content
    }

    private static void createMap(Map<String,Integer> map) {
        Scanner scanner = new Scanner(System.in); //create scanner
        System.out.println("Enter a String"); //prompt for user input
        String input = scanner.nextLine();

        //tokenize the input
        String[] tokens = input.split(" ");

        //processing input text
        for (String token : tokens) {
            String word = token.toLowerCase();

            //if the map contains the word
            if (map.containsKey(word)) {
                int count = map.get(word);
                map.put(word, count +1);
            } else {
                map.put(word, 1);
            }
        }
    }

    private static void displayMap (Map<String, Integer> map) {
        Set <String> keys = map.keySet(); //get keys

        //sort the keys
        TreeSet<String> sortedKeys = new TreeSet<>(keys);

        System.out.printf("%nMap contains:%nKey\t\tValue%n");

        //generate output for every key in the map
        for (String key: sortedKeys) {
            System.out.printf("%-10s%10s%n", key, map.get(key));
        }

        System.out.printf("%nsize: %d%nisEmpty: %b%n", map.size(), map.isEmpty());
    }
}
