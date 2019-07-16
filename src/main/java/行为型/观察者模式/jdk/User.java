package 行为型.观察者模式.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by lt on 2019/7/16 0016.
 */
public class User implements Observer{

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(name + "----" + arg);
    }
}
