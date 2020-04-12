package main;

import strategy.BasicCameraApp;
import strategy.CameraPlusApp;
import strategy.PhoneCameraApp;

public class MainStrategy {
    public static void main(String[] args) {
        PhoneCameraApp phoneCameraApp = new BasicCameraApp();
        phoneCameraApp.take();
        phoneCameraApp.edit();
        phoneCameraApp.save();
        phoneCameraApp.performShare();

        phoneCameraApp = new CameraPlusApp();
        phoneCameraApp.take();
        phoneCameraApp.edit();
        phoneCameraApp.save();
        phoneCameraApp.performShare();
    }
}
