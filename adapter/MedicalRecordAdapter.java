package adapter;

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * @author Kelli Alan
 */
public class MedicalRecordAdapter implements MedicalRecord{
  private HealthRecord record;

  public MedicalRecordAdapter(HealthRecord record) {
    this.record = record;
  }

  public String getFirstName() {
    String fullName = record.getName();
    return fullName.substring(0, fullName.indexOf(" "));
  }

  public String getLastName() {
    String fullName = record.getName();
    return fullName.substring(fullName.indexOf(" "), fullName.length());
  }

  public Date getBirthday() {
    return this.record.getBirthdate();
  }

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

  public void addVisit(Date date, boolean well, String description) {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
    String visit = simpleDateFormat.format(date) + ": " + (well ? "Well" : "Sick") + " Visit, " + description;
    this.record.getHistory().add(visit);
  }

  public ArrayList<Visit> getVisitHistory() {
    ArrayList<String> allHistory = this.record.getHistory();
    ArrayList<Visit> visits = new ArrayList<Visit>();
    
    for (String history : allHistory) {
      //medical record type to convert to a visit
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
        
        String comment = " ";
        for (int i = 3; i < fragments.length; i++) {
          comment += fragments[i] + " ";
        }
        
        visits.add(new Visit(makeDate(year, month, day), well, comment));
      } else { // health record type to convert to a visit
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

  private Date makeDate(int year, int month, int day) {
    Calendar myCalendar = new GregorianCalendar(year, month - 1, day);
    return myCalendar.getTime();
}
}
