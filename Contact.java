package ContactService;

public class contact<String> {
	private final String contactID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	public contact(String contactID, String firstName, String lastName, String phone, String address) {
		if (contactID.length() <= 10 && contactID != null) {
		    this.contactID = contactID;
		}
		else {
			throw new IllegalArgumentException("Invalid ID");
		}
		setFirstName(firstName);
		setLastName(lastName);
		setPhone(phone);
		setAddress(address);
	}
	
	public void setFirstName(String firstName) {
		if (firstName.length() <= 10 && firstName != null) {
			this.firstName = firstName;
		}
		else {
			throw new IllegalArgumentException("Invalid name");
		}
	}
	
	public void setLastName(String lastName) {
		if (lastName.length() <= 10 && lastName != null) {
			this.lastName = lastName;
		}
		else {
			throw new IllegalArgumentException("Invalid name");
		}
	}
	
	public void setPhone(String phone) {
		if (phone.length() <= 10 && phone != null) {
			this.phone = phone;
		}
		else {
			throw new IllegalArgumentException("Invalid phone");
		}
	}
	
	public void setAddress(String address) {
		if (address.length() <= 30 && address != null) {
			this.address = address;
		}
		else {
			throw new IllegalArgumentException("Invalid address");
		}
	}
	
	public String getContactID() {
		return contactID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getAddress() {
		return address;
	}
}