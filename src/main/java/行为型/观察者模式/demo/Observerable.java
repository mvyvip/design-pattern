package 行为型.观察者模式.demo;

/**
 * 被观察者
 * Created by lt on 2019/7/16 0016.
 */
public interface Observerable {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

}
