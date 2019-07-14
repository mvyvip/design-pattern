package 结构形.装饰模式.demo;

/**
 * 具体的调料类
 */
public class CondimentB extends Condiment {

    private Beverage beverage;

    public CondimentB(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc();
    }

    @Override
    public double price() {
        /** 10 是调料本身的价格 后面的是加的各种调料的价格 */
        return 10d + beverage.getPrice();
    }


}
