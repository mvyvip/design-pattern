package 行为型.命令模式.v2;

/**
 * Created by lt on 2018/9/6 0006.
 */
public class Invoker {
    //什么命令
    private Command command;

    //客户发出命令
    public void setCommand(Command command){
        this.command = command;
    }
    //执行客户的命令
    public void action(){
        this.command.execute();
    }
}
