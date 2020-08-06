package oefeningen_vb.collections.Immutable.fullyImmutable;

import java.util.*;

public class Example {
    public static void main(String[] args) {
        //create immutable List
        List<String> colorList = List.of("red", "orange", "yellow");

        //create immutable Setµ
        Set<String> colorSet = Set.of("red", "orange", "yellow");

        //create immutable Map
        Map<String, Integer> dayMap = Map.of("Monday", 1 , "Tuesday", 2 , "Wednesday", 3);
    }
}
