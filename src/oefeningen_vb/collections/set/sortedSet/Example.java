package oefeningen_vb.collections.set.sortedSet;

import java.util.*;

public class Example {
    public static void main(String[] args) {
        String[] colors = {"yellow","green","black","tan","grey","white","orange","red","green"};
        SortedSet<String> tree = new TreeSet<>(Arrays.asList(colors));

        System.out.println("sorted set: ");
        printSet(tree);

        //get headSet based on orange
        System.out.println("Headset for orange is: ");
        printSet(tree.headSet("orange"));

        //get tailSet based on orange
        System.out.println("Tailset based on orange is: ");
        printSet(tree.tailSet("orange"));
    }

    private static void printSet(SortedSet<String> set) {
        for (String s : set) {
            System.out.printf(" %s", s);
        }
        System.out.println();
    }
}
