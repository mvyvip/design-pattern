package 行为型.命令模式.v1;

/**
 * Created by lt on 2018/9/6 0006.
 */
public class Client {
    public static void main(String[] args) {
        //首先客户找到需求组说，过来谈需求，并修改
        System.out.println("-----------客户要求增加一项需求---------------");
        Group rg = new RequirementGroup();
        //找到需求组
        rg.find();
        //增加一个需求
        rg.add();
        //要求变更计划
        rg.plan();
    }
}
