package decorator;

/**
 * Creates the base of the potato head
 * @author Kelli Alan
 */
public class PotatoeHead extends Character {
  
  /**
   * Adds Strings to an ArrayList that create a potato head, when printed to the console in order
   */
  public PotatoeHead() {
    sections.add("");
    sections.add("    _____");
    sections.add("  /      \\");
    sections.add(" |        |");
    sections.add(" |        |");
    sections.add("  \\      /");
    sections.add("   \\____/");
  }
}
