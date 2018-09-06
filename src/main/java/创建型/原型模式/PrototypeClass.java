package 创建型.原型模式;

/**
 * 原型模式是在内存二进制流的拷贝，要比直接new一个对象性能好很多，特别是要在一
 个循环体内产生大量的对象时，原型模式可以更好地体现其优点。
 ● 逃避构造函数的约束
 这既是它的优点也是缺点，直接在内存中拷贝，构造函数是不会执行的（参见13.4
 节）。优点就是减少了约束，缺点也是减少了约束，需要大家在实际应用时考虑。

 原型模式的使用场景
 ● 资源优化场景
 类初始化需要消化非常多的资源，这个资源包括数据、硬件资源等。
 ● 性能和安全要求的场景
 通过new产生一个对象需要非常繁琐的数据准备或访问权限，则可以使用原型模式。
 ● 一个对象多个修改者的场景
 一个对象需要提供给其他对象访问，而且各个调用者可能都需要修改其值时，可以考虑
 使用原型模式拷贝多个对象供调用者使用。
 在实际项目中，原型模式很少单独出现，一般是和工厂方法模式一起出现，通过clone的
 方法创建一个对象，然后由工厂方法提供给调用者。原型模式已经与Java融为一体，大家可
 以随手拿来使用。

 */
public class PrototypeClass implements Cloneable{

    /**
     * 浅拷贝：只拷贝对象里面的基本类型的属性
     * 深拷贝：要拷贝对象里面引用的其他对象的属性
     * @return
     */
    @Override
    public PrototypeClass clone(){
        PrototypeClass prototypeClass = null;
        try {
            prototypeClass = (PrototypeClass)super.clone();
        } catch (CloneNotSupportedException e) {
            //异常处理
        }
        return prototypeClass;
    }
}
