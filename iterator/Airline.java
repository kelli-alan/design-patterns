package iterator;

/**
 * Stores associated flights
 * @author Kelli Alan
 */
public class Airline {
  private String title;
  private Flight[] flights;
  private int size;

  /**
   * Creates a new airline that can initially store 2 flights
   * @param title name of the airline
   */
  public Airline(String title) {
    this.title = title;
    flights = new Flight[2];
    this.size = 0;
  }

  /**
   * Adds a flight with given characteristics to the end of an airline's Array of flights.
   * @param flightNum the number associated with the flight
   * @param from the starting location of the flight
   * @param to the destination of the flight
   * @param duration time spent flying in minutes
   * @param transfers number of flight stops
   */
  public void addFlight(String flightNum, String from, String to, int duration, int transfers) {
    Flight newFlight = new Flight(flightNum, from, to, duration, transfers);
    if(this.size >= this.flights.length) {
      growArray(flights);
    }    
    flights[size] = newFlight;
    ++size;
  }

  /**
   * Retrieves the name associated with an airline
   * @return the name of the airline
   */
  public String getTitle() {
    return this.title;
  }

  /**
   * Ensures there is enough space to add flights. A full array is copied into a new array with 
   * double the capacity of the original (full) array
   * @param flights a full array of flights
   * @return a new flight array with all the information in flights, but twice the size
   */
  private Flight[] growArray(Flight[] flights) {
    Flight[] BiggerFlightArray = new Flight[size * 2];
    for(int i = 0; i < size; ++i) {
      BiggerFlightArray[i] = flights[i];
    }
    this.flights = BiggerFlightArray;
    return this.flights;
  }

  /**
   * Creates a new iterator for flight arrays
   * @return an iterator to iterate through an array of flights
   */
  public FlightIterator createIterator() {
    return new FlightIterator(this.flights);
  }


}
