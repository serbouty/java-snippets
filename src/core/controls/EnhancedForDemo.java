package core.controls;

// The For Statement.

class EnhancedForDemo {
    public static void main(String[] args){

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int item : numbers) { // iterate through Collections, recommended
            System.out.println("Count is: " + item);
        }
    }
}
