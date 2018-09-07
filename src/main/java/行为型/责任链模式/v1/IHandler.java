package 行为型.责任链模式.v1;

/**
 * Created by lt on 2018/9/7 0007.
 */
public interface IHandler {
    //一个女性（女儿、妻子或者母亲）要求逛街，你要处理这个请求
    public void HandleMessage(IWomen women);
}
