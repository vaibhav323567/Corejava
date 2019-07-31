/*
Vaibhav Sharma
=================================
*/




//public class account1 {

//}


public class account1 {
	
	int accountinfo;
	float accountbal, int_rate,accountno;
	
	public account1(int accountno)
	{
		this.accountno=accountno; 
	}
	public account1 (int accountno, float accountbal, float int_rate)
	{
		this.accountno = accountno;
		this.accountbal= accountbal;
		this.int_rate= int_rate;
		
	}
	
	
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
