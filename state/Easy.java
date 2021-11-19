package state;
import java.util.Random;

public class Easy implements State {
  private ArithemeticGame game;
  
  public Easy(ArithemeticGame game) {
    this.game = game;
    
  }

  public int getNum() {
    Random easyRandom = new Random();
    return easyRandom.nextInt(10) + 1;
  }

  public String getOperation() {
    Random easyOperationRandom = new Random();
    int easyOp = easyOperationRandom.nextInt(2);
    
    if (easyOp == 0) {
      return "+";
    }
    return "-";
  }

  public void levelUp() {
    game.setState(game.getMediumState());
    System.out.println("You've been advanced to medium mode.");
  }

  public void levelDown() {
    System.out.println("You seem to be struggling, you may want to study.");
  }
}
