package cn.yz.sendMail.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "mailaliyun.config")
@Data
public class MailAliyunProperties {
    private String regionId;
    private String accessKeyId;
    private String accessKeySecret;
}


