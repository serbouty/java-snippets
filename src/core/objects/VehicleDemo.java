package core.objects; // VehicleObject available in the current package

// What is a Class ?

class VehicleDemo {
    public static void main(String[] args) {

        VehicleObject car1 = new VehicleObject(); // create two different Vehicle objects
        VehicleObject car2 = new VehicleObject();

        car1.changeCadence(50); // invoke methods on each objects
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
