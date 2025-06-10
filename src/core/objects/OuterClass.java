package core.objects;

// Nested Classes.

class OuterClass {

    String outerField = "Outer field";
    static String staticOuterField = "Static outer field";

    // helper classes
    class InnerClass {

        // exist only within an instance of OuterClass
        // has direct access to the methods and the fields
        void accessMembers() {
            System.out.println(outerField);
            System.out.println(staticOuterField);
        }
    }

    // static helper classes
    static class StaticNestedClass {

        // cannot refer directly to instance variables or methods
        void accessMembers(OuterClass outer) {
            // compiler error: Cannot make a static reference to the non-static
            System.out.println(outer.outerField);
            System.out.println(staticOuterField);
        }
    }

    public static void main(String[] args) { // entrypoint
        System.out.println("Inner class:");
        System.out.println("------------");
        OuterClass outerObject = new OuterClass();
        OuterClass.InnerClass innerObject = outerObject.new InnerClass();
        innerObject.accessMembers();

        System.out.println("\nStatic nested class:");
        System.out.println("--------------------");
        StaticNestedClass staticNestedObject = new StaticNestedClass();
        staticNestedObject.accessMembers(outerObject);

        System.out.println("\nTop-level class:");
        System.out.println("--------------------");
        TopLevelClass topLevelObject = new TopLevelClass();
        topLevelObject.accessMembers(outerObject);
    }
}
