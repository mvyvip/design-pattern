package 结构形.装饰模式.demo;

public class CoffeeA extends Beverage {


    public CoffeeA() {
        desc = "Coffee A";
    }

    @Override
    public double price() {
        return 1.99d;
    }



}
