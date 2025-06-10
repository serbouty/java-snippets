package core.objects;

// Declaring Classes.

public class ExtendedBicycle extends BicycleObject {

    // the ExtendedBicycle subclass has
    // one field
    public int seatHeight;

    // the ExtendedBicycle subclass has
    // one constructor
    public ExtendedBicycle(int startHeight, int startCadence,
                           int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }

    // the ExtendedBicycle subclass has one method
    public void setHeight(int newValue) { seatHeight = newValue; }
}
