package com.sample.single;

/**
 * Created by lt on 2018/9/3 0003.
 */
public class Emperor {

    private static final Emperor emperor = new Emperor();

    private Emperor() {}

    public static Emperor getInstance() {
        return emperor;
    }

    // TODO 书上推荐方法用static
    public static void say() {
        System.out.println("我就是皇帝某某某....");
    }

    public static void main(String[] args) {
        Emperor.say();
    }

}
