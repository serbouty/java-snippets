package core.objects;

// Declaring Classes.
public class BicycleObject {

    // three fields
    public int cadence;
    public int gear;
    public int speed;

    // one constructor
    // called by the 'new' operator
    public BicycleObject(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }

    // four methods
    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }
}
