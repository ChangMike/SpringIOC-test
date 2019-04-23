package com.test.spring.spring.cd;

// 刘德华忘情水光盘
public class LiuDehuaCD implements CompactDisc {

  private String title = "忘情水";
  private String artist = "刘德华";
  
  public void play() {
    System.out.println("Playing " + title + " by " + artist);
  }

}
