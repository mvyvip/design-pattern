package 创建型.工厂模式.简单工厂.demo;

/**
 * Created by lt on 2019/7/16 0016.
 */
public class SimpleFactory {

    public static Operation createOperation(String operator){
        if ("+".equals(operator)) {
            return new AddOperation();
        }
        if ("-".equals(operator)) {
            return new SubOperation();
        }
        if ("*".equals(operator)) {
            return new MulOperation();
        }
        if ("/".equals(operator)) {
            return new DivOperation();
        }
        return null;
    }

}
