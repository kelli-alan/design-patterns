package state;
import java.util.Random;

/**
 * The second level of the ArithemeticGame
 * @author Kelli Alan
 */
public class Medium implements State {
  private ArithemeticGame game;
  
  /**
   * Creates an ArithmeticGame on the medium difficulty level
   * @param game an instance of ArithemeticGame
   */
  public Medium(ArithemeticGame game) {
    this.game = game;
  }

  /**
   * Generates a random number from 1 to 50
   * @return [1,50]
   */
  public int getNum() {
    Random mediumRandom = new Random();
    return mediumRandom.nextInt(50) + 1;
  }

  /**
   * Randomly selects an operation (+,-, or *)
   * @return plus, minus, or multiplication symbol
   */
  public String getOperation() {
    Random mediumOperationRandom = new Random();
    int mediumOp = mediumOperationRandom.nextInt(3);
    
    if (mediumOp == 0) {
      return "+";
    } else if (mediumOp == 1) {
      return "-";
    } else {
      return "*";
    }
    
  }

  /**
   * Updates the game to the hardest level
   */
  public void levelUp() {
    game.setState(game.getHardState());
    System.out.println("You've been advanced to the hardest mode.");
  }

  /**
   * Reduces the game's difficulty back to the easiest level
   */
  public void levelDown() {
    game.setState(game.getEasyState());
    System.out.println("You are struggling, let's go to easy mode.");
  }
}
