package oefeningen_vb.collections.arraylistIterator;

import java.util.*;

public class Example {
    public static void main(String[] args) {
        //add elements in color array to list
        String [] colors = {"MAGENTA","RED","WHITE","BLUE","CYAN"};
        List <String> list = new ArrayList<>();

        for (String color : colors) {
            list.add(color);
        }

        //add elements in removeColors array to removeList
        String[] removecolors = {"RED","WHITE","BLUE"};
        List <String> removeList = new ArrayList<>();

        for (String color : removecolors) {
            removeList.add(color);
        }

        //output list contents
        System.out.println("Arraylist: ");

        for(int count = 0; count < list.size(); count++) {
            System.out.printf("%s ", list.get(count));
        }

        //remove from list the colors contained in removelist
        removeColors(list,removeList);

        //output list contents
        System.out.printf("%n%nArraylist after calling removeColors : %n");

        for (String color : list) {
            System.out.printf("%s ", color);
        }

    }

    private static void removeColors(Collection<String> collection1, Collection<String> collection2) {
        //get iterator
        Iterator<String> iterator = collection1.iterator();

        //loop while collection1 has items
        while (iterator.hasNext()) {
            if (collection2.contains(iterator.next())) {
                iterator.remove(); //remove current element
            }
        }
    }
}
