package 行为型.中介者模式.model;

/**
 * Created by lt on 2018/9/6 0006.
 */
public class ConcreteColleague1 extends Colleague {
    //通过构造函数传递中介者
    public ConcreteColleague1(Mediator _mediator){
        super(_mediator);
    }
    //自有方法 self-method
    public void selfMethod1(){
//处理自己的业务逻辑
    }
    //依赖方法 dep-method
    public void depMethod1(){
//处理自己的业务逻辑
//自己不能处理的业务逻辑，委托给中介者处理
        super.mediator.doSomething1();
    }
}
