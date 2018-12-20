package 行为型.策略模式.v1;

/**
 * Created by lt on 2018/9/12 0012.
 */
public class GivenGreenLight implements IStrategy {

    public void operate() {
        System.out.println("求吴国太开绿灯,放行！");
    }
}
