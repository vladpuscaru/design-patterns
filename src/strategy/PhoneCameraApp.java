package strategy;

public abstract class PhoneCameraApp {
    protected ShareBehaviour shareBehaviour;

    public void setShareBehaviour(ShareBehaviour shareBehaviour) {
        this.shareBehaviour = shareBehaviour;
    }

    public void performShare() {
        shareBehaviour.share();
    }

    public void take() {
        System.out.println("I'm taking a photo!");
    }

    public void save() {
        System.out.println("I'm saving the photo to the device!");
    }

    public abstract void edit();
}
