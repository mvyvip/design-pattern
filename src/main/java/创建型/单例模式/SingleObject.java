package 创建型.单例模式;

/**
 * Created by lt on 2018/9/3 0003.
 */
public class SingleObject {

    private static final SingleObject singleObject = new SingleObject();

    private SingleObject() {}

    public static SingleObject getInstance() {
        return singleObject;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(SingleObject.getInstance().hashCode());
        }
    }

}
