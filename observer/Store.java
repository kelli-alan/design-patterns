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
    subject.registerObserver(this);
  }

  public void update(Book book) {
    if(this.bestSellers.size() >= 5) {
      this.bestSellers.remove();
    }
    this.bestSellers.add(book);
  }

  public void display() {
    System.out.println("Top 5 Best Sellers:");
    while(bestSellers.peek() != null) {
      System.out.println(bestSellers.remove().toString());
    }
    System.out.println();
  }
}
