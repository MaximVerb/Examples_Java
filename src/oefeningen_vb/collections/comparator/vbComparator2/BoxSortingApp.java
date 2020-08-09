package oefeningen_vb.collections.comparator.vbComparator2;


import java.util.SortedSet;
import java.util.TreeSet;

public class BoxSortingApp {
    public static void main(String[] args) {
        SortedSet<Box> boxes = new TreeSet<>(new BoxLengthComparator());
        boxes.add(new Box(5,5,5));
        boxes.add(new Box(100,100,3));

        boxes.forEach(System.out::println);
    }
}
