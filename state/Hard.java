package state;
import java.util.Random;

public class Hard implements State {
  private ArithemeticGame game;
  
  public Hard(ArithemeticGame game) {
    this.game = game;
  }

  public int getNum() {
    Random hardRandom = new Random();
    return hardRandom.nextInt(100) + 1;
  }

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

  public void levelUp() {
    System.out.println("You are doing so well!!!");
  }

  public void levelDown() {
    game.setState(game.getMediumState());
    System.out.println("You are struggling, let's go to medium mode.");
  }
}
