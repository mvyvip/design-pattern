package 行为型.中介者模式.model;

/**
 * 抽象同事类
 * Created by lt on 2018/9/6 0006.
 */
public abstract class Colleague {
    protected Mediator mediator;
    public Colleague(Mediator _mediator){
        this.mediator = _mediator;
    }
}
