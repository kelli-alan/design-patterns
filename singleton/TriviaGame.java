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

  }

  public static TriviaGame getInstance() {
    return null;
  }

  public void play() {

  }

  private boolean playRound() {
    return false;
  }
}
