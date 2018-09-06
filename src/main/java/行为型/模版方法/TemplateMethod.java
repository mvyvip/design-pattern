package 行为型.模版方法;

public class TemplateMethod {
    public static void main(String[] args) {
        AbstractClass class1 = new ConcreteClass1();
        AbstractClass class2 = new ConcreteClass2();
        // 调用模板方法
        class1.templateMethod();
        class2.templateMethod();
    }
}

abstract class AbstractClass {
    // 基本方法
    protected abstract void doSomething();

    // 基本方法
    protected abstract void doAnything();

    // 模板方法  一般加上final 防止之类复写
    public final void templateMethod() {
		/*
		 * 调用基本方法，完成相关的逻辑
		 */
        this.doAnything();
        this.doSomething();
    }
}

class ConcreteClass1 extends AbstractClass {
    // 实现基本方法
    @Override
    protected void doAnything() {
        // 业务逻辑处理
    }

    @Override
    protected void doSomething() {
        // 业务逻辑处理
    }

}

class ConcreteClass2 extends AbstractClass {
    // 实现基本方法
    @Override
    protected void doAnything() {
        // 业务逻辑处理
    }

    @Override
    protected void doSomething() {
        // 业务逻辑处理
    }
}
