package strategy;

public class ShareEmail implements ShareBehaviour {
    @Override
    public void share() {
        System.out.println("I'm sharing by email!");
    }
}
