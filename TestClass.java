
import java.util.Scanner;
import java.lang.String;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class TestClass {

    public static void main(String[] args) {
        Doctor mohammed=new Doctor("Dr.Mohammed Al Qarni", 39, "male", 579432581,"eyes", 10);
        Doctor sultan=new Doctor("Dr.Sultan Al Otibi", 43, "male", 588888772,"Pediatrician", 28);
        Doctor majed=new Doctor("Dr.Majed Al Shareef", 55, "male", 578555572,"Dentist", 30);
        Doctor sarah=new Doctor("Dr.Sarah Al harbi", 29, "Female", 599101349, "Orthopedic", 3);
        Doctor afrah=new Doctor("Dr.Afrah Al Johani", 27, "Female", 595101333, "Cosmetic", 1);
        ArrayList<Doctor>dlist=new ArrayList<Doctor>();
        dlist.add(mohammed);
        dlist.add(sultan);
        dlist.add(majed);
        dlist.add(sarah);
        dlist.add(afrah);
        // myfile.createNewFile() لصنع ملف جديد 

        // //FileWriter myWriter = new FileWriter("filepath")  للكتابة على الملف
        //   myWriter.write("Write here");
        // myWriter.close();
        Scanner key = new Scanner(System.in);

        String fileName = "Clinic.txt";
        PrintWriter outputStream = null;

        try {
            outputStream = new PrintWriter(fileName);
            outputStream.println("The Doctors informition : \n");
            
            for (int i = 0; i < dlist.size(); i++) {
                outputStream.println(dlist.get(i).getName()+" specialize "+dlist.get(i).getSpecliazition());
            }    
            outputStream.close();
        } catch (Exception e) {
            System.out.println("Error opening the file " + fileName);
            System.exit(0);
        }

        ArrayList<Patient> patientList = new ArrayList<Patient>();
        char cont = 'y';
        while (cont == 'y') {
            System.out.println("1- Add a patient");
            System.out.println("2- Print all patients information");
            System.out.println("3- print all doctors information ");
            System.out.println("4- Exit the program");
            int s = key.nextInt();
            if (s == 1) {

                System.out.println("Enter name:");
                String n = key.next();
                outputStream.println((n + " -"));

                System.out.println("Enter age:");
                int a = key.nextInt();
                outputStream.println((a + " -"));

                System.out.println("Enter gender:");
                String yourGender = key.next();
                outputStream.println((yourGender + " -"));

                System.out.println("Enter Your Phone number:");
                int phNum = key.nextInt();
                outputStream.println((phNum + " -"));

                System.out.println("Enter Your patient ID:");
                int patientNum = key.nextInt();
                outputStream.println((patientNum + " -"));

                System.out.println("Enter The Day of reservetion:");
                String dayReservetion = key.next();
                outputStream.println((dayReservetion + " -"));

                System.out.println("Enter The Date of reservetion:");
                String dateReservation = key.next();
                outputStream.println((dateReservation + " -"));

                System.out.println("There are two types of services");
                System.out.println("press 1 for VIP");
                System.out.println("press 2 for economy");
                int select = key.nextInt();
                if (select == 1) {
                    ServiceTypeVip s1 = new ServiceTypeVip();
                    s1.servicetype();
                    System.out.println("the doctors info");
                    for (int i = 0; i < dlist.size(); i++) {
                        System.out.println("doctor number "+(i+1)+" "+dlist.get(i).getName()+" specialize "+dlist.get(i).getSpecliazition());
                    }
                } else {
                    ServiceTypeEconomy s1 = new ServiceTypeEconomy();
                    s1.servicetype();
                    System.out.println("the doctors info");
                    for (int i = 0; i < dlist.size(); i++) {
                        if(dlist.get(i).getSpecliazition().equals("Dentist")|| dlist.get(i).getSpecliazition().equals("Pediatrician"))
                        System.out.println("doctor number "+(i+1)+" "+dlist.get(i).getName()+" specialize "+dlist.get(i).getSpecliazition());
                    }
                }

                Patient patient1 = new Patient(patientNum, dayReservetion, dateReservation, n, a, yourGender, phNum);

                patientList.add(patient1);
                
                
                    System.out.println("Choose The number of doctor you want ");
                    int nd=key.nextInt();
                    dlist.get(nd-1).addPatient(patient1);

                System.out.println("press any key to go to meneu or 0 to exit ");
                char t = key.next().charAt(0);
            } else if (s == 2) {
                for (int i = 0; i < patientList.size(); i++) {
                    System.out.println(patientList.get(i) + "\n");
                }
            }
            else if(s==3)
            {
                for (int i = 0; i < dlist.size(); i++) {
                    System.out.println(dlist.get(i).toString() + "\n");
                }
 
            }
            else if (s == 4) {
                cont = 'n';
            } else {
                System.out.println("try again ....");
            }
        }
    }
}