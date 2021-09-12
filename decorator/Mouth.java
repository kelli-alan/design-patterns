package decorator;

/**
 * Adds a mouth to the potato head
 * @author Kelli Alan
 */
public class Mouth extends CharacterDecorator {
  
  /**
   * Copies the current potato head structure into an ArrayList
   * @param character the potato head to add a mouth to
   */
  public Mouth(Character character) {
    super(character);
  }

  /**
   * Modifies index five to include four dashes, representing the potato head's mouth
   */
  public void customize() {
    this.sections.set(5, "  \\ ---- / ");
  }
}
