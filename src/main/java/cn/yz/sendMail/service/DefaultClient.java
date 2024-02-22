package cn.yz.sendMail.service;

import cn.yz.sendMail.bean.MailAliyunProperties;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.profile.DefaultProfile;

public class DefaultClient {


    public DefaultAcsClient defaultClient(MailAliyunProperties mailAliyunProperties) {
        DefaultProfile profile = DefaultProfile.getProfile(mailAliyunProperties.getRegionId(),mailAliyunProperties.getAccessKeyId(),mailAliyunProperties.getAccessKeySecret());
        return new DefaultAcsClient(profile);
    }
}
