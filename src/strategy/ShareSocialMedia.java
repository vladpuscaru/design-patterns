package strategy;

public class ShareSocialMedia implements ShareBehaviour {
    @Override
    public void share() {
        System.out.println("I'm sharing by social media!");
    }
}
