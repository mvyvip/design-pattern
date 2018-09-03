package com.sample.factory_method.v2;

/**
 * Created by lt on 2018/9/3 0003.
 */
public class ConcreteCreator extends Creator {

    @Override
    public <T extends Product> T createProduct(Class<T> c){
        Product product=null;
        try {
            product = (Product)Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            //异常处理
        }
        return (T)product;
    }
}