package strategy;

public class ShareText implements ShareBehaviour {
    @Override
    public void share() {
        System.out.println("I'm sharing by text!");
    }
}
