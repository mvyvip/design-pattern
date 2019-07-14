package 结构形.装饰模式.demo;

public class Client {

    public static void main(String[] args) {
        Beverage beverageA = new CoffeeA();
        System.out.println("普通的一杯咖啡 不要任何调料的名字和价格：" + beverageA.getDesc() + "----" + beverageA.getPrice());

        Beverage beverageB = new CoffeeB();
        beverageB = new CondimentA(beverageB);
        beverageB = new CondimentA(beverageB);
        System.out.println("咖啡B加了2份调料A：" + beverageB.getDesc() + "----" + beverageB.getPrice());

        Beverage beverageC = new CoffeeC();
        beverageC = new CondimentA(beverageC);
        beverageC = new CondimentB(beverageC);
        System.out.println("咖啡B加了2份调料一份A一份B：" + beverageC.getDesc() + "----" + beverageC.getPrice());

    }

}

