package observerPattern;

public interface Subject {
    void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();

}
