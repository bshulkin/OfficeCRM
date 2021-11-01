import java.util.ArrayList;

import java.util.*;
public class App {

    public static void main(String[] args) throws Exception {
       
        ArrayList<Doctor> myDoc = new ArrayList<>();

        Doctor Bryan = new Doctor("Bryan", "Shulkin", "Neurosurgeon");
        myDoc.add(Bryan);

        Doctor Ben = new Doctor("Ben", "Perkins", "General Practioner");
        myDoc.add(Ben);

        Doctor Daniel = new Doctor("Daniel", "Dolensky", "Physical Therapist");
        myDoc.add(Daniel);

        ArrayList<Assistant> myAssistant = new ArrayList<>();

        Assistant Bob = new Assistant("Bob", "Barker", "Shulkin");
        Assistant Bert = new Assistant("Bert", "Kreischer", "Dolensky");
        Assistant Tom = new Assistant("Tom", "Segura", "Perkins");
        myAssistant.add(Bob);
        myAssistant.add(Bert);
        myAssistant.add(Tom);

        ArrayList<Patient> myPatient = new ArrayList<>();
        Patient Todd = new Patient("Todd", "Petersen", "Shulkin");
        Patient Tony = new Patient("Tony", "Stark", "Dolensky");
        Patient Teo = new Patient("Teo", "Toes", "Perkins");
        myPatient.add(Todd);
        myPatient.add(Tony);
        myPatient.add(Teo);

        ArrayList<Services> myServices = new ArrayList<>();
        Services surgery = new Services(001, "Surgery", 1000);
        Services physical = new Services(002, "Physical", 200);
        Services brain_scan = new Services(003, "Brain Scan", 5000);
        Services checkup = new Services(004, "Check up", 1000);
        Services flu_shot = new Services(005, "Flu Shot", 50);
        myServices.add(surgery);
        myServices.add(physical);
        myServices.add(brain_scan);
        myServices.add(checkup);
        myServices.add(flu_shot);

        Scanner input = new Scanner( System.in );
  	  	
  	  	// welcome message
  	  	System.out.println( "Welcome to the Office Management System\n");
  	  	
  	  	// running boolean creates loop until app is quit
  	  	boolean running = true;
  	  	do {
	        // print menu of user options
	        System.out.println( "Enter a number to view records:\n[1] Services\n[2] Doctors\n[3] Assistants\n[4] Patients\n[0] Quit");
	        String selection = input.nextLine(); // read user input
	        
	        // check if true
	        if( "1".equals( selection ))
	        {
	            // print list of services
	            System.out.println("**************** Our Services ****************");
	            System.out.println("ID" + "\t\t" + "Service Name" + "\t\t" + "Price");
	            myServices.forEach(System.out::println);
	            System.out.println("**********************************************");

                System.out.println( "Would you like to make a change to the services? (1 for yes, 2 for no)");
	            String addSelection = input.nextLine(); // read user input

                if("1".equals(addSelection)){
                    System.out.println("Which service would you like to change?");
                    myServices.forEach(System.out::println);
                }
	        }
	        else if( "2".equals( selection ))
	        {
	            // print list of doctors
	            System.out.println("**************** Doctors ****************");
	            System.out.println("First Name" + "\t\t" + "Last Name" + "\t\t" + "Specialty");
	            myDoc.forEach(System.out::println);
	            System.out.println("**********************************************");
	        }
	
	        else if( "3".equals( selection ))
	        {
	            // print list of assistants
	            System.out.println("**************** Assistants ****************");
	            System.out.println("First Name" + "\t\t" + "Last Name" + "\t\t" + "Doctor");
	            myAssistant.forEach(System.out::println);
	            System.out.println("**********************************************");
	        }
	        else if( "4".equals( selection ))
	        {
	            // print list of patients
	            System.out.println("**************** Patients ****************");
	            System.out.println("First Name" + "\t\t" + "Last Name" + "\t\t" + "Doctor");
	            myPatient.forEach(System.out::println);
	            System.out.println("**********************************************");
	        }
	        else if( "0".equals( selection ))
	        {
	            // end program
	            System.out.println("Thank you. Have a nice day.");
	            running = false;
	        }
	        else {
	        	System.out.println("Your response was invalid.\nPlease enter a number between 0 and 4.");
	        }
	        
  	  	} while(running);
    }
    
}
