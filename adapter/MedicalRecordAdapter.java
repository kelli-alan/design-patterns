package adapter;

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * @author Kelli Alan
 * Converts Health Records to Medical Records
 */
public class MedicalRecordAdapter implements MedicalRecord{
  private HealthRecord record;

  /**
   * Constructor for adapter
   * @param record to covert to a MedicalRecord
   */
  public MedicalRecordAdapter(HealthRecord record) {
    this.record = record;
  }

  /**
   * Retrieves the first name from the HealthRecord with string parsing
   * @return first name of patient
   */
  public String getFirstName() {
    String fullName = record.getName();
    return fullName.substring(0, fullName.indexOf(" "));
  }

  /**
   * Retrieves the last name from the HealthRecord with string parsing
   * @return last name of patient
   */
  public String getLastName() {
    String fullName = record.getName();
    return fullName.substring(fullName.indexOf(" "), fullName.length());
  }

  /**
   * Retrieves the birthday from the HealthRecord
   * @return birthday in HealthRecord format (E dd, MM, yyyy)
   */
  public Date getBirthday() {
    return this.record.getBirthdate();
  }

  /**
   * Converts the String representation of gender to one of the option in the Gender enum:
   * (MALE, FEMALE, OTHER)
   * @return gender of patient
   */
  public Gender getGender() {
    String gender = this.record.getGender();
    
    if (gender.equalsIgnoreCase("male")) {
      return Gender.MALE;
    } else if (gender.equalsIgnoreCase("female")) {
      return Gender.FEMALE;
    } else {
      return Gender.OTHER;
    }
  }

  /**
   * Adds a string representation of a visit to the HealthRecord's array of visits (history)
   * in the format for a MedicalRecord
   * @param date of appointment
   * @param well true if appointment was a well visit, false otherwise
   * @param description brief comment about the appointment
   */
  public void addVisit(Date date, boolean well, String description) {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
    String visit = simpleDateFormat.format(date) + ": " + (well ? "Well" : "Sick") + " Visit, " + description;
    this.record.getHistory().add(visit);
  }

  /**
   * Converts the HealthRecord's String array of history to the MedicalRecord's String array of 
   * Visits
   * @return ArrayList of all appointments as Visit objects
   */
  public ArrayList<Visit> getVisitHistory() {
    //history to parse through
    ArrayList<String> allHistory = this.record.getHistory();
    
    ArrayList<Visit> visits = new ArrayList<Visit>();
    
    for (String history : allHistory) {
      //medical record String type to convert to a visit
      if (history.startsWith("0") || history.startsWith("1")) {
        String[] fragments = history.split(" ");
        String[] dateFragments = fragments[0].split("/");
        int month = Integer.parseInt(dateFragments[0]);
        int day = Integer.parseInt(dateFragments[1]);
        int year = Integer.parseInt(dateFragments[2].substring(0,4));
        boolean well = false;
        
        if (fragments[1].equalsIgnoreCase("well")) {
          well = true;
        }
        
        //combines the remaining fragments into the comment
        String comment = " ";
        for (int i = 3; i < fragments.length; i++) {
          comment += fragments[i] + " ";
        }
        visits.add(new Visit(makeDate(year, month, day), well, comment));
      } else { // health record string type to convert to a visit
        String[] fragments = history.split("\n");
        String[] dateFragments = fragments[0].split(" ");
        int day = Integer.parseInt(dateFragments[2].substring(0,2)); 
        int month = Integer.parseInt(dateFragments[3].substring(0,2));
        int year = Integer.parseInt(dateFragments[4]);

        boolean well = false;
        if (fragments[1].split(":")[1].toLowerCase().contains("true")) {
          well = true;
        }
        visits.add(new Visit(makeDate(year, month, day), well, fragments[2].split(":")[1]));
      }
    }     
    return visits;
  }

  /**
   * Concatenates all fields for a patient's MedicalRecord into a String
   * @return String representation of a patient's MedicalRecord
   */
  public String toString() {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
    
    String result = "***** " + getFirstName() + " " + getLastName() + " *****\n";
    result += "Birthday: " + simpleDateFormat.format(getBirthday()) + "\n";
    result += "Gender: " + getGender() + "\n";
    result += "Medical Visit History: \n";

    if(getVisitHistory().size() == 0){
        result += "No visits yet";
    } else {
        for(Visit visit : getVisitHistory()){
            result += visit.toString() + "\n";
        }
    }
    return result;
  }

  /**
   * Helper method to create dates, needed when creating Visit objects
   * @param year of appointment
   * @param month of appointment
   * @param day of appointment
   * @return a Date object at given day, month, and year
   */
  private Date makeDate(int year, int month, int day) {
    Calendar myCalendar = new GregorianCalendar(year, month - 1, day);
    return myCalendar.getTime();
}
}
