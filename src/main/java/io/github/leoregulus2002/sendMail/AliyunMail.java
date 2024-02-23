package io.github.leoregulus2002.sendMail;

import io.github.leoregulus2002.sendMail.bean.MailAliyunInfo;
import io.github.leoregulus2002.sendMail.bean.MailAliyunProperties;
import io.github.leoregulus2002.sendMail.service.DefaultClient;
import io.github.leoregulus2002.sendMail.service.Send;
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
