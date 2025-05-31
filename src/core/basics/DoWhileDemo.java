package core.basics;

// The While and Do-while Statements.
class DoWhileDemo {
    public static void main(String[] args){

        int count = 1;

        do {
            System.out.println("Count is: " + count); // always executed at least once
            count++;
        } while (count < 11); // evaluation at the bottom of the loop
    }
}
