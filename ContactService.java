package ContactService;

import java.util.ArrayList;

public class ContactService {
	private ArrayList<Contact> contacts;
	
	public ContactService() {
		contacts = new ArrayList<>();
	}
	
	public boolean addContact(Contact newContact) {
		for (Contact person : contacts) {
			if (person.getContactID().equalsIgnoreCase(newContact.getContactID())) {
				return false;
			}
		}
		contacts.add(newContact);
		return true;
		}
	}
	
	public boolean deleteContact(String contactID) {
		boolean deleted = false;
		for (Contact person : contacts) {
			if (person.getContactID().equalsIgnoreCase(contactID)) {
				contacts.remove(person);
				deleted = true;
				break;
			}
		}
		return deleted;
	}
	
	public boolean updatePhone(String contactID, String newPhone) {
		boolean updated = false;
		for (Contact person : contacts) {
			if (person.getContactID().equalsIgnoreCase(contactID)) {
				person.setPhone(newPhone);
				updated = true;
				break;
			}
		}
		return updated;
	}
	
	public boolean updateFirstName(String contactID, String newFirstName) {
		boolean updated = false;
		for (Contact person : contacts) {
			if (person.getContactID().equalsIgnoreCase(contactID)) {
				person.setFirstName(newFirstName);
				updated = true;
				break;
			}
		}
		return updated;
	}
	
	public boolean updateLastName(String contactID, String newLastName) {
		boolean updated = false;
		for (Contact person : contacts) {
			if (person.getContactID().equalsIgnoreCase(contactID)) {
				person.setLastName(newLastName);
				updated = true;
				break;
			}
		}
		return updated;
	}
	
	public boolean updateAddress(String contactID, String newAddress) {
		boolean updated = false;
		for (Contact person : contacts) {
			if (person.getContactID().equalsIgnoreCase(contactID)) {
				person.setAddress(newAddress);
				updated = true;
				break;
			}
		}
		return updated;
	}
}