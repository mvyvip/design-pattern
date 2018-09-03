package com.sample.factory_method.v2;

/**
 * Created by lt on 2018/9/3 0003.
 */
public abstract class Creator {
    /*
    * 创建一个产品对象，其输入参数类型可以自行设置
    * 通常为String、Enum、Class等，当然也可以为空
    */
    public abstract <T extends Product> T createProduct(Class<T> c);
}
