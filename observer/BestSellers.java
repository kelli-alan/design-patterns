package observer;
import java.util.ArrayList;

/**
 * A list of best-selling novels that observers (classes that have implemented the
 * Observer interface) can watch
 * @author Kelli Alan
 */
public class BestSellers implements Subject {
  private ArrayList<Observer> observers;
  private ArrayList<Book> bestSellers;

  /**
   * Creates a new list of best-selling novels and a list of observers who will be notified
   * when a new best-seller is added to the best-sellers list
   */
  public BestSellers() {
    this.observers = new ArrayList<Observer>();
    this.bestSellers = new ArrayList<Book>();
  }

  /**
   * Adds an observer to the observer list
   * @param observer an instance of a class that has implemented the Observer interface
   */
  public void registerObserver(Observer observer) {
    this.observers.add(observer);
  }

  /**
   * Removes an observer from the observer list
   * @param observer an instance of a class that has implemented the Observer interface 
   */
  public void removeObserver(Observer observer) {
    this.observers.remove(observer);
  }

  /**
   * Alerts all observers on the observer list about a new best-seller
   * @param book the instance of the best-selling novel and associated author
   */
  public void notifyObservers(Book book) {
    for(int i = 0; i < this.observers.size(); ++i) {
      this.observers.get(i).update(book);
    }
  }

  /**
   * Appends a best-seller to the best-sellers list and notifies all observers
   * @param book the instance of the best-selling novel and associated author
   */
  public void addBook(Book book) {
    this.bestSellers.add(book);
    notifyObservers(book);
  }
}
