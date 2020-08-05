package oefeningen_vb.collections.shuffle;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {
    private List<Card> list;

    public DeckOfCards() {
        Card[] deck = new Card[52];
        int count = 0;

        for (Card.Afbeelding afb : Card.Afbeelding.values()) {
            for (Card.Soort srt : Card.Soort.values()) {
                deck[count] = new Card(afb, srt);
                count++;
            }
        }
        list = Arrays.asList(deck);
        Collections.shuffle(list);
    }

    public void printCards() {
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%-25s%s",list.get(i), ((i + 5) % 5 == 0) ? System.lineSeparator() : "");
        }
    }
}
