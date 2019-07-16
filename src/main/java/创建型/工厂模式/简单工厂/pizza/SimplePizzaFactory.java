package 创建型.工厂模式.简单工厂.pizza;

/**
 * Created by lt on 2019/7/16 0016.
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if("A".equals(type)) {
            pizza = new PizzaA();
        } else if("B".equals(type)) {
            pizza = new PizzaB();
        } else if("C".equals(type)) {
            pizza = new PizzaC();
        }

        return pizza;
    }

}
