package io.github.leoregulus2002.sendMail;

import io.github.leoregulus2002.sendMail.auto.MailAliyunStarterAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Import(MailAliyunStarterAutoConfiguration.class)
public @interface EnableAliyunMail {
}
