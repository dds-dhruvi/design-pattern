package src;

import src.observerPattern.FirstSubscriber;
import src.observerPattern.Publisher;
import src.strategyPattern.Sara;

public class Main {
    public static void main(String args[])  //static method
    {
        System.out.println("Static method");
//        strategyDesignPattern();
        observerDesignPattern();
    }

    public static void strategyDesignPattern(){
        Sara sara = new Sara();
        sara.display();
        sara.fly();
        sara.swim();
    }

    public static void observerDesignPattern(){
        Publisher publisher = new Publisher();

        FirstSubscriber firstSubscriber = new FirstSubscriber(publisher);

        publisher.setHumidity(10);
    }
}
