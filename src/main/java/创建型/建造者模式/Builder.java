package 创建型.建造者模式;

import lombok.Data;

/**
 * https://blog.csdn.net/u010102390/article/details/80179754
 * 建造者模式最主要的功能是基本方法的
 调用顺序安排，也就是这些基本方法已经实现了，通俗地说就是零件的装配，顺序不同产生
 的对象也不同；而工厂方法则重点是创建，创建零件是它的主要职责
 */
public class Builder {

    public static void main(String[] args) {
        Director director = new Director();
        Human human = director.createHumanByDirecotr(new SmartManBuilder());
        System.out.println(human.getHead());
        System.out.println(human.getBody());
        System.out.println(human.getHand());
        System.out.println(human.getFoot());
    }

}

@Data
class Human {
    private String head;
    private String body;
    private String hand;
    private String foot;
}

interface IBuildHuman {
    void buildHead();
    void buildBody();
    void buildHand();
    void buildFoot();
    Human createHuman();
}

class SmartManBuilder implements IBuildHuman {

    Human human;

    public SmartManBuilder() {
        human = new Human();
    }

    @Override
    public void buildHead() {
        human.setHead("智商180的头脑");
    }

    @Override
    public void buildBody() {
        human.setBody("新的身体");

    }

    @Override
    public void buildHand() {
        human.setHand("新的手");
    }

    @Override
    public void buildFoot() {
        human.setFoot("新的脚");
    }

    @Override
    public Human createHuman() {
        return human;
    }
}

class Director {
    public Human createHumanByDirecotr(IBuildHuman bh){
        bh.buildBody();
        bh.buildFoot();
        bh.buildHand();
        bh.buildHead();
        return bh.createHuman();
    }
}

