package 行为型.观察者模式.demo;

/**
 * Created by lt on 2019/7/16 0016.
 */
public class UserWithAutoRegister implements Observer {

    private String name;

    private Observerable observerable;

    public UserWithAutoRegister(String name, Observerable observerable) {
        this.name = name;
        this.observerable = observerable;
        observerable.registerObserver(this);
    }

    @Override
    public void message(String message) {
        System.out.println(name + "---" + message);
    }

}
