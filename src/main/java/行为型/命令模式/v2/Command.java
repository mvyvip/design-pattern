package 行为型.命令模式.v2;

import 行为型.命令模式.v1.CodeGroupReceiver;
import 行为型.命令模式.v1.PageGroupReceiver;
import 行为型.命令模式.v1.RequirementGroupReceiver;

/**
 * Created by lt on 2018/9/6 0006.
 */
public abstract class Command {
    //把三个组都定义好，子类可以直接使用
    protected RequirementGroupReceiver rg = new RequirementGroupReceiver(); //需求组
    protected PageGroupReceiver pg = new PageGroupReceiver(); //美工组
    protected CodeGroupReceiver cg = new CodeGroupReceiver(); //代码组

    //只有一个方法，你要我做什么事情
    public abstract void execute();
}