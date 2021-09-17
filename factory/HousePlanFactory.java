package factory;

/**
 * Creates a house
 * @author Kelli Alan
 */
public class HousePlanFactory {
  
  /**
   * Determines the correct floor plan, then creates it. 
   * If specified floor plan does not exist, a log cabin is created.
   * @param type house floor plan to create 
   * @return Houseplan of the specified floor plan
   */
  
  public static HousePlan createHousePlan(String type) {
    if (type.equalsIgnoreCase("Log Cabin")) {
      return new LogCabinPlan();
    } else if (type.equalsIgnoreCase("Tiny Home")) {
      return new TinyHomePlan();
    } else if (type.equalsIgnoreCase("Contemporary Home")) {
      return new ContemporaryPlan();
    } else {
      return new LogCabinPlan();
    }
  }
}
