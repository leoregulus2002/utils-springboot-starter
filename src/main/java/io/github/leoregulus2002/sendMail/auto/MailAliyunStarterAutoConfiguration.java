package io.github.leoregulus2002.sendMail.auto;

import io.github.leoregulus2002.sendMail.AliyunMail;
import io.github.leoregulus2002.sendMail.bean.MailAliyunInfo;
import io.github.leoregulus2002.sendMail.bean.MailAliyunProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(MailAliyunInfo.class)
@ConditionalOnWebApplication
@EnableConfigurationProperties(MailAliyunProperties.class)
public class MailAliyunStarterAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public AliyunMail aliyunMail(MailAliyunProperties mailAliyunProperties) {
        return new AliyunMail(mailAliyunProperties);
    }

}
