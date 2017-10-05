package com.iktex.model;

/**
 *
 * @author teyyub Oct 5, 2017 8:46:30 AM
 */
public class DataStructure {

    // Create an array
    private final static int SIZE = 15;
    private final int[] arrayOfInts = new int[SIZE];

    public DataStructure() {
        // fill the array with ascending integer values
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }

    public void printEven() {

        // Print out values of even indices of the array
        DataStructureIterator iterator = this.new EvenIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    interface DataStructureIterator extends java.util.Iterator<Integer> {
    }

    // Inner class implements the DataStructureIterator interface,
    // which extends the Iterator<Integer> interface
    private class EvenIterator implements DataStructureIterator {

        // Start stepping through the array from the beginning
        private int nextIndex = 0;

        @Override
        public boolean hasNext() {

            // Check if the current element is the last in the array
            return (nextIndex <= SIZE - 1);
        }

        @Override
        public Integer next() {

            // Record a value of an even index of the array
            Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);

            // Get the next even element
            nextIndex += 2;
            return retValue;
        }
    }
}
