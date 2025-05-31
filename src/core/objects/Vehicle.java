package core.objects;

// What is a Class ?
class Vehicle {


    int cadence = 0; // object's state
    int speed = 0;
    int gear = 1;


    void changeCadence(int newValue) {
        cadence = newValue;
    } // object's behavior

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