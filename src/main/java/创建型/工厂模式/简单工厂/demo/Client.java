package 创建型.工厂模式.简单工厂.demo;

/**
 * Created by lt on 2019/7/16 0016.
 */
public class Client {

    public static void main(String[] args) {
        String operator = "+";
        Operation operation = SimpleFactory.createOperation(operator);
        operation.setA(1);
        operation.setB(5);
        System.out.println(operation.calculate());
    }

}
