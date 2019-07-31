/*
Vaibhav Sharma
=====================================
*/


public class abstrattest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		consultant c = new consultant(1234, "vaibhav", 30, 12);
		fte f= new fte(1235, "alice",20, 1500);
		System.out.println("Hourly salary of "+c.ename+" is "+c.calcmonthlysalary());
		System.out.println("monthly salary of "+f.ename+" is "+f.calcmonthlysalary());
	}

}
