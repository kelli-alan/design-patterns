package decorator;

public abstract class CharacterDecorator extends Character {
  protected Character character;

  public CharacterDecorator(Character character) {
    this.character = character;
    for(int i = 0; i < character.sections.size(); ++i) {
      this.sections.add(i, character.sections.get(i));
    }
    customize();
  }

  public abstract void customize();
}