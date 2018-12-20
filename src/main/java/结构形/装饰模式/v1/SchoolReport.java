package 结构形.装饰模式.v1;

/**
 * Created by lt on 2018/9/10 0010.
 */
public  abstract class SchoolReport {
    //成绩单主要展示的就是你的成绩情况
    public abstract void report();
    //成绩单要家长签字，这个是最要命的
    public abstract void sign(String name);
}
