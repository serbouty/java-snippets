package core.arrays;

// Array Manipulations.
class ArrayCopyOfDemo {
    public static void main(String[] args) {

        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto" };

        // fewer lines with java.util.Arrays
        String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);

        for (String coffee : copyTo) {
            System.out.print(coffee + " ");
        }
    }
}
