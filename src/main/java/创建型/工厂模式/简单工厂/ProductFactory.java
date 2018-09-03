package 创建型.工厂模式.简单工厂;

public class ProductFactory {

    public Product product(Class<? extends Product> clazz) {
        Product product = null;
        try {
            product = clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return product;
    }

    public static void main(String[] args) {
        ProductFactory productFactory = new ProductFactory();

        Product product1 = productFactory.product(Product1.class);
        Product product2 = productFactory.product(Product2.class);

        product1.method();
        product2.method();
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