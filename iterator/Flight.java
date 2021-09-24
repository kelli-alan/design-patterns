package iterator;

/**
 * Creates a flight
 * @author Kelli Alan
 */
public class Flight {
  private String flightNum;
  private String from;
  private String to;
  private int duration;
  private int transfers;

  /**
   * Creates a new flight with specified characteristics 
   * @param flightNum the number associated with the flight
   * @param from the starting location of the flight
   * @param to the destination of the flight
   * @param duration time spent flying in minutes
   * @param transfers number of flight stops
   */
  public Flight(String flightNum, String from, String to, int duration, int transfers) {
    this.flightNum = flightNum;
    this.from = from;
    this.to = to;
    this.duration = duration;
    this.transfers = transfers;
  }

  /**
   * Retrieves the starting location of a flight
   * @return starting location associated with a flight
   */
  public String getFrom() {
    return this.from;
  }

  /**
   * Retrieves destination of a flight
   * @return destination associated with a flight
   */
  public String getTo() {
    return this.to;
  }

  /**
   * Retrieves time spent flying in minutes
   * @return minutes spent flying from starting location to destination
   */
  public int getDuration() {
    return this.duration;
  }

  /**
   * Retrieves number of plane transfers required from starting location to destination
   * @return number of stops taken from starting location to destination
   */
  public int getNumTransfers() {
    return this.transfers;
  }

  /**
   * Concatenates all details of a specific flight
   * @return String representation of a flight including flight number, start location, 
   *         destination, duration in hours and minutes, and number of transfers
   */
  public String toString() {
    String flightDetails = "Flight Number: " + this.flightNum + "\nFrom: " + this.from + "\nTo: " + this.to + "\nDuration: " + this.duration / 60 + " hours " + this.duration % 60 + " minutes\n";

    if(this.transfers == 0) {
      flightDetails += "Direct Flight";
    } else if(this.transfers == 1) {
      flightDetails += "1 Transfer";
    } else {
      flightDetails += this.transfers + " Transfers";
    }

    return flightDetails;
  }
}
