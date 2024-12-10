import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {

    DataScene scene = new DataScene(); //Sets a scene object from the DataScene class


    scene.drawScene(); //Scene draws a scene on the theater
    
    Theater.playScenes(scene); // The theater plays the scene
  }
}