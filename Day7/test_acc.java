/*
Vaibhav Sharma
======================================
*/



public class test_acc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sb_acc r= new sb_acc(1234,25000 ,"ram");
		sb_acc s =new sb_acc(1235,35000,"shyam");
		
		fd_acc p=new fd_acc(1236,20000,"prashant");
		
		System.out.println(r.mat_amount(1234, "ram"));
		System.out.println(s.mat_amount(1235, "shyam"));
		System.out.println(p.mat_amount(1235, "prashant"));

	}

}
