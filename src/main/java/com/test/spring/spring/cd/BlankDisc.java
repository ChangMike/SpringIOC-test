package com.test.spring.spring.cd;

import java.util.List;
// 空白光盘
public class BlankDisc implements CompactDisc {

  private String title; // 光盘名称
  private String artist;// 艺术家
  private List<String> tracks; // 磁道

  public BlankDisc(String title, String artist, List<String> tracks) {
    this.title = title;
    this.artist = artist;
    this.tracks = tracks;
  }

  public void play() {
    System.out.println("Playing " + title + " by " + artist);
    for (String track : tracks) {
      System.out.println("-Track: " + track);
    }
  }

}