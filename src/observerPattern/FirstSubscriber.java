package src.observerPattern;

public class FirstSubscriber implements Observer{
    int temp;
    int pressure;
    int humidity;
    Publisher publisher;

    public FirstSubscriber(Publisher publisher1){
        this.publisher = publisher1;
        publisher.addObserver(this);
    }

    @Override
    public void update(int temp, int pressure, int humidity) {
        this.humidity = humidity;
        this.temp = temp;
        this.pressure = pressure;
        display();
    }

    public  void display(){
        System.out.println("The temp is "+(this.temp) + "The humidity is " + this.humidity);
    }
}
