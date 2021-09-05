package observer;
import java.util.ArrayList;

/**
 * An observer who wants to keep track of all best-selling novels
 * @author Kelli Alan
 */
public class Customer implements Observer {
  private Subject subject;
  private String firstName;
  private String lastName;
  private ArrayList<Book> wishList;
  
  /**
   * Creates a new individual who wants to track best-selling novels;
   * Creates a wish list for the individual that will store all best-sellers;
   * Adds the Customer to the notification list, so they know when a new best-seller emerges
   * @param subject an instance of the BestSellers class
   * @param firstName the first name of the customer
   * @param lastName the last name of the customer
   */
  public Customer(Subject subject, String firstName, String lastName) {
    this.subject = subject;
    this.firstName = firstName;
    this.lastName = lastName;
    this.wishList = new ArrayList<Book>();
    subject.registerObserver(this);
  }
  
  /**
   * Adds a new best-seller to the customer's wishlist
   * @param book the novel that has reached best-seller status
   */
  public void update(Book book) {
    this.wishList.add(book);
  }
  
  /**
   * Prints the customer's entire wishlist to the console
   */
  public void display() {
    System.out.println("Wish List:");
    for(int i = 0; i < this.wishList.size(); ++i) {
      System.out.println(this.wishList.get(i).toString());
    }
  }
}
