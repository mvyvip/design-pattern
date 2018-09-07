package 行为型.责任链模式.v2;

import 行为型.责任链模式.v1.IWomen;

/**
 * Created by lt on 2018/9/7 0007.
 */
public class Son extends Handler {
    //儿子只处理母亲的请求
    public Son(){
        super(Handler.SON_LEVEL_REQUEST);
    }
    //儿子的答复
    protected void response(IWomen women) {
        System.out.println("--------母亲向儿子请示-------");
        System.out.println(women.getRequest());
        System.out.println("儿子的答复是：同意\n");
    }

}
