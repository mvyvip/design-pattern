package 行为型.观察者模式.jdk;

import java.util.Observable;

/**
 * Created by lt on 2019/7/16 0016.
 */
public class WechatServer extends Observable {

    public void snedMessage(String message) {
        setChanged();
        notifyObservers(message);
    }

}
