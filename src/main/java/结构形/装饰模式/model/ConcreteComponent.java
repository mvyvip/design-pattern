package 结构形.装饰模式.model;

/**
 * Created by lt on 2018/9/12 0012.
 */
public class ConcreteComponent extends Component {
    //具体实现
    @Override
    public void operate() {
        System.out.println("do Something");
    }
}
