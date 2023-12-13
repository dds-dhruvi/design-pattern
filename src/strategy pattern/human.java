package src.intro;

public abstract class human {
//Program to an interface, not an implementation. we can use the flyBehaviour polymorphically.
//with this design, other types of objects can reuse our fly and swim behaviours because these
//    behaviors are no longer hidden in our human class
//    Example of programming to an implementation
//    Fly fly = new Fly();

//  Example of programming to an interface
    FlyBehaviour flyBehaviour;
    SwimBehanvior swimBehanvior;

    public abstract void display();

    public void walk(){
        System.out.println("I am walking");
    }

    public void swim(){
        swimBehanvior.swim();
    }

    public void fly(){
        flyBehaviour.fly();
    }

}
