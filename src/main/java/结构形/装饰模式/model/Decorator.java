package 结构形.装饰模式.model;

/**
 * Created by lt on 2018/9/12 0012.
 */
public class Decorator extends Component {
    private Component component = null;
    //通过构造函数传递被修饰者
    public Decorator(Component _component){
        this.component = _component;
    }
    //委托给被修饰者执行
    @Override
    public void operate() {
        this.component.operate();
    }
}
