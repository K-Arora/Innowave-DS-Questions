package com.thoughtcreator.challenges;

abstract class MissingValueFinder {
  protected int maxValue;
  protected int[] values;

  MissingValueFinder(int[] values, int maxValue) {
    this.maxValue = maxValue;
    this.values = values;
  }

  /**
   * @return an array containing
   */
  public abstract int[] findMissingValues();
}
