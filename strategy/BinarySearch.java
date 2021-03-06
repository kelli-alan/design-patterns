package strategy;
import java.util.ArrayList;

/**
 * 1. Sorts an ArrayList alphabetically
 * 2. Splits the ArrayList in half
 * 3. Searches the half where the String of interest could be, lexicographically
 * 4. Repeats step 2 and 3 until the item is found, or no more splits can be made
 * Referenced Introduction to The Design and Analysis of Algorithms, 3rd Ed. by Anany Levitin, p.151
 * @author Kelli Alan
 */
public class BinarySearch implements SearchBehavior {
  
  /**
   * Utilizes the binary search algorithm to check if the specified item is on the given ArrayList
   * @param data ArrayList to search
   * @param item String to search for on the given ArrayList
   * @return true if the item is on the list, false if the item is not on the list
   */
  public boolean contains(ArrayList<String> data, String item) {
    data.sort(null);
    if(data.isEmpty()) {
      return false;
    }
    int startSearchIndex = 0;
    int stopSearchIndex = data.size() - 1;  // accounts for indexes starting at zero
      
    while(stopSearchIndex >= startSearchIndex) {
      int middle = (startSearchIndex + stopSearchIndex) / 2;
      if(item.equalsIgnoreCase(data.get(middle))) {
        return true;
      } else if(item.compareTo(data.get(middle)) < 0) {  // item is left of the middle index
          stopSearchIndex = middle - 1;
      } else {                                          // item is right of the middle index
          startSearchIndex = middle + 1;
      }
    }
    return false;
  }
}
