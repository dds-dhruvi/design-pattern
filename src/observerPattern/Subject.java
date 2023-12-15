package src.observerPattern;

public interface Subject {
    public void addObserver(Observer observer);
    public void removeOberver(Observer observer);
    public void notifyObserver();
}
