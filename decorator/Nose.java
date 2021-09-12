package decorator;

/**
 * Adds a nose to the potato head
 * @author Kelli Alan
 */
public class Nose extends CharacterDecorator {
  
  /**
   * Copies the current potato head structure into an ArrayList
   * @param character the potato head to add a nose to
   */
  public Nose(Character character) {
    super(character);
  }

  /**
   * Modifies index 4, adding a nose to the potato head
   */
  public void customize() {
    this.sections.set(4, " |   >    |");
  }
}
