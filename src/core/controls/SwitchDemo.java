package core.controls;

class SwitchDemo {
    public static void main(String[] args) {

        // Branching with Switch Statements.

        // calculates the number of days in a particular month
        int month = 2;
        int year = 2025;
        int numDays = 0;

        switch (month) {
            // multiple case labels
            case 1: case 3: case 5:     // January, March, May
            case 7: case 8: case 10:    // July, August, October
            case 12:                    // December
                numDays = 31;
                break;
            case 4: case 6: case 9:     // April, June, September
            case 11:                    // November
                numDays = 30;
                break;
            case 2:                     // February
                // check if the current year is a leap year
                if (((year % 4 == 0) &&     // year is divisible by 4, not a leap year
                    !(year % 100 == 0)) ||  // year is divisible by 100, leap year
                    (year % 400 == 0))      // year is divisible by 400, not a leap year
                    numDays = 29;
                else
                    numDays = 28;
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }

        System.out.print("February " + year + ": " + numDays + " days. ");
        System.out.println("\\\\ switch statement");

        // Branching with Switch Expressions / since Java SE 14.

        String day = "WEDNESDAY";
        int len =
                switch (day) {
                    case "MONDAY", "FRIDAY", "SUNDAY" -> 6;
                    case "TUESDAY"                -> 7;
                    case "THURSDAY", "SATURDAY"     -> 8;
                    case "WEDNESDAY"              -> 9;
                    default -> -1;
                };
        System.out.println("len = " + len);

        // Producing a Value.

        numDays =
                switch (month) {
                    case 1, 3, 5, 7, 8, 10, 12 -> 31;
                    case 4, 6, 9, 11 -> 30;
                    case 2 -> {
                        if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
                            yield 29;
                        } else {
                            yield 28;
                        }
                    }
                    default -> 0;
                };

        System.out.print("February " + year + ": " + numDays + " days. ");
        System.out.println("\\\\ switch expression");

        // see Java SE 17 to allow null values
    }
}
