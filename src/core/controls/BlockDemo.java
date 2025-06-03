package core.controls;

// Expressions, Statements and Blocks.
class BlockDemo {
    public static void main(String[] args) {

        // Floating Point Arithmetic.

        double d1 = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
        System.out.println("d1 == 1 ? \n" + (d1 == 1.0)); // false

        // Blocks.

        boolean condition = true;

        if (condition) {    // start block
            System.out.println("\nCondition is true.");
        }                   // end block 1
        else {              // start block 2
            System.out.println("Condition is false.");
        }                   // end block
    }
}
