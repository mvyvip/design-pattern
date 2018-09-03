package 创建型.工厂模式.工厂方法;

/**
 * Created by lt on 2018/9/3 0003.
 */
public class FactoryMethod {

    public static void main(String[] args) {
        Factory productAFactory = new ProductAFactory();
        productAFactory.create().method();

        Factory productBFactory = new ProductBFactory();
        productBFactory.create().method();
    }
}

interface Factory {
    Product create();
}

class ProductAFactory implements Factory {

    @Override
    public Product create() {
        return new Product1();
    }
}

class ProductBFactory implements Factory {

    @Override
    public Product create() {
        return new Product2();
    }
}


interface Product {
    void method();
}

class Product1 implements Product {

    @Override
    public void method() {
        System.out.println("Product1.method");
    }

}

class Product2 implements Product {

    @Override
    public void method() {
        System.out.println("Product2.method");
    }

}