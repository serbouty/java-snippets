package core.controls;

// The If-Then-Else Statement.

class IfElseDemo {
    public static void main(String[] args) {

        int score = 76;
        char grade;

        if (score >= 90) {          // if
            grade = 'A';
        } else if (score >= 80) {   // then if
            grade = 'B';
        } else if (score >= 70) {   // then if
            grade = 'C';
        } else if (score >= 60) {   // then if
            grade = 'D';
        } else {                    // else
            grade = 'F';
        }

        System.out.println("Grade = " + grade); // Grade = C
    }
}
