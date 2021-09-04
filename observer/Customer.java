package observer;
import java.util.ArrayList;

public class Customer implements Observer {
  private Subject subject;
  private String firstName;
  private String lastName;
  private ArrayList<Book> wishList;
  
  public Customer(Subject subject, String firstName, String lastName) {
    this.subject = subject;
    this.firstName = firstName;
    this.lastName = lastName;
    this.wishList = new ArrayList<Book>();
    subject.registerObserver(this);
  }
  
  public void update(Book book) {
    this.wishList.add(book);
  }
  
  public void display() {
    System.out.println("Wish List:");
    for(int i = 0; i < this.wishList.size(); ++i) {
      System.out.println(this.wishList.get(i).toString());
    }
  }
}
