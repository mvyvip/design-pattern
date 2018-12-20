package 结构形.装饰模式.model;

/**
 * Created by lt on 2018/9/12 0012.
 */
public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
//第一次修饰
        component = new ConcreteDecorator1(component);
//第二次修饰
        component = new ConcreteDecorator2(component);
//修饰后运行
        component.operate();
    }
}
