package core.objects;

// Anonymous Classes.

class AnonymousClasses {

    // declare and instantiate a class at the same time

    interface HelloWorld {
        void greet();
        void greetSomeone(String someone);
    }

    void sayHello() {

        // local classes are declarations
        class EnglishGreeting implements HelloWorld {

            // custom field
            String name = "world";

            // implement greet
            public void greet() {
                greetSomeone(name);
            }

            // implement greetSomeone
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hello " + name);
            }
        }

        HelloWorld englishGreeting = new EnglishGreeting();

        // anonymous classes are expressions
        HelloWorld frenchGreeting = new HelloWorld() {

            // class definition
            // constructor is not allowed

            // custom field
            final String name = "tout le monde";
            // implement greet
            @Override
            public void greet() {
                greetSomeone(name);
            }
            // implement greetSomeone
            @Override
            public void greetSomeone(String someone) {
                someone = name;
                System.out.println("Hello " + someone);
            }
        };

        HelloWorld spanishGreeting = new HelloWorld() {
            // custom field
            final String name = "mundo";
            // implement greet
            @Override
            public void greet() {
                greetSomeone(name);
            }
            // implement greetSomeone
            @Override
            public void greetSomeone(String someone) {
                someone = name;
                System.out.println("Hello " + someone);
            }
        };

        englishGreeting.greet();
        frenchGreeting.greetSomeone("Karim");
        spanishGreeting.greet();
    }

    public static void main(String[] args) {
        AnonymousClasses app = new AnonymousClasses();

        app.sayHello();
    }
}
