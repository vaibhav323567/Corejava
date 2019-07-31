/*
Vaibhav Sharma
=================================
*/



public class account {
	
	int accountinfo;
	float accountbal, int_rate,accountno;
	
	public String get_account_det()
	{
		String str= "Account number: "+accountno+"\n"
	+"Account balance: "+accountbal+"\n"
	+"Interest rate: "+int_rate+"\n";
		
		return str;
		
	}
	
	public float calculateinterest(float amt)
	{
		return (amt*int_rate)/100;
	}

}
