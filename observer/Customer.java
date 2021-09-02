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
  }
  
  public void update(Book book) {

  }
  
  public void display() {

  }
}
