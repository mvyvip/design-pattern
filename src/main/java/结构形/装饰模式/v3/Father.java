package 结构形.装饰模式.v3;

import 结构形.装饰模式.v1.FouthGradeSchoolReport;
import 结构形.装饰模式.v1.SchoolReport;

/**
 * Created by lt on 2018/9/10 0010.
 */
public class Father {
    public static void main(String[] args) {
//把成绩单拿过来
        SchoolReport sr;
//原装的成绩单
        sr = new FouthGradeSchoolReport();
//加了最高分说明的成绩单
        sr = new HighScoreDecorator(sr);
        sr.report();
//又加了成绩排名的说明
        sr = new SortDecorator(sr);
//看成绩单
//        sr.report();
//然后老爸一看，很开心，就签名了
        sr.sign("老三"); //我叫小三，老爸当然叫老三
    }
}
