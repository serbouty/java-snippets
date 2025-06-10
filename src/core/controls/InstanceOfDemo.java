package core.controls;

// The Type Comparison Operator Instanceof.

class InstanceOfDemo {
    public static void main(String[] args) {

        InstanceOfParent parent = new InstanceOfParent();
        InstanceOfParent child = new InstanceOfChild();

        System.out.println("parent instanceof Parent: "
                + (parent instanceof InstanceOfParent));              // true
        System.out.println("parent instanceof Child: "
                + (parent instanceof InstanceOfChild));               // false
        System.out.println("parent instanceof MyInterface: "
                + (parent instanceof InstanceOfInterface));         // false

        System.out.println("child instanceof Parent: "
                + (child instanceof InstanceOfParent));               // true
        System.out.println("child instanceof Child: "
                + (child instanceof InstanceOfChild));                // true
        System.out.println("child instanceof MyInterface: "
                + (child instanceof InstanceOfInterface));          // true
    }
}

class InstanceOfParent {}
class InstanceOfChild extends InstanceOfParent implements InstanceOfInterface {}
interface InstanceOfInterface {}
