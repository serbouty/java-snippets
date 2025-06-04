package core.controls;

// The Break Statement.
class BreakDemo {
    public static void main(String[] args) {

        int[] array = {32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127};

        int target = 12;

        int i;
        boolean isFound = false;

        // searches for the number 12 in an array
        for (i = 0; i < array.length; i++) {
            if (array[i] == target) {
                isFound = true;
                // terminates the innermost switch, for, while and do-while statement
                break; // unlabeled break statement
            }
        }

        if (isFound) {
            System.out.println("Found " + target + " at index " + i);
        } else {
            System.out.println(target + " not in the array");
        }
    }
}
