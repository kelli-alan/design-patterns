package iterator;

public class Airline {
  private String title;
  private Flight[] flights;
  private int size;

  public Airline(String title) {
    this.title = title;
    flights = new Flight[2];
    this.size = 0;
  }

  public void addFlight(String flightNum, String from, String to, int duration, int transfers) {
    Flight newFlight = new Flight(flightNum, from, to, duration, transfers);
    if(this.size >= this.flights.length) {
      growArray(flights);
    }    
    flights[size] = newFlight;
    ++size;
  }

  public String getTitle() {
    return this.title;
  }

  private Flight[] growArray(Flight[] flights) {
    Flight[] BiggerFlightArray = new Flight[size * 2];
    for(int i = 0; i < size; ++i) {
      BiggerFlightArray[i] = flights[i];
    }
    this.flights = BiggerFlightArray;
    return this.flights;
  }

  public FlightIterator createIterator() {
    return new FlightIterator(this.flights);
  }


}
