package core.objects;

// Inner Class Example.

public class DataStructure {

    // create an array
    private final static int SIZE = 15;
    private final int[] arrayOfInts = new int[SIZE];

    public DataStructure() {
        // fill the array with ascending integer values
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }

    public void printEven() {

        // print out values of even indices of the array
        DataStructureIterator iterator = this.new EvenIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    interface DataStructureIterator extends java.util.Iterator<Integer> { }

    // inner class implements the DataStructureIterator interface,
    // which extends the Iterator<Integer> interface.

    private class EvenIterator implements DataStructureIterator {

        // start stepping through the array from the beginning
        private int nextIndex = 0;

        // check if the current element is the last in the array
        public boolean hasNext() {
            return (nextIndex <= SIZE - 1);
        }

        public Integer next() { // wrapper class

            // record a value of an even index of the array
            Integer retValue = arrayOfInts[nextIndex];

            // get the next even element
            nextIndex += 2; // element divisible by 2
            return retValue;
        }
    }

    public static void main(String[] s) {

        // fill the array with integer values and print out only
        // values of even indices
        DataStructure ds = new DataStructure();
        ds.printEven();
    }
}
