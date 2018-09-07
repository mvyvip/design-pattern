package 行为型.责任链模式.v1;

/**
 * Created by lt on 2018/9/7 0007.
 */
public class Husband implements IHandler {
    //妻子向丈夫请示
    public void HandleMessage(IWomen women) {
        System.out.println("妻子的请示是："+women.getRequest());
        System.out.println("丈夫的答复是：同意");
    }
}
