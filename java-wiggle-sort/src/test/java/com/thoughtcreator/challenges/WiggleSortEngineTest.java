package com.thoughtcreator.challenges;

import junit.framework.TestCase;

public class WiggleSortEngineTest extends TestCase {

  private WiggleSortEngine engine;

  public WiggleSortEngineTest() {
    super("Wiggle sort test");
    this.engine = new WiggleSortEngineImpl();
  }

  public void test_WhenArrayIsProvided_ShouldReturnWiggleSortedArray() {
    int[] input = new int[] {9, 1, 0, -3, 5, 11, 7, 49, 48, 47, 3, 2, 7, 0, 0, -1};
    int[] wiggleSortedValues = this.engine.wiggleSortArray(input);

    boolean isWiggleSorted = true;
    boolean ascending = true;
    for (int i = 0; i < wiggleSortedValues.length; i++) {
      if (i + 1 >= wiggleSortedValues.length) {
        break;
      }

      int first = wiggleSortedValues[i];
      int second = wiggleSortedValues[i + 1];

      if (ascending) {
        if (first >= second) {
          isWiggleSorted = false;
          break;
        }

        ascending = false;

      } else {
        if (first < second) {
          isWiggleSorted = false;
          break;
        }

        ascending = true;
      }
    }

    assertTrue(isWiggleSorted);
  }
}
