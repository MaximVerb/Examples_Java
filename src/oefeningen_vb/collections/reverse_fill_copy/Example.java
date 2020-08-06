package oefeningen_vb.collections.reverse_fill_copy;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        Character[] letters = { 'A', 'B', 'C'};
        List<Character> list = Arrays.asList(letters);
        System.out.println("list contains: ");
        output(list);

        //reverse the list
        Collections.reverse(list);
        System.out.printf("%nAfter calling reverse the list looks now like this:%n");
        output(list);

        //creating a copylist
        Character[] copylist = new Character[3];
        List<Character> copyList = Arrays.asList(copylist);

        //copy the contents of list into copylist
        Collections.copy(copyList, list); //eerst destination list, dan sourceList
        System.out.printf("%nAfter copying , copylist contains: %n");
        output(copyList);

        //fill list with Rs and changes array it's based on
        Collections.fill(list, 'R');
        System.out.printf("%nAfter calling fill, list contains: %n");
        output(list);
    }

    private static void output(List<Character> aList) {
        System.out.println("The list is: ");

        for(Character el : aList) {
            System.out.printf("%s ", el);
        }

        System.out.printf("%nMax: %s", Collections.max(aList));
        System.out.printf(" Min: %s%n", Collections.min(aList));
    }
}
