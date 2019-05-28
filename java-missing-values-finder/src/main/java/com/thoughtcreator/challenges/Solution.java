package com.thoughtcreator.challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution extends MissingValueFinder {

  Solution(int[] values, int maxValue) {
    super(values, maxValue);
  }

  /**
   * @return a sorted array containing the missing value.
   */
  public int[] findMissingValues() {

    List<Integer> list = new ArrayList<>();
    Map<Integer, Integer> map = new HashMap<>();

    // putting the values in the hashmap - Time complexity  - O(n)  and Space complexity.
    for (int i : values) {

      if (maxValue < i) {
        return new int[0];
      }
      map.put(i, i);
    }

    // if any number is missing, map's get method will return null. Add that number into the list.
    for (int i = 1; i < maxValue; i++) {

      if (null == map.get(i)) {
        list.add(i);
      }
    }

    // just copying it into the result list, bcz we have to return int[].
    final int[] result = new int[list.size()];
    int count = 0;
    for (Integer s : list) {
      result[count++] = s;
    }
    return result;
  }
}