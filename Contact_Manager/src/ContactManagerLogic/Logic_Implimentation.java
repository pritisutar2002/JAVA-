package ContactManagerLogic;

import java.util.Scanner;

import ContactManagerEntity.Contacts;
import ContactManagerData.Data;
import ContactManagerData.Data_Implementation;

public class Logic_Implimentation implements Logics {

	private Scanner userInput = new Scanner(System.in);
	
	private Data data =  new Data_Implementation();
	
	private int id;
	private int id() {
		return ++id;
	}

	
	@Override
	public void addContact() {
		
		System.out.println(" ---------- Enter Your Choice ----------- ");
		System.out.println();
		System.out.println("Enter first name");
		String firstName = userInput.next();
		System.out.println("Enter last name");
		String lastName = userInput.next();
		System.out.println("Enter mobile number");
		long mobile = userInput.nextLong();
		System.out.println("Enter work number");
		long work = userInput.nextLong();
		System.out.println("Enter email");
		String email = userInput.next();

		Contacts contact = new Contacts(id(), firstName, lastName, mobile, work, email);

		data.addContact(contact);

		Contacts[] contacts = data.findAllContacts();

		for (int i = 0; i < contacts.length; i++) {
			System.out.println(contacts[i]);
		}
		
	}
	@Override
	public void deleteContact() {
		System.out.println("Enter contact id");
		int id = userInput.nextInt();
		data.deleteContact(id);
		
		Contacts[] contacts = data.findAllContacts();

		for (int i = 0; i < contacts.length; i++) {
			System.out.println(contacts[i]);
		}
		
	}

	@Override
	public void updateContact() {
		
//      boolean run=true;
//		
//		while(run) {
			
			System.out.println("Enter your Id");
			int id=userInput.nextInt();
			Contacts contact = data.updateContactById(id);
			
			System.out.println();
			System.out.println("Enter 1 to update Frist name");
			System.out.println("Enter 2 to upadte last name");
			System.out.println("Enter 3 to update Mobile no");
			System.out.println("Enter 4 to update work no");
			System.out.println("Enter 5 to upadte email");
			System.out.println("Enter 6 to exit from application");
			System.out.println();
			
			int choice =userInput.nextInt();
			
			switch(choice) {
			
			case 1:if(contact!= null) {
				   String firstName = userInput.next();
			       contact.setFname(firstName);
			       System.out.println();
		    	   System.out.println("--- Frist name  Is Upadeted Successfully! ---");
			       break;
			       }else {
	        	  System.out.println(" contact is not found");
	             }
			case 2:if(contact!= null) {
				   String lastName = userInput.next();
			       contact.setLname(lastName);
			       System.out.println();
		    	   System.out.println("--- Last Nmae Is Upadeted Successfully! ---");
		    	   
		          break;
			      }else {
	        	 System.out.println(" contact is not found");
	             }
			case 3:if(contact!= null) {
				   long mobile = userInput.nextLong();
			      contact.setPhone(mobile);
			      System.out.println();
		    	  System.out.println("--- Contact Is Upadeted Successfully! ---");
		          break;
			      }else {
	        	 System.out.println(" contact is not found");
	             }
			case 4:if(contact!= null) {
				  long work = userInput.nextLong();
			      contact.setWork(work);
			      System.out.println();
		    	  System.out.println("--- Contact Is Upadeted Successfully! ---");
    		      break;
			     }else {
	        	 System.out.println(" contact is not found");
	             }
			case 5:if(contact!= null) {
				String email = userInput.next();
			      contact.setEmail(email);
			      System.out.println();
		    	  System.out.println("--- Contact Is Upadeted Successfully! ---");
		          break;
			     }else {
	        	 System.out.println(" contact is not found");
	             }
			case 6:System.out.println("you are exited ");
//				  run = false;
				  break;
			default:
				 System.out.println("Invalid choice");   
		       
			
			}
			
//		}
		
		
		
		
		
	}

	@Override
	public void findContactByFname() {
		// TODO Auto-generated method stub
		System.out.println("Enter first name");
		String firstName = userInput.next();
		Contacts[] contacts = data.findAllContacts();
		if (contacts.length > 0) {
			boolean flag = false;
			for (int i = 0; i < contacts.length; i++) {
				if (contacts[i].getFname().equals(firstName)) {
					flag = true;
					System.out.println(contacts[i]);
				}
			}
			if (!flag)
				System.out.println("No Contact found");
		} else {
			System.out.println("Contacts not found");
		}
		
	}

	@Override
	public void findContactByLname() {
		System.out.println("Enter first name");
		String firstName = userInput.next();
		Contacts[] contacts = data.findAllContacts();
		if (contacts.length > 0) {
			boolean flag = false;
			for (int i = 0; i < contacts.length; i++) {
				if (contacts[i].getLname().equals(firstName)) {
					flag = true;
					System.out.println(contacts[i]);
				}
			}
			if (!flag)
				System.out.println("No Contact found");
		} else {
			System.out.println("Contacts not found");
		}
		
	}

	@Override
	public void findAllContacts() {
		// TODO Auto-generated method stub
		Contacts[] contacts = data.findAllContacts();
		if (contacts.length > 0) {
			for (int i = 0; i < contacts.length; i++) {
				System.out.println(contacts[i]);
			}
		} else {
			System.out.println("Contacts not found");
		}
		
	}


	@Override
	public void search() {
		// TODO Auto-generated method stub
		
		System.out.println("Enter pattern");
		String pattern = userInput.next();
		Contacts[] contacts = data.findAllContacts();
		if (contacts.length > 0) {
			boolean flag = false;
			for (int i = 0; i < contacts.length; i++) {
				Contacts contact = contacts[i];
				if (contact.getFname().contains(pattern) || contact.getLname().contains(pattern)
						|| contact.getEmail().contains(pattern) || String.valueOf(contact.getPhone()).contains(pattern)
						|| String.valueOf(contact.getWork()).contains(pattern)) {
					flag = true;
					System.out.println(contact);
				}
			}
			if(!flag) {
				System.out.println("No contact found");
			}
		} else
			System.out.println("Contact not found");
		
	}

}
