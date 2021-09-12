package decorator;
import java.util.ArrayList;

/**
 * Store and print Strings representing a character
 * @author Kelli Alan
 */
public abstract class Character {
  protected ArrayList<String> sections;

  /**
   * Creates the container that holds the Strings that make up the extending characters
   */
  public Character() {
    sections = new ArrayList<String>();
  }

  /**
   * Prints each line of Strings to the console, resulting in the desired character
   */
  public void draw() {
    for(int i = 0; i < sections.size(); ++i) {
      System.out.println(sections.get(i));
    }
  }

}
