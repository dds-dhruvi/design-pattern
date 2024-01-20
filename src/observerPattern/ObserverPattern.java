package src.observerPattern;

public class ObserverPattern {
    public static void main(String[] args)  //static method
    {
        System.out.println("Static method");
        observerDesignPattern();
    }

    public static void observerDesignPattern(){
        Publisher publisher = new Publisher();

        FirstSubscriber firstSubscriber = new FirstSubscriber(publisher);

        publisher.setHumidity(10);
    }
}
