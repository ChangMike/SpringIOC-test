package com.test.spring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/**
 * 光盘播放器，使用包扫描自动注入
 * @Autowired，可以加在属性、构造方法、setter方法、及类的任何方法上
 * 加在方法上会从容器中得到方法参数的bean给方法传入参数
 */

@Component
public class CDPlayer implements MediaPlayer {

  private CompactDisc cd;
  // 没有无参的构造方法，会使用有参的构造方法
  public CDPlayer(CompactDisc cd) {
    this.cd = cd;
  }

  public void play() {
    cd.play();
  }

}
