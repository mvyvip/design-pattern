package 创建型.工厂模式.简单工厂.pizza;

import 创建型.工厂模式.简单工厂.demo.SimpleFactory;

/**
 * Created by lt on 2019/7/16 0016.
 */
public class PizzaStore {

    private SimplePizzaFactory simpleFactory;

    public PizzaStore(SimplePizzaFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
    }

    public Pizza create(String type) {
        return simpleFactory.createPizza(type);
    }
}
