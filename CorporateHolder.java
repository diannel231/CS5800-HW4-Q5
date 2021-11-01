/* This class stores data about a Corporate Holder*/

public class CorporateHolder extends AccountHolder{
	
	private String contact;
	
	/* Constructor initializaes the ID, address, and contact
	 * @param contact1 is the contact information of the corporate
	*/

	public CorporateHolder(int ID, String address, String contact1) {
		
		super(ID, address);
		contact = contact1;
		
	}
	
	// Return contact
	public String getContact() {
		
		return contact;
	}
	
	// Change the contact
	public void setContact(String contact1) {
		
		contact = contact1;
	}
	

}
