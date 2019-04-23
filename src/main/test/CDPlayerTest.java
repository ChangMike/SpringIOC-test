import com.test.spring.CDPlayerConfig;
import com.test.spring.MediaPlayer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= CDPlayerConfig.class)
public class CDPlayerTest {
  // cdPlayer已经注入到了容器当中，这里要使用，还需要注入
  @Autowired
  private MediaPlayer cdPlayer;

  @Test
  public void play() {
    cdPlayer.play();
  }

}
