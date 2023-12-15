package src.observerPattern;

import java.util.ArrayList;

public class Publisher implements Subject{
    ArrayList<Observer> observer;

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


    public void Publisher(){
        this.observer = new ArrayList<Observer>();
    }
    @Override
    public void addObserver(Observer newObserver) {
        observer.add(newObserver);

    }

    @Override
    public void notifyObserver() {
        for(Observer obs: observer){
            obs.update( temp, pressure, humidity);
        }
    }

    @Override
    public void removeOberver(Observer obs) {
        observer.remove(obs);
    }
}
