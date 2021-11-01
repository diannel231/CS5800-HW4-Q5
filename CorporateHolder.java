
public class CorporateHolder extends AccountHolder{
	
	private String contact;

	public CorporateHolder(int ID, String address, String contact1) {
		
		super(ID, address);
		contact = contact1;
		
	}
	
	public String getContact() {
		
		return contact;
	}
	
	public void setContact(String contact1) {
		
		contact = contact1;
	}
	

}
