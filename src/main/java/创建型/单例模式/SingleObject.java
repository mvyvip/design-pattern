package 创建型.单例模式;

/**
 * Created by lt on 2019/7/10 0010.
 */
public class SingleObject {

    private static final SingleObject INSTANCE = new SingleObject();

    private SingleObject() {}

    public static SingleObject getSingleton(){
        return INSTANCE;
    }

    public void doSomething(){
    }

    public static void main(String[] args) {
        SingleObject.getSingleton().doSomething();
    }

}
