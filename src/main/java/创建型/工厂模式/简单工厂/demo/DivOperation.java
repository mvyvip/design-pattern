package 创建型.工厂模式.简单工厂.demo;

/**
 * Created by lt on 2019/7/16 0016.
 */
public class DivOperation extends Operation {

    @Override
    public int calculate() {
        return super.getA()/super.getB();
    }
    
}
