/* This class stores data about an Individual Holder*/

public class IndividualHolder extends AccountHolder{
	
	private String name;
	private String SSN;
	
	/* Constructor initializaes the ID, address, name, and SSN
	 * @param name1 is the name of the individual
	 * @param SSN1 is the SSN of the individual
	*/
	
	public IndividualHolder(int ID, String address, String name1, String SSN1) {
		
		super(ID, address);
		name = name1;
		SSN = SSN1;
		
	}
	
	// Return the name of the individual
	public String getName() {
		
		return name;
	}
	
	// Return the SSN of the individual
	public String getSSN() {
		
		return SSN;
	}
	
	// Change the name of the individual
	public void setName(String name1) {
		
		name = name1;
		
	}
	
	// Change the SSN of the individual
	public void setSSN(String SSN1) {
		
		SSN = SSN1;
	}

}
