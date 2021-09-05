package observer;

/**
 * Implements a class that can notify observers about books
 * @author Kelli Alan
 */
public interface Subject {
  
  /**
   * Adds a class to the watch list of a Subject
   * @param observer an instance of a class that has implemented the Observer interface
   */
  public void registerObserver(Observer observer);
  
  /**
   * Removes a class from the watch list of a Subject
   * @param observer an instance of a class that has implemented the Observer interface
   */
  public void removeObserver(Observer observer);

  /**
   * Provides observers with changes to the Subject's data
   * @param book a novel and author
   */
  public void notifyObservers(Book book);
}