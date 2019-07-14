package 结构形.装饰模式.demo;

public class CoffeeC extends Beverage {


    public CoffeeC() {
        desc = "Coffee C";
    }

    @Override
    public double price() {
        return 3.99d;
    }



}
