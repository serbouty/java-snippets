package core.basics;

// Bitwise and Bit Shift Operators.
class BitDemo {

    public static void main(String[] args) {

        int bitmask = 0x000F;
        int val = 0x2222;

        // ~ inverts a bit pattern
        // << >> >>>> shifts a bit pattern
        // & ^ | performs a bitwise operation

        System.out.println(val & bitmask); // 2
    }
}