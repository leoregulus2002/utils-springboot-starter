package cn.yz.sendMail;

import cn.yz.sendMail.bean.MailAliyunInfo;
import cn.yz.sendMail.bean.MailAliyunProperties;
import cn.yz.sendMail.service.DefaultClient;
import cn.yz.sendMail.service.Send;
import com.aliyuncs.DefaultAcsClient;

public class AliyunMail {

    private final MailAliyunProperties mailAliyunProperties;
    public AliyunMail(MailAliyunProperties mailAliyunProperties) {
        this.mailAliyunProperties = mailAliyunProperties;
    }

    public DefaultAcsClient getDefaultClient() {
        return new DefaultClient().defaultClient(mailAliyunProperties);
    }
    public Boolean send(DefaultAcsClient defaultClient, MailAliyunInfo info) {
        return new Send().send(defaultClient, info);
    }
}
