package src.intro;

public class DoesNotFly implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I cannot not fly");
    }
}
