package core.variables;

// Variables, Naming Variables, Primitive Types.
class VariableDemo {

    int cadence = 0; // instance variables (non-static fields)
    int speed = 0;

    final static int NUM_GEARS = 6; // class variables (static fields)

    public static void main(String[] args) { // parameters

        String string = "This is a string."; // java.lang.String

        // Creating Values with Literals.

        boolean result = true;
        char capitalC = 'C';
        byte b = 100;
        short s = 10000;
        int i = 100000;

        // Integer Literals.

        int decimalValue = 26;          // the number 26, in decimal
        int hexadecimalValue = 0x1a;    // the number 26, in hexadecimal
        int binaryValue = 0b11010;      // the number 26, in binary

        // Floating-Point Literals.

        double d1 = 123.4;      // 64-bit double literal
        float f1 = 123.4f;      // 32-bit float literal
        double d2 = 1.234e2;    // scientific notation

        // Using Underscore Characters in Numeric Literals.

        long creditCardNumber = 1234_5678_9012_3456L; // L recommended
        long socialSecurityNumber = 999_99_9999L;
        float pi = 3.14_15F;
        long hexBytes = 0xFF_EC_DE_5EL;
        long hexWords = 0xCAFE_BABEL;
        long maxLong = 0x7fff_ffff_ffff_ffffL;
        byte nybbles = 0b0010_0101;
        long bytes = 0b11010010_01101001_10010100_10010010;

        // The Var Keyword.

        var message = "Hello world!"; // only for local variables
    }
}
