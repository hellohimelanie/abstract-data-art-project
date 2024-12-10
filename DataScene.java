import org.code.theater.*;
import org.code.media.*;
import java.util.Random;

public class DataScene extends Scene {

  //Instance variables
  private String[] breeds; //Breeds of cats
  private String[] origins; //Origins of the breed
  private int[] maxLifespan; //Maximum lifespans of the breed

  
  //Makes 1d arrays about the breeds, origins, and maximum life spans using the txt files
  public DataScene() {
    breeds = FileReader.toStringArray("Cat.txt");
    origins = FileReader.toStringArray("Origin.txt");
    maxLifespan = FileReader.toIntArray("MaxLifeSpan.txt");
  }

  //Calculates the average maxmimum lifespan
  //Choose a random number
  //The average number is used for the other methods that needs the average number int
  //The random number is used for the for loop to decide how many cats to display
  //based on the random number
  //It shows the information of the cats such as it's breed, maximum lifespan and origin
  //The info is displayed on text and then other methods are used for it's display for the text color
  //A note of music is played
  //There's a pause each time a cat is displayed
  public void drawScene() {
    double averageLifespan = calcAverageLifespan();
    int randomNumber = (int)(Math.random() * 19) + 10;
    for (int i = 0; i < randomNumber; i++){
      String info = "Breed: " + breeds[i] + "\n" + "Max Lifespan: " + maxLifespan[i] + " years\n" + " Origin: " + origins[i] + "\n";
      setTextHeight(10);
      setTextBoxColor(maxLifespan[i], averageLifespan);     
      drawText(info, 5, 10 + (i * 15));
      playNote(60, 1.0);
      pause(0.5);
    }
  }

  //The method is used to decide the color of the text box of the cat information
  //If the lifespan of a cat is more than average it's pink
  //If not it's purple
  private void setTextBoxColor(int lifespan, double averageLifespan) {
    if (lifespan > averageLifespan) {
      setTextColor("pink");
    } else {
      setTextColor("purple");
    }
  }

  //This method is used to calculate the average lifespan of the breeds
  //It takes the total lifespan of all the lifespans of the breed and divides it by the number of lifespans there are
  private double calcAverageLifespan() {
    int totalLifespan = 0;
    for (int lifespan : maxLifespan) {
      totalLifespan += lifespan;
    }
    return (double) totalLifespan / maxLifespan.length;
  }
}