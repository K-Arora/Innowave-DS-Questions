package com.thoughtcreator.challenges;

import junit.framework.TestCase;

public class MissingValueFinderTest extends TestCase {

    private MissingValueFinder finder;

    public MissingValueFinderTest() {
        super("Missing Value Finder Test");
    }

    public void test_WhenEmptyArrayIsProvided_ShouldReturnEmptyMissingValues() {
        int[] values = new int[0];

        this.finder = new Solution(values, 0);
        int[] missingValues = this.finder.findMissingValues();

        assertTrue(missingValues.length == 0);
    }

    public void test_WhenArrayWithoutMissingValuesIsProvided_ShouldReturnEmptyMissingValues() {
        int[] values = new int[] {1,2,3,4,5,6,7,8,9,10};
        int maxValue = 10;

        this.finder = new Solution(values, maxValue);
        int[] missingValues = this.finder.findMissingValues();

        assertTrue(missingValues.length == 0);
    }

    public void test_WhenArrayIsProvided_ShouldReturnAllMissingValues() {
        int[] values = new int[] {1,2,3,5,6,8,9,10};
        int maxValue = 10;

        this.finder = new Solution(values, maxValue);
        int[] missingValues = this.finder.findMissingValues();

        assertTrue(missingValues.length == 2);
        assertTrue(missingValues[0] == 4);
        assertTrue(missingValues[1] == 7);
    }
}
