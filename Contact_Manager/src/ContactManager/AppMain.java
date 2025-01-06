package ContactManager;

import java.util.Scanner;

import ContactManagerLogic.Logic_Implimentation;
import ContactManagerLogic.Logics;

public class AppMain {
	
	
	public static void main(String[] args) {
		
	 	Logics logic = new Logic_Implimentation(); 
		Scanner input= new  Scanner(System.in);
		
		boolean run=true;
		
		while(run) {
			System.out.println();
			System.out.println(" ---------- Enter Your Choice ----------- ");
			System.out.println();
			System.out.println("Enter 1 to add new contact");
			System.out.println("Enter 2 to delete contact");
			System.out.println("Enter 3 to update contact");
			System.out.println("Enter 4 to find contact by First name");
			System.out.println("Enter 5 to find contact by Last name");
			System.out.println("Enter 6 to find all contacts");
			System.out.println("Enter 7 to search contact");
			System.out.println("Enter 8 to exit");
			System.out.println();
			
			int choice =input.nextInt();
			
			switch(choice) {
			
			case 1:logic.addContact();
			      break;
			case 2:logic.deleteContact();
		          break;
			case 3:logic.updateContact();
		          break;
			case 4:logic.findContactByFname();
		          break;
			case 5:logic.findContactByLname();
		          break;
			case 6:logic.findAllContacts();
				break;
			case 7:logic.search();
				break;
			case 8:System.out.println("See you soon");
				run = false;
				break;
			default: System.out.println("Invalid choice");   
		       
			
			}
		}
		
	}

}
