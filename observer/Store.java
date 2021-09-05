package observer;
import java.util.LinkedList;
import java.util.Queue;

/**
 * An observer who is interested in the top 5 best-selling novels at any time
 */
public class Store implements Observer{
  private Subject subject;
  private String title;
  private Queue<Book> bestSellers;

  /**
   * Creates a new Store with an associated list of best-sellers; Adds the Store to the
   * notification list, so it knows when a new best-seller emerges
   * @param subject an instance of the BestSellers class
   */
  public Store(Subject subject) {
    this.subject = subject;
    this.bestSellers = new LinkedList<Book>(); 
    subject.registerObserver(this);
  }

  /**
   * Updates the store's best-seller list; if 5 books are already on the list, the oldest book
   * is removed and the new book is added to the end of the list
   * @param book a new best-seller with its author
   */
  public void update(Book book) {
    if(this.bestSellers.size() >= 5) {
      this.bestSellers.remove();
    }
    this.bestSellers.add(book);
  }

  /**
   * Prints the current top 5 best-sellers to the console
   */
  public void display() {
    System.out.println("Top 5 Best Sellers:");
    while(bestSellers.peek() != null) {
      System.out.println(bestSellers.remove().toString());
    }
    System.out.println();
  }
}
