package iterator;
import java.util.Iterator;

public class FlightIterator implements Iterator {
  private Flight[] flights;
  private int position;

  public FlightIterator(Flight[] flights) {
    this.flights = flights;
  }

  public boolean hasNext() {
    if (flights[position + 1] == null) {
      return false;
    }
    return true;
  }

  public Flight next() {
    if(flights[position] == null) {
      return null;
    } else {
      int temp = this.position;
      ++this.position;
      return flights[temp];
    }
  }
}
