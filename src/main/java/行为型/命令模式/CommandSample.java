package 行为型.命令模式;

/**
 * 15.3.1 命令模式的优点
 ● 类间解耦
 调用者角色与接收者角色之间没有任何依赖关系，调用者实现功能时只需调用Command
 抽象类的execute方法就可以，不需要了解到底是哪个接收者执行。
 ● 可扩展性
 Command的子类可以非常容易地扩展，而调用者Invoker和高层次的模块Client不产生严
 重的代码耦合。
 ● 命令模式结合其他模式会更优秀
 命令模式可以结合责任链模式，实现命令族解析任务；结合模板方法模式，则可以减少
 Command子类的膨胀问题。
 15.3.2 命令模式的缺点
 命令模式也是有缺点的，请看Command的子类：如果有N个命令，问题就出来
 了，Command的子类就可不是几个，而是N个，这个类膨胀得非常大，这个就需要读者在项
 目中慎重考虑使用。
 15.3.3 命令模式的使用场景
 只要你认为是命令的地方就可以采用命令模式，例如，在GUI开发中，一个按钮的点击
 是一个命令，可以采用命令模式；模拟DOS命令的时候，当然也要采用命令模式；触发－反
 馈机制的处理等。
 */

public class CommandSample {

    public static void main(String[] args) {
//首先声明调用者Invoker
        Invoker invoker = new Invoker();
//定义接收者
        Receiver receiver = new ConcreteReciver1();
//定义一个发送给接收者的命令
        Command command = new ConcreteCommand1(receiver);
//把命令交给调用者去执行
        invoker.setCommand(command);
        invoker.action();
    }
}

abstract class Receiver {
    //抽象接收者，定义每个接收者都必须完成的业务
    public abstract void doSomething();
}

class ConcreteReciver1 extends Receiver{
    //每个接收者都必须处理一定的业务逻辑
    @Override
    public void doSomething(){
    }
}
class ConcreteReciver2 extends Receiver{
    //每个接收者都必须处理一定的业务逻辑
    @Override
    public void doSomething(){
    }
}

abstract class Command {
    //每个命令类都必须有一个执行命令的方法
    public abstract void execute();
}

class ConcreteCommand1 extends Command {
    //对哪个Receiver类进行命令处理
    private Receiver receiver;
    //构造函数传递接收者
    public ConcreteCommand1(Receiver _receiver){
        this.receiver = _receiver;
    }
    //必须实现一个命令
    @Override
    public void execute() {
//业务处理
        this.receiver.doSomething();
    }
}

class ConcreteCommand2 extends Command {
    //哪个Receiver类进行命令处理
    private Receiver receiver;
    //构造函数传递接收者
    public ConcreteCommand2(Receiver _receiver){
        this.receiver = _receiver;
    }
    //必须实现一个命令
    @Override
    public void execute() {
//业务处理
        this.receiver.doSomething();
    }
}

class Invoker {
    private Command command;
    //受气包，接受命令
    public void setCommand(Command _command){
        this.command = _command;
    }
    //执行命令
    public void action(){
        this.command.execute();
    }
}