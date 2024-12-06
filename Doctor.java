import java.util.ArrayList;

/**
 * @author jawad , Enad , Bhaa , Abdualaziz , Eyad
 * 
 * Firstly here we create class Doctor and create many attrbuite specialy for Doctor like , speclizition , yearsOfProficiency.. 
 */
public class Doctor extends Person {
    private String specliazition;
    private int yearsOfProficiency;
    private ArrayList<Patient>patientList=new ArrayList<Patient>();
    

    /**
     * here we create constructor takes 6 parameters 
     * @param name to get name 
     * @param age to take age 
     * @param gender to take gender
     * @param phoneNum to take phone number
     * @param specliazition to take what is the Doctor special in 
     * @param yearsOfProficiency to take how much years doctor have in the field
     */
    public Doctor(String name, int age, String gender, int phoneNum,String specliazition, int yearsOfProficiency) {

        super(name, age,  gender, phoneNum);
        this.specliazition = specliazition;
        this.yearsOfProficiency = yearsOfProficiency;
    }

/**
 * 
 * @return here we create getter method return specliazition
 */
    public String getSpecliazition() {
       
        return this.specliazition;
    }

/**
 * 
 * @return here we create getter method return yearsOfProficiency
 */
    public int getYearsOfProficiency() {
        return this.yearsOfProficiency; 
    }

    
/**
 * 
 * @param  specliazition we create setter method takes specliazition as a parameter  
 */
    public void setSpecliazition(String specliazition) {
        this.specliazition = specliazition;
    }
/**
 * 
 * @param  yearsOfProficiency we create setter method takes name as a parameter  
 */
    public void setYearsOfProficiency(int yearsOfProficiency) {
        this.yearsOfProficiency = yearsOfProficiency;
    }
/**
 * 
 * @param  p we create method takes p as a object and put the object in patientLst  
 */
    public void addPatient(Patient p){
    
        this.patientList.add( p);
    }
/**
 * 
 * @return  here we create toString method return all class informition
 */
    public String toString(){
        return super.toString() + "\nThe specliazition: " + specliazition + "\nThe yearsOfProficiency: " + yearsOfProficiency;
    }
}
