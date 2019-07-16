package 行为型.观察者模式.demo;

/**
 * Created by lt on 2019/7/16 0016.
 */
public class Client {

    public static void main(String[] args) {
        WechatServer wechatServer = new WechatServer();

        /** 自动注册 */
        UserWithAutoRegister userWithAutoRegister = new UserWithAutoRegister("user1", wechatServer);
        UserWithAutoRegister userWithAutoRegister2 = new UserWithAutoRegister("user2", wechatServer);
        UserWithAutoRegister userWithAutoRegister3 = new UserWithAutoRegister("user3", wechatServer);
        wechatServer.sendMessage("xxx");

        System.out.println("===============");

        /** 不自动注册 */
        User user = new User("a");
        User user2 = new User("b");
        User user3 = new User("c");

        wechatServer.registerObserver(user);
        wechatServer.registerObserver(user2);
        wechatServer.registerObserver(user3);

        wechatServer.sendMessage("xxx更新了文章");

        System.out.println("================");

        wechatServer.removeObserver(user2);

        wechatServer.sendMessage("xxx更新了文章");

    }

}
