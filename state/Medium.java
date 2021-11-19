package state;
import java.util.Random;

public class Medium implements State {
  private ArithemeticGame game;
  
  public Medium(ArithemeticGame game) {
    this.game = game;
  }

  public int getNum() {
    Random mediumRandom = new Random();
    return mediumRandom.nextInt(50) + 1;
  }

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

  public void levelUp() {
    game.setState(game.getHardState());
    System.out.println("You've been advanced to the hardest mode.");
  }

  public void levelDown() {
    game.setState(game.getEasyState());
    System.out.println("You are struggling, let's go to easy mode.");
  }
}
