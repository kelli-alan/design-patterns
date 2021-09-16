package factory;

public class HousePlanFactory {
  public static HousePlan createHousePlan(String type) {
    if (type.equalsIgnoreCase("Log Cabin")) {
      return new LogCabinPlan();
    } else if (type.equalsIgnoreCase("Tiny Home")) {
      return new TinyHomePlan();
    } else if (type.equalsIgnoreCase("Contemporary Home")) {
      return new ContemporaryPlan();
    } else {
      return null;
    }
  }
}
