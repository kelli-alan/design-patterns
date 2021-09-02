package strategy;
import java.util.ArrayList;

/**
 * A list of individuals attending an event
 * @author Kelli Alan
 */
public class GuestList {
  private String title;
  private ArrayList<String> people;
  private SearchBehavior searchBehavior;

  /**
   * Creates a new GuestList with the given title
   * @param title Name of the event the guests are attending
   */
  public GuestList(String title) {
    this.title = title;
    this.people = new ArrayList<String>();
    this.searchBehavior = new LinearSearch();
  }

  /**
   * Adds the specified person to the GuestList, if they are not already on the list
   * @param person Name of individual to add to the list
   * @return true if person is added to the list, false if person is already on the list,
   *         (case-insensitive)
   */
  public boolean add(String person) {
    if(!this.searchBehavior.contains(people, person)) {  // checks if person is on the list
      getList().add(person);
      return true;
    }
    return false;
  }

  /**
   * Removes the specified person from the GuestList, if they are found on the list
   * @param person Name of individual to remove from the list, case-insensitive
   * @return true if person is removed from the list, false if the person is not on the list
   */
  public boolean remove(String person) {
    if(this.searchBehavior.contains(getList(), person)) {  // checks if person is on the list
      getList().remove(person);
      return true;
    }
    return false;
  }

  /**
   * Retrieves the event name associated with a GuestList
   * @return String representing the GuestList event name
   */
  public String getTitle() {
    return this.title;
  }
  
  /**
   * Changes the searching algorithm used for adding and removing guests from the GuestList
   * @param searchBehavior the type of search to perform; GuestList objects default to LinearSearch
   */
  public void setSearchBehavior(SearchBehavior searchBehavior) {
    this.searchBehavior = searchBehavior;
  }

  /**
   * Retrieves the current list of names on the GuestList
   * @return An ArrayList of Strings where each index contains one guest name
   */
  public ArrayList<String> getList() {
    return this.people;
  }
}
