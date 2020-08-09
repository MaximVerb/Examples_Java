package oefeningen_vb.collections.comparator.vbComparator2;

import java.util.Comparator;

public class BoxLengthComparator implements Comparator<Box> {
    @Override
    public int compare(Box o1, Box o2) {
        return o1.getLength() - o2.getLength();
    }
}
