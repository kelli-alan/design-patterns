package factory;

/**
 * Creates the log cabin HousePlan
 * @author Kelli Alan
 */
public class LogCabinPlan extends HousePlan{
  
  /**
   * Creates a new log cabin with 2 rooms, 10 windows and 1800 square feet
   */
  public LogCabinPlan() {
    super(2, 10, 1800);
  }

  /**
   * Adds materials to the log cabin materials list
   */
  protected void setMaterials() {
    materials.add("Log Siding");
    materials.add("Board and Batten Siding");
    materials.add("White Pine");
  }

  /**
   * Adds features to the log cabin features list
   */
  protected void setFeatures() {
    features.add("Timbered Roof");
    features.add("High Insulation");
    features.add("Rustic Effect");
  }

  /**
   * Creates a String representation of a log cabin
   * @return A string representation of a log cabin's specifications
   */
  public String toString() {
    return "Log Cabin\n" + super.toString();
  }
}
