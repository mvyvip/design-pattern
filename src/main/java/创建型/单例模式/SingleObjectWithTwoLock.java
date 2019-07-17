package 创建型.单例模式;

/**
 * 双重检查加锁 延迟加载
 * Created by lt on 2019/7/10 0010.
 */
public class SingleObjectWithTwoLock {

    /** 使用validate 保持线程的可见性 */
    private static volatile SingleObjectWithTwoLock INSTANCE;

    private SingleObjectWithTwoLock() {}

    public static SingleObjectWithTwoLock getSingleton(){
        if(INSTANCE == null) {
            synchronized (SingleObjectWithTwoLock.class) {
                INSTANCE = new SingleObjectWithTwoLock();
            }
        }
        return INSTANCE;
    }

    public void doSomething(){
    }

    public static void main(String[] args) {
        SingleObjectWithTwoLock.getSingleton().doSomething();
    }

}
