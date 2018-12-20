package 行为型.策略模式.model;

/**
 * Created by lt on 2018/9/12 0012.
 */
public class Client {
    public static void main(String[] args) {
//声明一个具体的策略
        Strategy strategy = new ConcreteStrategy1();
//声明上下文对象
        Context context = new Context(strategy);
//执行封装后的方法
        context.doAnythinig();
    }
}
