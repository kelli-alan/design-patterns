package state;
import java.util.Random;

/**
 * The first level of the ArithemeticGame
 * @author Kelli Alan
 */
public class Easy implements State {
  private ArithemeticGame game;
  
  /**
   * Creates an ArithmeticGame on the easiest level
   * @param game an instance of ArithemeticGame
   */
  public Easy(ArithemeticGame game) {
    this.game = game;
    
  }
  
  /**
   * Generates a random number from 1 to 10
   * @return [1,10]
   */
  public int getNum() {
    Random easyRandom = new Random();
    return easyRandom.nextInt(10) + 1;
  }

  /**
   * Randomly selects an operation (+ or -)
   * @return plus or minus symbol
   */
  public String getOperation() {
    Random easyOperationRandom = new Random();
    int easyOp = easyOperationRandom.nextInt(2);
    
    if (easyOp == 0) {
      return "+";
    }
    return "-";
  }

  /**
   * Updates the game to the second (medium) level
   */
  public void levelUp() {
    game.setState(game.getMediumState());
    System.out.println("You've been advanced to medium mode.");
  }

  /**
   * Encourages the user to study
   */
  public void levelDown() {
    System.out.println("You seem to be struggling, you may want to study.");
  }
}
