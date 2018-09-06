package 行为型.命令模式.v2;

/**
 * Created by lt on 2018/9/6 0006.
 */
public class DeletePageCommand extends Command {
    //执行删除一个页面的命令
    @Override
    public void execute() {
//找到页面组
        super.pg.find();
//删除一个页面
        super.rg.delete();
//给出计划
        super.rg.plan();
    }
}
