package core.basics;

// The While and Do-while Statements.
class WhileDemo {
    public static void main(String[] args){

        int count = 1;

        while (count < 11) { // evaluation at the top of the loop

            System.out.println("Count is: " + count); // needs evaluation before execution
            count++;
        }
    }
}
