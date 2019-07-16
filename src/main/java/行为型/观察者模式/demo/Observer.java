package 行为型.观察者模式.demo;

/**
 * 观察者
 * 当被观察者调用notifyObservers()方法时，观察者的update()方法会被回调
 * Created by lt on 2019/7/16 0016.
 */
public interface Observer {
    void message(String message);
}
