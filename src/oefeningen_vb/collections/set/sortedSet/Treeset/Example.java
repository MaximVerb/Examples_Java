package oefeningen_vb.collections.set.sortedSet.Treeset;

import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.Collection;

public class Example {
    public static void main(String[] args) {
        NavigableSet<Integer> numbers = new TreeSet<>();
        numbers.add(4);
        numbers.add(8);
        numbers.add(3);

        for (int n : numbers) {
            System.out.printf("%s\t", n);   //3    4   8
        }

        System.out.println();

        numbers.add(5); //3     4   5   8
        for (int n : numbers) {
            System.out.printf("%s\t",n);
        }

        System.out.println();

        numbers.remove(4);  //3     5       8
        for (int n : numbers) {
            System.out.printf("%s\t",n);
        }

        System.out.println();

        System.out.println(numbers.first()); //3
        System.out.println(numbers.last()); //8
        System.out.println(numbers.ceiling(7)); //8
        System.out.println(numbers.floor(7));   //5
        System.out.println(numbers.higher(5));  //8
        System.out.println(numbers.lower(8));   //5

    }
}
