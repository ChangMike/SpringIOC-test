package com.test.spring;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {
    /**
     *  实例化播放器，创建的bean的id是和方法名相同
     *  cdPlayer 依赖的 compactDisc 即使不在这个配置类中实例化，甚至是在xml中实例化，
     *  也可以直接注入
     */

  @Bean
  public MediaPlayer cdPlayer(CompactDisc compactDisc) {
    return new CDPlayer(compactDisc);
  }
  // 实例化光盘
  @Bean
  public CompactDisc compactDisc() {
    return new LiuDehuaCD();
  }

}
