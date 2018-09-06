package 行为型.中介者模式.model;

/**
 * Created by lt on 2018/9/6 0006.
 */
public class ConcreteMediator extends Mediator {
    @Override
    public void doSomething1() {
//调用同事类的方法，只要是public方法都可以调用
        super.c1.selfMethod1();
        super.c2.selfMethod2();
    }
    public void doSomething2() {
        super.c1.selfMethod1();
        super.c2.selfMethod2();
    }
}
