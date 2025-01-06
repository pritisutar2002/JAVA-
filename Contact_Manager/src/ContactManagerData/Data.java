package ContactManagerData;

import ContactManagerEntity.Contacts;

public interface Data {
	
	void addContact(Contacts contact);

	void deleteContact(int id);

	Contacts updateContactById(int id);
	
	Contacts[] findAllContacts();


}
