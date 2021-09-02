package strategy;
import java.util.ArrayList;

/**
 * Implement a searching algorithm for an ArrayList
 * @author Kelli Alan
 */
public interface SearchBehavior {
  /**
   * Determines if a specified item is in a given ArrayList
   * @param data the ArrayList of Strings to search
   * @param item the String to search for in the given ArrayList
   * @return true if the String is found in the ArrayList; false if the String is not found
   */
  public boolean contains(ArrayList<String> data, String item);
}