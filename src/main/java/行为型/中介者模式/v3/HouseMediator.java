package 行为型.中介者模式.v3;

/**
 * Created by lt on 2018/9/6 0006.
 */
public class HouseMediator extends Mediator {

    @Override
    public void operation(Person person, String message) {
        if(person instanceof Renter){
            // 将租屋的需求消息传递给 注册了的房东们
            for(Person landlord: landlordList){
                landlord.getMessage(message);
            }
        } else if(person instanceof Landlord){
            // 将房东的出租房消息传递给 注册了的 房屋求租者们
            for(Person renter : renterList){
                renter.getMessage(message);
            }
        }

    }

}