package com.thoughtcreator.challenges;

import java.util.Collection;
import java.util.Vector;

public interface WiggleSortEngine {
    int[] wiggleSortArray(int[] array);
    Vector<Integer> wiggleSortArray(Collection<Integer> collection);
    Iterable<Integer> wiggleSortArray(Iterable<Integer> iterable);
}
