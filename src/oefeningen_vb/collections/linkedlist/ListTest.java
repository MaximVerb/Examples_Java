package oefeningen_vb.collections.linkedlist;
//Lists, LinkedLists en ListIterators
import java.util.*;

public class ListTest {
    public static void main(String[] args) {
        //add color elements to list1
        String[] colors = {"black","yellow","green","blue","violet","silver"};
        List<String> list1 = new LinkedList<>();

        for (String color : colors) {
            list1.add(color);
        }

        //add colors2 elements to list2
        String[] colors2 = {"gold","white","brown","blue","gray","silver"};
        List<String> list2 = new LinkedList<>();

        for (String color : colors2) {
            list2.add(color);
        }

        list1.addAll(list2); //concatenate lists
        list2 = null; //release resources
        printList(list1);

        convertToUppercase(list1);
        printList(list1);

        System.out.printf("%nDeleting elements 4 to 6 ....");
        removeItems(list1, 4 , 7);
        printList(list1);
        printReversedList(list1); //print list in reverse order
    }

    private static void printList (List<String> list) {
        System.out.printf("%nlist:%n");

        for (String color : list) {
            System.out.printf("%s ", color);
        }

        System.out.println();
    }

    //locate String objects and convert to Uppercase
    private static void convertToUppercase(List<String> list) {
        ListIterator<String> iterator = list.listIterator();

        while(iterator.hasNext()) {
            String color = iterator.next(); //get item
            iterator.set(color.toUpperCase()); //converts to uppercase
        }
    }

    private static void removeItems(List<String> list, int start, int end) {
        list.subList(start,end).clear(); //remove items
    }

    private static void printReversedList (List<String> list) {
        ListIterator<String> iterator = list.listIterator(list.size());
        //je zet de iterator als cursor op't einde van de lijst
        System.out.printf("%nReversed List:%n");
        while (iterator.hasPrevious()) {
            System.out.printf("%s ",iterator.previous());
        }
    }
}
