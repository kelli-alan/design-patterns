package decorator;

/**
 * Adds eyes to the potato
 * @author Kelli Alan
 */
public class Eyes extends CharacterDecorator {
  
  /**
   * Copies the current potato head structure into an ArrayList
   * @param character the potato head to add eyes to
   */
  public Eyes(Character character) {
    super(character);
  }

  /**
   * Modifies index 3 of the ArrayList, adding eyes to the potato head
   */
  public void customize() {
    this.sections.set(3, " |  o  o  | ");
  }
}
