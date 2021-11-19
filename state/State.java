package state;

/**
 * The necessary actions for each level of the game
 * @author Kelli Alan
 */
public interface State {
  /**
   * Generates a random number; range depends on level difficulty
   * @return random integer
   */
  public int getNum();
  
  /**
   * Generates a random operation; possible operations depend on level difficulty
   * @return
   */
  public String getOperation();
  
  /**
   * Updates the game to the next difficulty level, if possible
   */
  public void levelUp();
  
  /**
   * Decreases the game difficulty level by one, if possible
   */
  public void levelDown();
}
