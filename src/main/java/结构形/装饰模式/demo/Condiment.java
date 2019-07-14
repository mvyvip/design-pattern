package 结构形.装饰模式.demo;

/**
 * 调料类  也就是装饰者类
 */
public abstract class Condiment extends Beverage {

    /**
     * 所有调料都必须实现这个方法  稍后解释为什么
     * @return
     */
    public abstract String getDesc();

}
