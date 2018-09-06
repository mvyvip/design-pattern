package 创建型.原型模式;

import lombok.Data;

/**
 * Created by lt on 2018/9/5 0005.
 */
@Data
public class Mail {
    //收件人
    private String receiver;
    //邮件名称
    private String subject;
    //称谓
    private String appellation;
    //邮件内容
    private String contxt;
    //邮件的尾部，一般都是加上"XXX版权所有"等信息
    private String tail;
    //构造函数
    public Mail(AdvTemplate advTemplate){
        this.contxt = advTemplate.getAdvContext();
        this.subject = advTemplate.getAdvSubject();
    }
}
