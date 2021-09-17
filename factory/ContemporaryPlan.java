package factory;

/**
 * Creates the contemporary home HousePlan
 * @author Kelli Alan
 */
public class ContemporaryPlan extends HousePlan {
  /**
   * Creates a new contemporary home with 5 rooms, 40 windows, and 3000 square feet
   */
  public ContemporaryPlan() {
    super(5, 40, 3000);
  }

  /**
   * Adds materials to the contemporary home materials list
   */
  protected void setMaterials() {
    materials.add("Ceramics");
    materials.add("High-Strength Alloys");
    materials.add("Composites");
  }

  /**
   * Adds features to the contemporary home features list
   */
  protected void setFeatures() {
    features.add("Oversized Windows");
    features.add("Unconventional Roofs");
    features.add("Minimalism");
    features.add("Open Floor Plan");
  }

  /**
   * Creates a String representation of a contemporary home
   * @return A string representation of a contemporary home's specifications
   */
  public String toString() {
    return "Contemporary Home\n" + super.toString();
  }
}
