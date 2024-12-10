import org.code.theater.*;
import org.code.media.*;
import java.util.Random;

public class DataScene extends Scene {

  private String[] breeds;
  private String[] origins;
  private int[] maxLifespan;

  public DataScene() {
    breeds = FileReader.toStringArray("Cat.txt");
    origins = FileReader.toStringArray("Origin.txt");
    maxLifespan = FileReader.toIntArray("MaxLifeSpan.txt");
  }

  public void drawScene() {
    double averageLifespan = calcAverageLifespan();
    int randomNumber = (int)(Math.random() * 19) + 10;
    for (int i = 0; i < randomNumber; i++){
      String info = "Breed: " + breeds[i] + "\n" + "Max Lifespan: " + maxLifespan[i] + " years\n" + " Origin: " + origins[i] + "\n";
      setTextHeight(10);
      setTextBoxColor(maxLifespan[i], averageLifespan);
      
      drawText(info, 5, 10 + (i * 15));
      setTextBoxColor(maxLifespan[i], averageLifespan);
      playNote(60, 1.0);
      pause(0.5);
    }
  }

  private void setTextBoxColor(int lifespan, double averageLifespan) {
    if (lifespan > averageLifespan) {
      setTextColor("pink");
    } else {
      setTextColor("purple");
    }
  }

  private double calcAverageLifespan() {
    int totalLifespan = 0;
    for (int lifespan : maxLifespan) {
      totalLifespan += lifespan;
    }
    return (double) totalLifespan / maxLifespan.length;
  }
}