package oefeningen_vb.collections.Immutable.partiallyImmutable;

import java.util.*;

public class Example {
    List<String> list = new ArrayList<>();
    List<String> list2 = Collections.unmodifiableList(list);
}
