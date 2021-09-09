package decorator;

public class Eyes extends CharacterDecorator {
  public Eyes(Character character) {
    super(character);
  }

  public void customize() {
    this.sections.set(3, " |  o  o  | ");
  }
}
