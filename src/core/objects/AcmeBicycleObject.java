package core.objects;

// What is an Interface ?
class AcmeBicycleObject implements BicycleContract {

    int cadence = 0;
    int speed = 0;
    int gear = 1;

    public void changeCadence(int newValue) {
        cadence = newValue;
    }

    public void changeGear(int newValue) {
        gear = newValue;
    }

    public void speedUp() {
        speed = speed + 10;
    }

    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    void printStates() {
        System.out.println("cadence:" +
                cadence + " speed:" +
                speed + " gear:" + gear);
    }
}

interface BicycleContract {
    void changeCadence(int newValue);
    void changeGear(int newValue);
    void speedUp();
    void applyBrakes(int decrement);
}
