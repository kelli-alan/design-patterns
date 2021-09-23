package iterator;
import java.util.Iterator;

public class FlightIterator implements Iterator {
  private Flight[] flights;
  private int position;

  public FlightIterator(Flight[] flights) {
    this.flights = flights;
  }

  public boolean hasNext() {
    return false;
  }

  public Flight next() {
    return null;
  }
}
