package com.fengxin58.wechat.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.OAuth2SsoCustomConfiguration;
import org.springframework.boot.autoconfigure.security.oauth2.client.OAuth2SsoDefaultConfiguration;
import org.springframework.boot.autoconfigure.security.oauth2.client.OAuth2SsoProperties;
import org.springframework.boot.autoconfigure.security.oauth2.resource.ResourceServerTokenServicesConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Import;

/**
 * 这是UI服务器
 * 
 * @author Gang
 *
 */
@SpringBootApplication
@EnableConfigurationProperties(OAuth2SsoProperties.class)
@Import({ MyOAuth2ClientConfiguration.class, OAuth2SsoDefaultConfiguration.class, OAuth2SsoCustomConfiguration.class,
		ResourceServerTokenServicesConfiguration.class })
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
