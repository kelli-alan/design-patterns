package state;
import java.util.Scanner;

/**
 * A quiz game for practicing basic arithmetic
 * @author Kelli Alan
 */
public class ArithemeticGame {
  private State easyState;
  private State mediumState;
  private State hardState;
  private State state;
  private int score;
  private Scanner reader;

  /**
   * Sets up the three game levels: easy, medium, hard, and initializes the score counter
   */
  public ArithemeticGame() {
    this.easyState = new Easy(this);
    this.mediumState = new Medium(this);
    this.hardState = new Hard(this);
    this.state = this.easyState;
    this.score = 0;
    this.reader = new Scanner(System.in);
  }
  
  /**
   * *Prints a random, level appropriate math question to the console;
   * *Increments score if user answer correctly
   * *Decrements score if user answer incorrectly
   * *Advances user to next level if user scores 3 or higher on current level (other than hard)
   * *Returns user to previous level if user has a score of -3 on current level (other than easy)
   */
  public void pressQuestionButton() {
    int number1 = state.getNum();
    int number2 = state.getNum();
    String operation = state.getOperation();
    System.out.println(number1 + " " + operation + " " + number2 + ": ");
    int correctAnswer = 0;
    switch (operation) {
      case "+": {
        correctAnswer = number1 + number2;
        break;
      }
      case "-": {
        correctAnswer = number1 - number2;
        break;
      }
      case "*": {
        correctAnswer = number1 * number2;
        break;
      }
      case "/": {
        correctAnswer = number1 / number2;
        break;
      }
    }

    if (reader.nextInt() == correctAnswer) {
      System.out.println("Correct");
      this.score ++;
    } else {
      System.out.println("Incorrect");
      this.score --;
    }

    if (this.score >= 3) {
      state.levelUp();
      this.score = 0;
    } else if (this.score <= -3) {
      state.levelDown();
      this.score = 0;
    }
  }

  /**
   * Sets the game level
   * @param state game level: easy, medium, or hard
   */
  public void setState(State state) {
    this.state = state;
  }

  /**
   * Retrieves the easiest version of the game
   * @return first level of the game
   */
  public State getEasyState() {
    return this.easyState;
  }

  /**
   * Retrieves the medium difficulty version of the game
   * @return second level of the game
   */
  public State getMediumState() {
    return this.mediumState;
  }

  /**
   * Retrieves the hardest version of the game
   * @return third, and highest, level of the game
   */
  public State getHardState() {
    return this.hardState;
  }


}
