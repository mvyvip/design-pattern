package 行为型.命令模式.v2;

import 行为型.命令模式.v1.CodeGroup;
import 行为型.命令模式.v1.PageGroup;
import 行为型.命令模式.v1.RequirementGroup;

/**
 * Created by lt on 2018/9/6 0006.
 */
public abstract class Command {
    //把三个组都定义好，子类可以直接使用
    protected RequirementGroup rg = new RequirementGroup(); //需求组
    protected PageGroup pg = new PageGroup(); //美工组
    protected CodeGroup cg = new CodeGroup(); //代码组
    //只有一个方法，你要我做什么事情
    public abstract void execute();
}