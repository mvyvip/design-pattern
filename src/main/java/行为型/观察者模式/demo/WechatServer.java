package 行为型.观察者模式.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lt on 2019/7/16 0016.
 */
public class WechatServer implements Observerable {

    private List<Observer> observers;

    private String message;

    public WechatServer() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.message(this.message);
        }
    }

    public void sendMessage(String message) {
        this.message = message;
        notifyObservers();
    }
}
