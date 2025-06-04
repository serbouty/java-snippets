package core.controls;

class BreakWithLabelDemo {
    public static void main(String[] args) {

        int[][] array = {   // multi-dimensional array
                {32, 87, 3, 589},
                {12, 1076, 2000, 8},
                {622, 127, 77, 955}
        };
        int target = 12;

        int i;
        int j = 0;
        boolean foundIt = false;

        // searches for the number 12 in an array
        search: // label
        for (i = 0; i < array.length; i++) {    // loop within the top-level
            for (j = 0; j < array[i].length;    // loop within integers
                 j++) {
                if (array[i][j] == target) {
                    foundIt = true;
                    // terminates an outer statement
                    break search;   // labeled break statement
                }
            }
        }

        if (foundIt) {
            System.out.println("Found " + target + " at " + i + ", " + j);
        } else {
            System.out.println(target + " not in the array");
        }
    }
}
