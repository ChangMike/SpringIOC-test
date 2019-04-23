package com.test.spring;

import org.springframework.stereotype.Component;

// 光盘实现类，使用包扫描自动注入
@Component
public class LiuDehuaCD implements CompactDisc {

  private String title = "忘情水";
  private String artist = "刘德华";
  
  public void play() {
    System.out.println("Playing " + title + " by " + artist);
  }

}
