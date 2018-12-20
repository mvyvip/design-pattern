package 结构形.装饰模式.v1;

/**
 * Created by lt on 2018/9/10 0010.
 */
public class Father {

    public static void main(String[] args) {
//把成绩单拿过来
        SchoolReport sr = new FouthGradeSchoolReport();
//看成绩单
        sr.report();
//签名？休想！
    }
}
