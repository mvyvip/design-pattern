package 结构形.装饰模式.demo;

/**
 * 星巴克咖啡对象
 */
public abstract class Beverage {

    public String desc = "unknown beverage";

    public abstract double price();

    public String getDesc() {
        return desc;
    }

    public double getPrice() {
        return price();
    }

}
