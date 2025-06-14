package core.arrays;

// Copying Arrays.

class ArrayCopyDemo {
    public static void main(String[] args) {

        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto" };

        String[] copyTo = new String[7];

        System.arraycopy(copyFrom,2, copyTo, 0, 7);

        for (String coffee : copyTo) { // enhanced for statement
            System.out.print(coffee + " ");
        }
    }
}
