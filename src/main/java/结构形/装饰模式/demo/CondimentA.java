package 结构形.装饰模式.demo;

/**
 *  调料A
 */
public class CondimentA extends Condiment {

    private Beverage beverage;

    public CondimentA(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc();
    }

    @Override
    public double price() {
        /** 20 是调料本身的价格 后面的是加的各种调料的价格 */
        return 20d + beverage.getPrice();
    }


}
