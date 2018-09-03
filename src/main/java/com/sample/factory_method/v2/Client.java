package com.sample.factory_method.v2;

/**
 * Created by lt on 2018/9/3 0003.
 */
public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.createProduct(ConcreteProduct1.class);
        /*
        * 继续业务处理
        */
    }
}
