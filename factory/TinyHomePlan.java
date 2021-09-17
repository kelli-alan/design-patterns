package factory;

/**
 * Creates the tiny home HousePlan
 * @author Kelli Alan
 */
public class TinyHomePlan extends HousePlan{
  
  /**
   * Creates a new tiny home with 1 room, 5 windows, and 200 square feet.
   */
  public TinyHomePlan() {
    super(1, 5, 200);
  }

  /**
   * Adds materials to the tiny home materials list
   */
  protected void setMaterials() {
    materials.add("Lumber");
    materials.add("Insulation");
    materials.add("Metal Roofing");
    materials.add("Hardware");
  }

  /**
   * Adds features to the tiny home features list
   */
  protected void setFeatures() {
    features.add("Natural Light");
    features.add("Creative Storage");
    features.add("Multipurpose areas");
    features.add("Multi-use applications");
  }

   /**
   * Creates a String representation of a tiny home
   * @return A string representation of a tiny home's specifications
   */
  public String toString() {
    return "Tiny House\n" + super.toString();
  }
}
