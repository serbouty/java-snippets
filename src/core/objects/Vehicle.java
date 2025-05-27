package core.objects;

// What is a Class ?
class Vehicle {

    // Object's state.
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    // Object's behavior.
    void changeCadence(int newValue) {
        cadence = newValue;
    }

    void changeGear(int newValue) {
        gear = newValue;
    }

    void speedUp() {
        speed = speed + 10;
    }

    void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    void printStates() {
        System.out.println("cadence:" +
                cadence + " speed:" +
                speed + " gear:" + gear);
    }
}
