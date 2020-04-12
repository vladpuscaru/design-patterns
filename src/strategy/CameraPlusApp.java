package strategy;

public class CameraPlusApp extends PhoneCameraApp {

    public CameraPlusApp() {
        shareBehaviour = new ShareSocialMedia();
    }

    @Override
    public void edit() {
        System.out.println("I'm editing with editing software of the camera plus app!");
    }
}
