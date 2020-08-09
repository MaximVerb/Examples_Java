package oefeningen_vb.collections.comparator.vbComparable1;

import java.util.*;

public class BoxSortingApp {
    public static void main(String[] args) {
        SortedSet<Box> boxes = new TreeSet<>();
        boxes.add(new Box(5,5,5));
        boxes.add(new Box(100,100,100));

        boxes.forEach(System.out::println);
    }
}
