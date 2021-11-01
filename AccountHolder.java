import java.util.Random;

/*   This class stores data about an Account Holder.*/

public class AccountHolder{

  protected int ID;
  protected String address;
  
	/* Constructor initializaes the ID and address
	 * @param IDNum is the ID of the holder
	 * @param address1 is address of the holder
	*/

  public AccountHolder(int IDNum, String address1){

    ID = IDNum;
    address = address1;

  }
  
  // Return the next ID. Random is used to simulate database query process
  public int nextID(){

    return new Random().nextInt(1000000);

  }

}
