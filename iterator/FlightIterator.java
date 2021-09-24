package iterator;
import java.util.Iterator;

/**
 * Implements an iterator for iterating through an array of flights
 * @author Kelli Alan
 */
public class FlightIterator implements Iterator{
  private Flight[] flights;
  private int position;

  /**
   * Creates a new iterator for a specified array of flights
   * @param flights the array of flights associated with the new iterator
   */
  public FlightIterator(Flight[] flights) {
    this.flights = flights;
  }

  /**
   * Determines if there is another flight in the array
   * @return true if there is another flight in the array, 
   *         false if the end of the array has been reached
   */
  public boolean hasNext() {
    return (position < flights.length && flights[position] != null);
  }

  /**
   * Retrieves the flight information at the next index and updates the iterator's position
   * @return the next flight in the array
   */
  public Flight next() {
    if(flights[position] == null) {
      return null;
    }
    return flights[position++];
  }
}
