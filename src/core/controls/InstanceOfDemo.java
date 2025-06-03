package core.controls;

// The Type Comparison Operator Instanceof.
class InstanceOfDemo {
    public static void main(String[] args) {

        Parent parent = new Parent();
        Parent child = new Child();

        System.out.println("parent instanceof Parent: "
                + (parent instanceof Parent));              // true
        System.out.println("parent instanceof Child: "
                + (parent instanceof Child));               // false
        System.out.println("parent instanceof MyInterface: "
                + (parent instanceof MyInterface));         // false

        System.out.println("child instanceof Parent: "
                + (child instanceof Parent));               // true
        System.out.println("child instanceof Child: "
                + (child instanceof Child));                // true
        System.out.println("child instanceof MyInterface: "
                + (child instanceof MyInterface));          // true
    }
}

class Parent {}
class Child extends Parent implements MyInterface {}
interface MyInterface {}
