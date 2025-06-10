package core.objects;

// Nested Classes.

class TopLevelClass {

    void accessMembers(OuterClass outer) {
        // compiler error: Cannot make a static reference to the non-static
        System.out.println(outer.outerField);
        System.out.println(OuterClass.staticOuterField);
    }
}
