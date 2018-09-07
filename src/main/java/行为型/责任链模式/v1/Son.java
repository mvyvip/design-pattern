package 行为型.责任链模式.v1;

/**
 * Created by lt on 2018/9/7 0007.
 */
public class Son  implements IHandler {
    //母亲向儿子请示
    public void HandleMessage(IWomen women) {
        System.out.println("母亲的请示是："+women.getRequest());
        System.out.println("儿子的答复是：同意");
    }

}
