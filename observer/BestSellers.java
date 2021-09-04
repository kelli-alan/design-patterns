package observer;
import java.util.ArrayList;

public class BestSellers implements Subject {
  private ArrayList<Observer> observers;
  private ArrayList<Book> bestSellers;

  public BestSellers() {
    this.observers = new ArrayList<Observer>();
    this.bestSellers = new ArrayList<Book>();
  }

  public void registerObserver(Observer observer) {
    this.observers.add(observer);
  }

  public void removeObserver(Observer observer) {
    this.observers.remove(observer);
  }

  public void notifyObservers(Book book) {
    for(int i = 0; i < this.observers.size(); ++i) {
      this.observers.get(i).update(book);
    }
  }

  public void addBook(Book book) {
    this.bestSellers.add(book);
    notifyObservers(book);
  }
}
