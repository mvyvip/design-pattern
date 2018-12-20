package 行为型.策略模式.demo;

/**
 * Created by lt on 2018/9/12 0012.
 */
public class EBankStrategy implements Strategy {

    @Override
    public Double calRecharge(Double charge, RechargeTypeEnum type) {
        return charge * 0.85;

    }
}