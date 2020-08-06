package oefeningen_vb.collections.addAll_frequency_disjoint;

import java.util.*;

public class Example {
    public static void main(String[] args) {
        String[] colors = {"red","white","yellow","blue"};
        List<String> list1 = Arrays.asList(colors);
        ArrayList<String> list2 = new ArrayList<>();

        list2.add("black"); //add black to the end of list 2
        list2.add("red"); // add red to the end of list 2
        list2.add("green"); // add green to the end of list 2

        System.out.println("Before addAll, list2 contains: ");

        //display elements in list 2
        list2.forEach(System.out::println); //lambda expressie

        Collections.addAll(list2, colors); // add array colors to list2

        System.out.printf("%nAfter addAll list 2 contains: %n");

        list2.forEach(System.out::println); //lambda expressie

        //get frequency of element "red"
        int frequency = Collections.frequency(list2, "red");
        System.out.printf("%nThe frequency of red in list 2 equals %d%n", frequency);

        //to check if list1 and list2 have any element in common
        boolean disjoint = Collections.disjoint(list1,list2);
        System.out.printf("List 1 and list 2 %s elements in common", disjoint? "have" : "do not have");
    }
}
