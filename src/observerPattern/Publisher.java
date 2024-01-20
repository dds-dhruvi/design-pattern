package src.observerPattern;

import java.util.ArrayList;

public class Publisher implements Subject{
    ArrayList<Observer> observers;

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
        notifyObserver();
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
        notifyObserver();
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
        notifyObserver();
    }

    int temp;
    int pressure;
    int humidity;


    public Publisher(){
        this.observers = new ArrayList<Observer>();
    }
    @Override
    public void addObserver(Observer newObserver) {
        observers.add(newObserver);

    }

    @Override
    public void notifyObserver() {
        for(Observer obs: observers){
            obs.update( temp, pressure, humidity);
        }
    }

    @Override
    public void removeOberver(Observer obs) {
        observers.remove(obs);
    }
}
