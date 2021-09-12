package decorator;

/**
 * Adds a hat to the potato
 * @author Kelli Alan
 */
public class Hat extends CharacterDecorator {
  /**
   * Copies the current potato head structure into an ArrayList
   * @param character the potato head to add a hat to
   */
  public Hat(Character character) {
    super(character);
  }

  /**
   * Modifies index 0 of the ArrayList to represent the top of a hat
   * Modifies index 1 of the ArrayList to represent the brim of the hat
   */
  public void customize() {
   this.sections.set(0, "    ____");
   this.sections.set(1,  " __|____|____");
  }
}
