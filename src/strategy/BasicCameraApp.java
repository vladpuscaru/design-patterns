package strategy;

public class BasicCameraApp extends PhoneCameraApp {

    public BasicCameraApp() {
        shareBehaviour = new ShareText();
    }

    @Override
    public void edit() {
        System.out.println("I'm editing with editing software of the basic camera app!");
    }
}
