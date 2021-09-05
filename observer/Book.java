package observer;

/**
 * A novel and its author
 * @author Kelli Alan
 */
public class Book {
  private String title;
  private String authorFirstName;
  private String authorLastName;

  /**
   * Creates a new Book with the given title and author
   * @param title The name of the book
   * @param authorFirstName The author's first name
   * @param authorLastName The author's last name
   */
  public Book(String title, String authorFirstName, String authorLastName) {
    this.title = title;
    this.authorFirstName = authorFirstName;
    this.authorLastName = authorLastName;
  }

  /**
   * Retrieves the name of a Book
   * @return String corresponding to the Book title
   */
  public String getTitle() {
    return this.title;
  }

  /**
   * Retrieves the first name of the author associated with a Book
   * @return String corresponding to the Book author's first name
   */
  public String getAuthorFirstName() {
    return this.authorFirstName;
  }

  /**
   * Retrieves the last name of the author of a Book
   * @return String corresponding to the Book author's last name
   */
  public String getAuthorLastName() {
    return this.authorLastName;
  }

  /**
   * Concatenates all the properties of a Book into a single line
   * @return String with a Book title and its author, beginning with a dash mark bullet
   */
  public String toString() {
    return " - " + this.title + " by: " + this.authorFirstName + " " + this.authorLastName;
  }
  
}
