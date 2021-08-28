import java.util.ArrayList;

/**
 * Searches an ArrayList sequentially from index 0 to the end of the list for a specified item
 * @author Kelli Alan
 */
public class LinearSearch implements SearchBehavior {

  /**
   * Searches an ArrayList linearly, starting at index 0, for a case insensitive, specified String
   * @param data the ArrayList of Strings to search 
   * @param item the String to look for in the given ArrayList
   * @return true if the String is found in the ArrayList; false if the String is not found
   */
  public boolean contains(ArrayList<String> data, String item) {
    boolean wasFound = false;
    if(!data.isEmpty()) {
      for(int i = 0; i < data.size(); ++i) {
        if(data.get(i).equalsIgnoreCase(item)) {
          wasFound = true;
          break;
        }
      }
    }
    return wasFound;
    
  }
}
