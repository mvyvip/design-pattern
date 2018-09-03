package com.sample.factory_method.v1;

/**
 * Created by lt on 2018/9/3 0003.
 */
public class BlackHuman  implements Human {

    @Override
    public void getColor(){
        System.out.println("黑色人种的皮肤颜色是黑色的！");
    }

    @Override
    public void talk() {
        System.out.println("黑人会说话，一般人听不懂。");
    }

}