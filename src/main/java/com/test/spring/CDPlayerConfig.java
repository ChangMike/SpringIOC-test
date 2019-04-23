package com.test.spring;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration还包括@Component的作用
 *
 * 包扫描，默认扫描同包及子包下的bean，下面是支持重构的配置
 * @ComponentScan(basePackageClasses = {CDPlayer.class, LiuDehuaCD.class})
 */

@Configuration
@ComponentScan
public class CDPlayerConfig {
}
