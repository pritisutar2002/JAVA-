package ContactManagerData;

import ContactManagerEntity.Contacts;

public class Data_Implementation implements Data {
	
	private Contacts[] contacts = new Contacts[10];

	private int capacity = contacts.length;

	private int index = 0;
	
	private boolean exists(Contacts contact) {
		boolean present = false;
		for (int i = 0; i < index; i++) {
			if (contacts[i].getPhone() == contact.getPhone() 
					|| contacts[i].getWork() == contact.getWork()
					|| contacts[i].getEmail().equals(contact.getEmail())) {
				present = true;
				break;
			}
		}
		return present;
	} 
	
	@Override
	public void addContact(Contacts contact) {
		if(exists(contact)) {
			System.out.println("Contact already exists");
		}else {
			if (index == (capacity - 1)) {
				Contacts[] temp = new Contacts[2 * capacity];
				for (int i = 0; i < index; i++) {
					temp[i] = contacts[i];
				}
				contacts = temp;
				capacity = contacts.length;
			}
			contacts[index] = contact;
			index++;
			System.out.println("----- Contact added successfully ------");
		}
	
		
	}

	@Override
	public void deleteContact(int id) {
		boolean flag = false;
		for (int i = 0; i < index; i++) {
			if (contacts[i].getId() == id) {
				flag = true;
				contacts[i] = null;
				normalize(i);
				break;
			}
		}
		if (flag) {
			System.out.println("Contact deleted");
		} else {
			System.out.println("Invalid id");
		}

		
	}
	
	

	@Override
	public Contacts updateContactById(int id) {
		Contacts contact=null;
		for (int i =0; i<index;i++) {
			if(contacts[i].getId()==id) {
				contact=contacts[i];
				break;
				
			}
		}
		return contact;
	}

	@Override
	public Contacts[] findAllContacts() {
		Contacts[] temp = new Contacts[index];
		for (int i = 0; i < index; i++) {
			temp[i] = contacts[i];
		}
		return temp;
	}
	
	private void normalize(int i) {
		if (i == index - 1) {
			index--;
		} 
		else{
		for (int j = i; j < index - 1; j++) {
				contacts[j] = contacts[j + 1];
			}
		}
	}


	

}
