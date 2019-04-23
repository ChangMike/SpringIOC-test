package com.test.spring.spring;

import com.test.spring.spring.cd.CompactDisc;
import com.test.spring.spring.cd.LiuDehuaCD;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDConfig {
  @Bean
  public CompactDisc compactDisc() {
    return new LiuDehuaCD();
  }
}