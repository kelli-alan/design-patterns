package observer;
import java.util.LinkedList;
import java.util.Queue;

public class Store implements Observer{
  private Subject subject;
  private String title;
  private Queue<Book> bestSellers;

  public Store(Subject subject) {
    this.subject = subject;
    this.bestSellers = new LinkedList<Book>(); 
  }

  public void update(Book book) {

  }

  public void display() {
    
  }
}
