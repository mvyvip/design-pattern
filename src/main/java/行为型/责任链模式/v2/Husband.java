package 行为型.责任链模式.v2;

import 行为型.责任链模式.v1.IWomen;

/**
 * Created by lt on 2018/9/7 0007.
 */
public class Husband extends Handler {
    //丈夫只处理妻子的请求
    public Husband(){
        super(Handler.HUSBAND_LEVEL_REQUEST);
    }
    //丈夫请示的答复
    protected void response(IWomen women) {
        System.out.println("--------妻子向丈夫请示-------");
        System.out.println(women.getRequest());
        System.out.println("丈夫的答复是：同意\n");
    }
}
