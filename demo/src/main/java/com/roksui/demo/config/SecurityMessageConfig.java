package com.roksui.demo.config;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

/**
 * �޼��� ���� Config ����
 */
@Configuration
public class SecurityMessageConfig {

  @Bean
  public MessageSource messageSource() {
    Locale.setDefault(Locale.KOREA); // ��ġ �ѱ����� ���� (�ѱ���� ���� �޼��� ������)
    ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();

    messageSource.setDefaultEncoding("UTF-8"); // ���ڵ� ����
    messageSource.setBasenames("classpath:message/security_message", "classpath:org/springframework/security/messages"); // Ŀ������ properties ����, security properties ���� ������� ����
    return messageSource;
  }

}