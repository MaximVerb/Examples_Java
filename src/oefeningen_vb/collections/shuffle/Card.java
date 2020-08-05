package oefeningen_vb.collections.shuffle;

public class Card {
    public enum Afbeelding { Aas, Twee, Drie, Vier, Vijf, Zes, Zeven, Acht, Negen, Tien, Boer, Koningin, Koning}
    public enum Soort { Ruiten, Klaveren, Harten, Schoppen}

    private final Afbeelding afb;
    private final Soort srt;

    public Card(Afbeelding afb, Soort srt) {
        this.afb = afb;
        this.srt = srt;
    }

    public Afbeelding getAfb() {
        return afb;
    }

    public Soort getSrt() {
        return srt;
    }

    public String toString() {
        return String.format("%s van %s", afb, srt);
    }
}
