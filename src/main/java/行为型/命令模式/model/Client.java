package 行为型.命令模式.model;

/**
 * Created by lt on 2019/7/17 0017.
 */
public class Client {

    public static void main(String[] args) {
        Command command = new ConcreteCommand1();
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.action();
    }

}
