package observer;

/**
 * Implements a class to watch changes in a subject's data
 * @author Kelli Alan
 */
public interface Observer {
  
  /**
   * Alerts observers of a change in the subject's data
   * @param book the novel and author information that has changed in the subject 
   */
  public void update(Book book);
  
  /**
   * Prints desired information to the console
   */
  public void display();
}
