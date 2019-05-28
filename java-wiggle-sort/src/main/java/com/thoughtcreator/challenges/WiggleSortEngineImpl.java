package com.thoughtcreator.challenges;

import java.util.Arrays;
import java.util.Collection;
import java.util.Vector;

public class WiggleSortEngineImpl implements WiggleSortEngine {
  public int[] wiggleSortArray(int[] array) {
    return sortArray(array);
  }

  public int[] sortArray(int[] array) {

    Arrays.sort(array);

    int size = array.length;
    int j = 0;
    int[] result = new int[size];

    for (int i = 0; i < size; i += 2) {

      result[i] = array[j];
      if (i < size) {
        result[i + 1] = array[size - 1 - j];
      }
      j += 1;
    }
    return result;
  }

  public Vector<Integer> wiggleSortArray(Collection<Integer> collection) {
    return null;
  }

  public Iterable<Integer> wiggleSortArray(Iterable<Integer> iterable) {
    return null;
  }

}
