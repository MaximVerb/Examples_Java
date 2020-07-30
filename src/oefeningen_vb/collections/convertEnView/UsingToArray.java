package oefeningen_vb.collections.convertEnView;

import java.util.Arrays;
import java.util.LinkedList;

public class UsingToArray {
    public static void main(String[] args) {
        String[] colors = {"Black","Blue","Yellow"};
        LinkedList<String> list = new LinkedList<>(Arrays.asList(colors));
        //je maakt een linkedlist op basis van een arrayview

        list.addLast("red");
        list.add("pink"); //de add is hetzelfde als de addLast
        list.add(3,"green"); //je voegt iets toe in index  3
        list.addFirst("cyan");

        colors = list.toArray(new String[list.size()]);
        //je stopt de elementen van de linkedlist terug in een array
        //zie vooral dat de grootte van de lijst meegegeven wordt
        //want is de array kleiner dan het aantal elementen van de list? --> grootte array zal zich aanpassen
        //is de array groter dan de list? --> elementen gaan in de array vanaf index 0 en de elementen die teveel zijn
        //veranderen in null

        System.out.println("colors");

        for (String color : colors) {
            System.out.printf("%s ", color);
        }
    }
}
