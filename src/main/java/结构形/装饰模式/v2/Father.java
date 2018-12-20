package 结构形.装饰模式.v2;

import 结构形.装饰模式.v1.SchoolReport;

/**
 * Created by lt on 2018/9/10 0010.
 */
public class Father {
    public static void main(String[] args) {
//把美化过的成绩单拿过来
        SchoolReport sr= new SugarFouthGradeSchoolReport();
//看成绩单
        sr.report();
//然后老爸，一看，很开心，就签名了
        sr.sign("老三"); //我叫小三，老爸当然叫老三
    }
}
