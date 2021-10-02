package singleton;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;


/**
 * A quiz game that asks random questions, reads user input, keeps score, and provides feedback
 * @author Kelli Alan
 */
public class TriviaGame {
  private static TriviaGame triviaGame;
  private int score;
  private Random rand;
  private Scanner reader;
  private ArrayList<Question> questions;

  /**
   * Creates the only instance of a TriviaGame; initializes score to 0; 
   * loads questions for the game from a file
   */
  private TriviaGame() {
    score = 0;
    rand = new Random();
    reader = new Scanner(System.in);
    questions = DataLoader.getTriviaQuestions();
  }

  /**
   * Ensures only one TriviaGame object exists
   * @return current instance of TriviaGame object if it has been constructed; 
   *         new TriviaGame object if it has not been constructed
   */
  public static TriviaGame getInstance() {
    if (triviaGame == null) {
      triviaGame = new TriviaGame();
    }
    return triviaGame;
  }

  /**
   * Keeps track of how many questions the user answers correctly 
   * and prompts user to quit or play again. Questions continue to print to the console until 
   * the user chooses to quit. Once the user chooses to quit, their score prints with a goodbye 
   * message.
   */
  public void play() {
    
    while(true) {
      if(playRound()) {
        score++;
      }
      
      System.out.print("(P)lay or (Q)uit: ");
      String choice = reader.nextLine();
      if(choice.equalsIgnoreCase("Q")) {
        break;
      }
    }
    System.out.println("You won " + this.score + " games!\nGoodbye");
  }

  /**
   * Randomly selects a question from available questions. Prints the question to the console.
   * Prompts the user for an answer. Determines if the user's input is valid and if their answer
   * is correct. Prints correct answer if user is incorrect.
   * @return true if user answers correctly, false if user answers incorrectly or provides an 
   *         invalid value
   */
  private boolean playRound() {
    int questionNum = rand.nextInt(questions.size());
    System.out.print(questions.get(questionNum).toString());

    System.out.print("Enter answer: ");
    int userAnswer = reader.nextInt();
    reader.nextLine();

    if (userAnswer < 1 || userAnswer > 4) {
      System.out.println("Invalid answer choice");
    }else if (questions.get(questionNum).isCorrect(userAnswer)) {
      System.out.println("YAY! You got it right!");
      return true;
    }

    System.out.println("You got it wrong!\n" + questions.get(questionNum).getCorrectAnswer());
    return false;
  }
}
