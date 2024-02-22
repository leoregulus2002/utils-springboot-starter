package cn.yz.sendMail.service;

import cn.yz.sendMail.bean.MailAliyunInfo;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;

public class Send {
    public Boolean send(DefaultAcsClient defaultClient, MailAliyunInfo info) {
        SendSmsRequest request = new SendSmsRequest();
        request.setPhoneNumbers(info.getPhone());
        request.setSignName(info.getSign());
        request.setTemplateCode(info.getTemplateCode());
        request.setTemplateParam(info.getTemplatePrams());
        try {
            SendSmsResponse response = defaultClient.getAcsResponse(request);
            return "OK".equals(response.getCode());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
