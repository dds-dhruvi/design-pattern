package src.strategyPattern;

public class Sara extends human{

    @Override
    public void display() {
        System.out.println("Hi My name is Sara, I am a human");
    }

    public Sara(){
        flyBehaviour = new DoesNotFly();
        swimBehanvior = new Swim();
    }
}
