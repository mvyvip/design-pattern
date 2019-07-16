package 创建型.工厂模式.简单工厂.pizza;

/**
 * Created by lt on 2019/7/16 0016.
 */
public class Client {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        pizzaStore.create("A");
    }

}
