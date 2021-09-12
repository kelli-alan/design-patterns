package decorator;

/**
 * Customizes a character
 * @author Kelli Alan
 */
public abstract class CharacterDecorator extends Character {
  protected Character character;

  /**
   * Copies the Strings that currently make up a character and modifies it based 
   * on some chosen feature
   * @param character an instance of a class that extends Character, to decorate
   */
  public CharacterDecorator(Character character) {
    this.character = character;
    for(int i = 0; i < character.sections.size(); ++i) {
      this.sections.add(i, character.sections.get(i));
    }
    customize();
  }

  /**
   * Implemented by each item used as decor on a character
   */
  public abstract void customize();
}