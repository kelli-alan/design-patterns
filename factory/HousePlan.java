package factory;
import java.util.ArrayList;

/**
 * Store characteristics of a floor plan
 * @author Kelli Alan
 */
public abstract class HousePlan {
  protected ArrayList<String> materials;
  protected ArrayList<String> features;
  private int numRooms;
  private int numWindows;
  private int squareFeet;

  /**
   * Create a new house plan with specified characteristics
   * @param numRooms the number of rooms in the house plan
   * @param numWindows the number of windows in the house plan
   * @param squareFeet the number of square feet for the house plan
   */
  public HousePlan(int numRooms, int numWindows, int squareFeet) {
    this.materials = new ArrayList<String>();
    this.features = new ArrayList<String>();
    this.numRooms = numRooms;
    this.numWindows = numWindows;
    this.squareFeet = squareFeet;
    setMaterials();
    setFeatures();
  }

  /**
   * Adds the materials needed to create a certain HousePlan
   */
  protected abstract void setMaterials();

  /**
   * Adds the features of a certain HousePlan
   */
  protected abstract void setFeatures();

  /**
   * Retrieves the material list of a HousePlan
   * @return the list of materials reeded for a certain HousePlan
   */
  public ArrayList<String> getMaterials(){
    return this.materials;
  }

  /**
   * Retrieves the feature list of a HousePlan
   * @return the list of features associated with a certain HousePlan
   */
  public ArrayList<String> getFeatures() {
    return this.features;
  }

  /**
   * Retrieves number of rooms in a HousePlan
   * @return the number of rooms associated with a HousePlan
   */
  public int getNumRooms() {
    return this.numRooms;
  }

  /**
   * Retrieves number of windows in a HousePlan
   * @return the number of windows associated with a HousePlan
   */
  public int getNumWindows() {
    return this.numWindows;
  }

  /**
   * Retrieves the number of square feet for a HousePlan
   * @return the number of square feet required to build a certain HousePlan
   */
  public int getSquareFeet() {
    return this.squareFeet;
  }

  /**
   * Creates a String representation of a HousePlan
   * @return String representation of all house details including: 
   * square feet, rooms, windows, materials, and features.
   */
  public String toString() {
    String houseDetails = "Square Feet: " + this.squareFeet + "\nRoom: " + this.numRooms + 
              "\nWindows: " + this.numWindows + "\n\nMaterials:\n";
    for (String material : materials) {
      houseDetails += " - " + material + "\n";
    }

    houseDetails += "\nFeatures:\n";

    for(String feature : features) {
      houseDetails += " - " + feature + "\n";
    }

    return houseDetails;
  }
}
