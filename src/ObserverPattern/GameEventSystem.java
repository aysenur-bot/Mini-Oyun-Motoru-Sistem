import java.util.*;

public class GameEventSystem {

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void notifyObservers(String event) {
        for (Observer o : observers) {
            o.update(event);
        }
    }
}