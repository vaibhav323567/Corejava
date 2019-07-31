/*
Vaibhav Sharma
======================================
*/



public class fd_acc extends account{
	int r=6;
	public fd_acc(int acc_no,int amt, String name)
	{
		this.name= name;
		this.acc_no=acc_no;
		this.amt=amt;
	}
	
	public float mat_amount(int acc_no, String name){
		
		return amt+calc_int(r);
		
	}
}
