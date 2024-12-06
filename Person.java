/**
 * @author jawad , Enad , Bhaa , Abdualaziz , Eyad
 * 
 * Firstly here we create class person and create many attrbuite specialy for person like , name , age.. 
 */
public class Person {
    private String name;
    private int age;
    private String gender;
    private int phoneNum;
    

    /**
     * here we create constructor takes 4 parameters 
     * @param name to get name 
     * @param age to take age 
     * @param gender to take gender
     * @param phoneNum to take phone number
     */
    public Person(String name, int age, String gender, int phoneNum) {
       this.name = name;
       this.age = age;
       this.gender = gender;
       this.phoneNum = phoneNum;
       
    }
/**
 * 
 * @return here we create getter method return name
 */
    public String getName() {
       
        return this.name;
    }
/**
 * 
 * @return here we create getter method return age
 */
    public int getAge() {
        return this.age;    
    }

 /**
 * 
 * @return here we create getter method return gender
 */
    public String getGender() {
         return this.gender;
    }

/**
 * 
 * @return here we create getter method return phone number
 */
    public int getPhoneNum() {
         return this.phoneNum;
    }
/**
 * 
 * @param  name we create setter method takes name as a parameter  
 */
    
    public void setName(String name) {
       this.name = name;
    }
/**
 * 
 * @param  age we create setter method takes age as a parameter  
 */
    public void setAge(int age) {
        this.age = age;
    }
/**
 * 
 * @param  gender we create setter method takes gender as a parameter  
 */
    public void setGender(String gender) {
        this.gender = gender;
    }
/**
 * 
 * @param  phoneNum we create setter method takes name as a parameter  
 */
    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }
/**
 * 
 * @return  here we create toString method return all class informition
 */
    public String toString(){
        return "the name: "+name+ "\nThe age: " + age + "\nThe Gender is: " + gender + "\nThe Phone Number: " + phoneNum;
    }

    }