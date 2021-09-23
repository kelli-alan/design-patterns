package iterator;

public class Flight {
  private String flightNum;
  private String from;
  private String to;
  private int duration;
  private int transfers;

  public Flight(String flightNum, String from, String to, int duration, int transfers) {
    this.flightNum = flightNum;
    this.from = from;
    this.to = to;
    this.duration = duration;
    this.transfers = transfers;
  }

  public String getFrom() {
    return this.from;
  }

  public String getTo() {
    return this.to;
  }

  public int getDuration() {
    return this.duration;
  }

  public int getNumTransfers() {
    return this.transfers;
  }

  public String toString() {
    String flightDetails = "Flight Number: " + this.flightNum + "\nFrom: " + this.from + "\nTo: " + this.to + "\nDuration: " + this.duration / 60 + " hours " + this.duration % 60 + " minutes\n";

    if(this.transfers == 0) {
      flightDetails += "Direct Flight";
    } else if(this.transfers == 1) {
      flightDetails += "1 transfer";
    } else {
      flightDetails += this.transfers + "transfers";
    }

    return flightDetails;
  }
}
