package 行为型.策略模式.v1;

/**
 * Created by lt on 2018/9/12 0012.
 */
public class BackDoor implements IStrategy {
    public void operate() {
        System.out.println("找乔国老帮忙，让吴国太给孙权施加压力");
    }
}
