package 创建型.工厂模式.简单工厂.demo;

import lombok.Data;

/**
 * Created by lt on 2019/7/16 0016.
 */
@Data
public abstract class Operation {

    private int a;

    private int b;

    public abstract int calculate();


}
