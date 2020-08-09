package oefeningen_vb.collections.comparator.vbComparator2;


import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class BoxSortingApp2 {
    public static void main(String[] args) {
        SortedSet<Box> boxes = new TreeSet<>(Comparator.comparingInt(b -> b.getWidth()));
        boxes.add(new Box(5,5,5));
        boxes.add(new Box(100,100,3));

        boxes.forEach(System.out::println);
    }
}
