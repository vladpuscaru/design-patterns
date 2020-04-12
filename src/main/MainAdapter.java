package main;

import adapter.adaptee.Drone;
import adapter.adaptee.SuperDrone;
import adapter.adapter.DroneAdapter;
import adapter.target.Duck;
import adapter.target.RedDuck;

public class MainAdapter {
    public static void main(String[] args) {
        Duck duck = new RedDuck();
        testDuck(duck);

        Drone drone = new SuperDrone();
        Duck droneAdapter = new DroneAdapter(drone);
        testDuck(droneAdapter);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
