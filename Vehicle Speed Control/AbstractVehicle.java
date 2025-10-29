package Vehicle_Speed_Control;

abstract class AbstractVehicle implements Vehicle {
    int speed = 0;

    abstract void showSpeed();
}