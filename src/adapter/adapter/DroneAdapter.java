package adapter.adapter;

import adapter.adaptee.Drone;
import adapter.target.Duck;

public class DroneAdapter implements Duck {
    Drone drone;

    public DroneAdapter(Drone drone) {
        this.drone = drone;
    }

    @Override
    public void quack() {
        drone.beep();
    }

    @Override
    public void fly() {
        drone.spinRotors();
        drone.takeOff();
    }
}
