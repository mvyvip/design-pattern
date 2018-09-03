package 创建型.工厂模式.抽象工厂模式;

/**
 * 抽象工厂
 * 工厂方法模式有一个问题就是，类的创建依赖工厂类，也就是说，如果想要拓展程序，
 * 必须对工厂类进行修改，这违背了闭包原则，所以，从设计角度考虑，有一定的问题，如何解决？
 * 就用到抽象工厂模式，创建多个工厂类，这样一旦需要增加新的功能，直接增加新的工厂类就可以了，
 * 不需要修改之前的代码
 */
public class AbstractFactory {

    public static void main(String[] args) {
        Factory factory = new ProductA();
        factory.createGift();
        factory.productMethod();
    }

}

interface Factory {

    public void productMethod();
    public Gift createGift();
}

class ProductA implements Factory {

    @Override
    public void productMethod() {
        System.out.println("ProductA");
    }

    @Override
    public Gift createGift() {
        return new GiftA();
    }
}

class ProductB implements Factory {

    @Override
    public void productMethod() {
        System.out.println("ProductB");
    }

    @Override
    public Gift createGift() {
        return new GiftB();
    }
}

interface Gift {

}

class GiftA implements Gift {

    public GiftA() {
        System.out.println("GiftA");
    }
}

class GiftB implements Gift {

    public GiftB() {
        System.out.println("GiftB");
    }
}
