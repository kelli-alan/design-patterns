package factory;

public class ContemporaryPlan extends HousePlan {
  public ContemporaryPlan() {
    super(5, 40, 3000);
  }

  protected void setMaterials() {
    materials.add("Ceramics");
    materials.add("High-Strength Alloys");
    materials.add("Composites");
  }

  protected void setFeatures() {
    features.add("Oversized Windows");
    features.add("Unconventional Roofs");
    features.add("Minimalism");
    features.add("Open Floor Plan");
  }

  public String toString() {
    return "Contemporary Home\n" + super.toString();
  }
}
