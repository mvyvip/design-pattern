package 创建型.单例模式;

/**
 * Created by lt on 2019/7/10 0010.
 */
public class SingleObjectWithLazyAndSync {

    private static SingleObjectWithLazyAndSync INSTANCE;

    private SingleObjectWithLazyAndSync() {}

    /**
     * 每次都加锁 效率低 建议使用 {@link SingleObjectWithTwoLock}
     * @return
     */
    public static synchronized SingleObjectWithLazyAndSync getSingleton(){
        if(INSTANCE == null) {
            INSTANCE = new SingleObjectWithLazyAndSync();
        }
        return INSTANCE;
    }

    public void doSomething(){
    }

    public static void main(String[] args) {
        SingleObjectWithLazyAndSync.getSingleton().doSomething();
    }

}
