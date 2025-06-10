package core.enums;

// Accessing, evaluating, and comparing enums.

enum DayOfWeek { // extends java.lang.Enum
    // constants
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    // constructor is allowed

    // see Enum class and Comparable interface for special methods

    public static void main(String[] args) {

        // check if two instances are the same
        DayOfWeek weekStart = DayOfWeek.MONDAY;

        if (weekStart == DayOfWeek.MONDAY) {
            System.out.println("The week starts on Monday.");
        }

        // perform actions depending on the value
        DayOfWeek someDay = DayOfWeek.FRIDAY;

        switch (someDay) {
            case MONDAY ->
                    System.out.println("The week just started.");
            case TUESDAY, WEDNESDAY, THURSDAY ->
                    System.out.println("We are somewhere in the middle of the week.");
            case FRIDAY ->
                    System.out.println("The weekend is near.");
            case SATURDAY, SUNDAY ->
                    System.out.println("Weekend");
            default ->
                    throw new AssertionError("Should not happen");
        }

        // see Sealed Classes and pattern matching
        String text = switch (someDay) {
            case MONDAY -> "The week just started.";
            case TUESDAY, WEDNESDAY, THURSDAY -> "We are somewhere in the middle of the week.";
            case FRIDAY -> "The weekend is near.";
            case SATURDAY, SUNDAY -> "Weekend";
        };

        System.out.println(text);
    }
}
