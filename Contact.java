package contact;
// Fields below should not be null
public class Contact {
	private String _id;				//cannot be longer than 10 characters
	private String _firstName;		//cannot be longer than 10 characters
	private String _lastName;		//cannot be longer than 10 characters
	private String _phoneNumber;	//must be exactly 10 characters in length
	private String _address;		//cannot be longer than 30 characters
	
	
	
	//String newid = GenerateUniqueID();
	public Contact(String id, String fName, String lName, String phone, String addy) {
		
		
		if(id == null || id.length() > 10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		if(fName == null || fName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		if(lName == null || lName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		if(phone == null || phone.length() > 10 || phone.length() < 10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		if(addy == null || addy.length() > 30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		
		_id = id;
		_firstName = fName;
		_lastName = lName;
		_phoneNumber = phone;
		_address = addy;
	}
	// getters and setters for string names
	public String getId() {
		return _id;
	}
	public String getFullName() {
		return _firstName + " " + _lastName;
	}
	public String getPhoneNumber() {
		return _phoneNumber;
	}
	public String getAddress() {
		return _address;
	}
	
	public void setFirstName(String fName) {
		if(fName == null || fName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		_firstName = fName;
	}
	public void setLastName (String lName){
		if(lName == null || lName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		_lastName = lName;
	}
	public void setPhoneNumber (String phone) {
		if(phone == null || phone.length() > 10 || phone.length() < 10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		_phoneNumber = phone;
	}
	public void setAddress(String addy) {
		if(addy == null || addy.length() > 30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		_address = addy;
	}

	public String getId1() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
