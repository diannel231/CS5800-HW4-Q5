import java.util.Random;

/**   This class stores data about an Account Holder.*/

public class AccountHolder{

  protected int ID;
  protected String address;

  public AccountHolder(int IDNum, String address1){

    ID = IDNum;
    address = address1;

  }

  public int nextID(){

    return new Random().nextInt(1000000);

  }

}
