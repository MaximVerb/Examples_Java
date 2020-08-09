package oefeningen_vb.collections.comparator.MultipleComparator;

import oefeningen_vb.collections.comparator.vbComparable1.Box;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.ToIntFunction;

public class BoxSortingApp3 {
    public static void main(String[] args) {
        ToIntFunction<Box> lengthI = b -> b.getLength();
        ToIntFunction<Box> widthI = b -> b.getWidth();
        ToIntFunction<Box> heightI = b -> b.getHeight();

        Comparator<Box> compL = Comparator.comparingInt(lengthI);
        Comparator<Box> compW = compL.thenComparingInt(widthI);
        Comparator<Box> compH = compW.thenComparingInt(heightI);

        SortedSet<Box> boxes = new TreeSet<>(compH);
        boxes.add(new Box(5,5,5));
        boxes.add(new Box(100,100,100));

        //Dit kan makkelijker geschreven worden als volgt :

        /*SortedSet<Box> boxes = new TreeSet<>(Comparator.comparingInt(Box::getLength)
                .thenComparingInt(Box::getWidth)
                .thenComparingInt(Box::getHeight)); */

        boxes.forEach(System.out::println);
    }
}
