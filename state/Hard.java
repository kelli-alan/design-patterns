package state;
import java.util.Random;

/**
 * The final, most difficult, level of the ArithemeticGame
 * @author Kelli Alan
 */
public class Hard implements State {
  private ArithemeticGame game;
  
  /**
   * Creates an ArithemeticGame on the hardest level
   * @param game an instance of ArithemeticGame
   */
  public Hard(ArithemeticGame game) {
    this.game = game;
  }

  /**
   * Generates a random number from 1 to 100
   * @return [1,100]
   */
  public int getNum() {
    Random hardRandom = new Random();
    return hardRandom.nextInt(100) + 1;
  }

  /**
   * Randomly selects an operation (+,-, * or /)
   * @return plus, minus, multiplication, or division symbol
   */
  public String getOperation() {
    Random hardOperationRandom = new Random();
    int hardOp = hardOperationRandom.nextInt(4);
    
    if (hardOp == 0) {
      return "+";
    } else if (hardOp == 1) {
      return "-";
    } else if (hardOp == 2) {
      return "*";
    } else {
      return "/";
    }
  }

  /**
   * Encourages user with a nice message
   */
  public void levelUp() {
    System.out.println("You are doing so well!!!");
  }

  /**
   * Reduces the game's difficulty back to the previous (medium difficulty) level
   */
  public void levelDown() {
    game.setState(game.getMediumState());
    System.out.println("You are struggling, let's go to medium mode.");
  }
}
