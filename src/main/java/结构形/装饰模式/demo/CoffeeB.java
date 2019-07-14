package 结构形.装饰模式.demo;

public class CoffeeB extends Beverage {


    public CoffeeB() {
        desc = "Coffee B";
    }

    @Override
    public double price() {
        return 2.99d;
    }



}
