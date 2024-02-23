# utils-springboot-starter

## 1. Introduce
This is a springboot starter for common utils.
## 2. Usage
### 2.1 Add dependency
### 2.2 AliyunMailUtil
@EnableAliyunMailUtil  in your springboot application class.
```java
    @Autowired
    private AliyunMail aliyunMail;
    @Test
    public void testSendMail() {
        DefaultAcsClient defaultClient = aliyunMail.getDefaultClient();
        MailAliyunInfo mailAliyunInfo = new MailAliyunInfo();
        mailAliyunInfo.setPhone("xxx")
                .setSign("xxx")
                .setTemplateCode("xxx")
                .setTemplatePrams("{\"code\":\"123456\"}")
                .setCode("123456");
        aliyunMail.send(defaultClient,mailAliyunInfo);
    }
``` 
### 2.3 yml
```yaml
mailaliyun:
  config:
    access-key-id: 
    region-id: 
    access-key-secret: 
```