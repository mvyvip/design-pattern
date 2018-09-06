package 结构形.代理模式;

public class ProxyClient {

    public static void main(String[] args) {
        Subject subject = new RealSubject();
        Subject proxy = new Proxy(subject);
        proxy.request();

        Subject proxy2 = new Proxy();
        proxy2.request();
    }

}

interface Subject {
    // 定义一个方法
    public void request();
}

class Proxy implements Subject {
    // 要代理哪个实现类
    private Subject subject = null;

    // 默认被代理者
    public Proxy() {
        this.subject = new Proxy();
    }

    // 通过构造函数传递代理者
    public Proxy(Object... objects) {
    }

    // 实现接口中定义的方法
    @Override
    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }

    // 预处理
    private void before() {
        // do something
    }

    // 善后处理
    private void after() {
        // do something
    }
}

class RealSubject implements Subject {
    // 实现方法
    @Override
    public void request() {
        // 业务逻辑处理
    }
}
