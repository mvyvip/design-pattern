package 行为型.命令模式;

/**
 * Created by lt on 2018/9/6 0006.
 */
public class CommandSample2 {
    public static void main(String[] args) {
        Receiver2 receiver = new Receiver2();
        Command2 cmd = new MyCommand(receiver);
        Invoker2 invoker = new Invoker2(cmd);
        invoker.action();
    }
}
interface Command2 {
    public void exe();
}
class MyCommand implements Command2 {

    private Receiver2 receiver;

    public MyCommand(Receiver2 receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        receiver.action();
    }
}
class Receiver2 {
    public void action(){
        System.out.println("command received!");
    }
}
class Invoker2 {

    private Command2 command;

    public Invoker2(Command2 command) {
        this.command = command;
    }

    public void action(){
        command.exe();
    }
}