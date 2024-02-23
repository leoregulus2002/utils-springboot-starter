package io.github.leoregulus2002.sendMail.bean;

import lombok.Getter;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class MailAliyunInfo {
    private String phone;
    private String sign;
    private String templateCode;
    private String templatePrams;
    private String code;

    public MailAliyunInfo setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public MailAliyunInfo setSign(String sign) {
        this.sign = sign;
        return this;
    }

    public MailAliyunInfo setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }

    public MailAliyunInfo setTemplatePrams(String templatePrams) {
        this.templatePrams = templatePrams;
        return this;
    }

    public MailAliyunInfo setCode(String code) {
        this.code = code;
        return this;
    }

}
