package state;
import java.util.Scanner;

public class ArithemeticGame {
  private State easyState;
  private State mediumState;
  private State hardState;
  private State state;
  private int score;
  private Scanner reader;

  public ArithemeticGame() {
    this.easyState = new Easy(this);
    this.mediumState = new Medium(this);
    this.hardState = new Hard(this);
    this.state = this.easyState;
    this.score = 0;
    this.reader = new Scanner(System.in);
  }
  
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

  public void setState(State state) {
    this.state = state;
  }

  public State getEasyState() {
    return this.easyState;
  }

  public State getMediumState() {
    return this.mediumState;
  }

  public State getHardState() {
    return this.hardState;
  }


}
