package oefeningen_vb.collections.sort;

import java.util.*;

public class Example {
    public static void main(String[] args) {
        String [] suits = {"Hearts","Diamonds","Clubs","Spades"};

        //create a list containing the array elements
        List <String> list = Arrays.asList(suits);
        System.out.printf("Unsorted array elements : %n%s", list);

        System.out.println();

        Collections.sort(list);
        System.out.printf("Sorted array elements: %n%s", list);
    }
}
