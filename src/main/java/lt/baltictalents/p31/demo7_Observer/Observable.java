package lt.baltictalents.p31.demo7_Observer;

public interface Observable {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();

}
