package core.objects;

// What is a Class ?
class VehicleDemo {
    public static void main(String[] args) {

        // Create two different Vehicle objects
        Vehicle car1 = new Vehicle();
        Vehicle car2 = new Vehicle();

        // Invoke methods on each objects
        car1.changeCadence(50);
        car1.speedUp();
        car1.changeGear(2);
        car1.printStates();

        car2.changeCadence(50);
        car2.speedUp();
        car2.changeGear(2);
        car2.changeCadence(40);
        car2.speedUp();
        car2.changeGear(3);
        car2.printStates();
    }
}