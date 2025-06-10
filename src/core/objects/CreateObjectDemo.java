package core.objects;

// Understanding What Objects Are.

public class CreateObjectDemo {
    public static void main(String[] args) {

        // declare and create a point object and two rectangle objects
        CreatePoint originOne = new CreatePoint(23, 94);
        CreateRectangle rectOne = new CreateRectangle(originOne, 100, 200);
        CreateRectangle rectTwo = new CreateRectangle(50, 100);

        // display rectOne's width, height, and area
        System.out.println("Width of rectOne: " + rectOne.width);
        System.out.println("Height of rectOne: " + rectOne.height);
        System.out.println("Area of rectOne: " + rectOne.getArea());

        // set rectTwo's position
        rectTwo.origin = originOne;

        // display rectTwo's position
        System.out.println("X Position of rectTwo: " + rectTwo.origin.x);
        System.out.println("Y Position of rectTwo: " + rectTwo.origin.y);

        // move rectTwo and display its new position
        rectTwo.move(40, 72);
        System.out.println("X Position of rectTwo: " + rectTwo.origin.x);
        System.out.println("Y Position of rectTwo: " + rectTwo.origin.y);
    }
}

class CreatePoint {

    public int x = 0;
    public int y = 0;

    // a constructor!
    public CreatePoint(int a, int b) {
        x = a;
        y = b;
    }
}

class CreateRectangle {

    public int width = 0;
    public int height = 0;

    public CreatePoint origin;

    // four constructors
    public CreateRectangle() {
        origin = new CreatePoint(0, 0);
    }

    public CreateRectangle(CreatePoint p) {
        origin = p;
    }

    public CreateRectangle(int w, int h) {
        origin = new CreatePoint(0, 0);
        width = w;
        height = h;
    }

    public CreateRectangle(CreatePoint p, int w, int h) {
        origin = p;
        width = w;
        height = h;
    }

    // a method for moving the rectangle
    public void move(int x, int y) {
        origin.x = x;
        origin.y = y;
    }

    // a method for computing the area of the rectangle
    public int getArea() {
        return width * height;
    }
}
