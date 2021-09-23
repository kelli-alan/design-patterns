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

  }

  public String getTitle() {
    return this.title;
  }

  private Flight[] growArray(Flight[] flights) {
    return new Flight[size * 2];
  }

  public FlightIterator createIterator() {
    return new FlightIterator(this.flights);
  }


}
