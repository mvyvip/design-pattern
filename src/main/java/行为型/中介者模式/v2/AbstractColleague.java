package 行为型.中介者模式.v2;

/**
 * Created by lt on 2018/9/6 0006.
 */
public abstract class AbstractColleague {

    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator _mediator) {
        this.mediator = _mediator;
    }
}