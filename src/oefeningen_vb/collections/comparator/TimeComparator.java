package oefeningen_vb.collections.comparator;
//custom compare class that compares two time objects
import java.util.Comparator;

public class TimeComparator implements Comparator<Time> {  //voor dit voorbeeld gaan we uit van een Tijd-klasse
    //de diamand operator niet vergeten, anders gaat comparator default naar de Object klasse
    @Override
    public int compare(Time time1, Time time2) {
        int hourDifference = time1.getHour() - time2.getHour();

        if (hourDifference != 0) {
            return hourDifference;
        }

        int minuteDifference = time1.getMinutes() - time2.getMinutes();

        if (minuteDifference != 0) {
            return minuteDifference;
        }

        int secDiff = time1.getSec() - time2.getSec();
        return secDiff;
        }
}
