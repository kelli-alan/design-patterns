package singleton;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;


public class TriviaGame {
  private static TriviaGame triviaGame;
  private int score;
  private Random rand;
  private Scanner reader;
  private ArrayList<Question> questions;

  private TriviaGame() {
    score = 0;
    rand = new Random();
    reader = new Scanner(System.in);
    questions = DataLoader.getTriviaQuestions();
  }

  public static TriviaGame getInstance() {
    if (triviaGame == null) {
      triviaGame = new TriviaGame();
    }
    return triviaGame;
  }

  public void play() {
    
    while(true) {
      if(playRound()) {
        score++;
      }
      
      System.out.println("(P)lay or (Q)uit: ");
      String choice = reader.nextLine();
      if(choice.equalsIgnoreCase("Q")) {
        break;
      
      }
    }
    System.out.println("You won " + this.score + " games!\nGoodbye");
  }

  private boolean playRound() {
    int questionNum = rand.nextInt(questions.size());
    System.out.print(questions.get(questionNum).toString());

    System.out.println("Enter answer: ");
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
