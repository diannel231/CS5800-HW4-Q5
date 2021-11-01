
public class IndividualHolder extends AccountHolder{
	
	private String name;
	private String SSN;
	
	public IndividualHolder(int ID, String address, String name1, String SSN1) {
		
		super(ID, address);
		name = name1;
		SSN = SSN1;
		
	}
	
	public String getName() {
		
		return name;
	}
	
	public String getSSN() {
		
		return SSN;
	}
	
	public void setName(String name1) {
		
		name = name1;
		
	}
	
	public void setSSN(String SSN1) {
		
		SSN = SSN1;
	}

}
