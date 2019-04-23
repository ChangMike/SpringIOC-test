package com.test.spring;

// 光盘实现类
public class LiuDehuaCD implements CompactDisc {

  private String title = "忘情水";
  private String artist = "刘德华";
  
  public void play() {
    System.out.println("Playing " + title + " by " + artist);
  }

}
