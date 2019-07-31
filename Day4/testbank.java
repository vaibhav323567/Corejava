/*
Vaibhav Sharma
============================

*/



public class testbank {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		bank b;
		b = new citibank();
		System.out.println("interest rate of citi bank is "+b.get_roi());
		b = new icici();
		System.out.println("interest rate of icici bank is "+b.get_roi());
		
	}

}
