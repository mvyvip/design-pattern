package 行为型.观察者模式.jdk;

/**
 * Created by lt on 2019/7/16 0016.
 */
public class Client {

    public static void main(String[] args) {
        WechatServer wechatServer = new WechatServer();

        User user = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");

        wechatServer.addObserver(user);
        wechatServer.addObserver(user2);
        wechatServer.addObserver(user3);

        wechatServer.snedMessage("xxx");

    }

}
