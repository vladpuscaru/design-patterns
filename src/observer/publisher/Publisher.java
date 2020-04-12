package observer.publisher;

import observer.observers.Observer;

public interface Publisher {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
