import java.util.ArrayList;

/**
 * @author jawad , Enad , Bhaa , Abdualaziz , Eyad
 * 
 * Firstly here we create class Patient extends from Person and create many attrbuite specialy for Patient like , PatientID , theDayOfReservation.. 
 */
public class Patient extends Person {
    private int patientID;
    private String theDayOfReservation;
    private String theDateOfReservation;
    private Service service;
    
    
    /**
     * here we create constructor takes 6 parameters 
     * @param name to get name 
     * @param age to take age 
     * @param gender to take gender
     * @param phoneNum to take phone number
     * @param patientID to take the Id from patient 
     * @param theDayOfReservation to take The day user choose
     * @param theDateOfReservation to take the Date user choose
     */
    public Patient(int patientID, String theDayOfReservation, String theDateOfReservation, String name, int age, String gender, int phoneNum) {
     super(name, age, gender, phoneNum);
     this.patientID = patientID;
     this.theDayOfReservation = theDayOfReservation;
     this.theDateOfReservation = theDateOfReservation;
     
 }
     
    

/**
 * 
 * @return here we create getter method return Patient ID
 */
    public int getPatientID() {
         return this.patientID;
    }
/**
 * 
 * @return here we create getter method return The Day Of Reservation
 */
    public String getTheDayOfReservation(){
         return this.theDayOfReservation;
    }
    
/**
 * 
 * @return here we create getter method return The Date Of Reservation
 */
    public String getTheDateOfReservation(){
        return this.theDateOfReservation;
    }

    
/**
 * 
 * @param  patientID we create setter method takes patient ID as a parameter  
 */
    public void setPatientID(int patientID) {
         this.patientID = patientID;
   }

/**
 * 
 * @param  theDayOfReservation we create setter method takes The Day Of Reservation as a parameter  
 */

 public void setTheDayOfReservation(String theDayOfReservation){
         this.theDayOfReservation = theDayOfReservation; 
   }
  
   
/**
 * 
 * @param  theDateOfReservation we create setter method takes theDateOfReservation as a parameter  
 */

   public void setTheDateOfReservation(String theDateOfReservation){
        this.theDateOfReservation = theDateOfReservation;
   }
 /**
 * 
 * @param  s we create method takes s as a parameter  
 */
   public void setService(Service s)

   {
     this.service=s;
   }
   
/**
 * 
 * @return  here we create toString method return all class informition
 */
     public String toString(){
          return super.toString() + "\nThe patient id: " + patientID + "\nThe Day Of Reservation: " + theDayOfReservation + "\nThe Date of Reservation: " + theDateOfReservation;
     }

}