package com.test.spring.spring.player;
import com.test.spring.spring.cd.CompactDisc;
import org.springframework.beans.factory.annotation.Autowired;
/*
 * 光盘播放器
 * 自动注入cd
 */

public class CDPlayer implements MediaPlayer {
  private CompactDisc cd;

  @Autowired
  public CDPlayer(CompactDisc cd) {
    this.cd = cd;
  }

  public void play() {
    cd.play();
  }

}
