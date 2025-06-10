package core.objects;

// What is an Interface ?

interface BicycleContract {
    void changeCadence(int newValue);
    void changeGear(int newValue);
    void speedUp();
    void applyBrakes(int decrement);
}
