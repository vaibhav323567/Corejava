/*
Vaibhav Sharma
=================================
*/





public class switchcaseimple {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a,n=3972;
		while (n!=0)
		{
			a=n%10;
		
			n=n/10;
		
			
			switch (a)
		{
		
		case 3:
		{
			System.out.println("three");
			break;
		}
		case 9:
		{
			System.out.println("nine");
			break;
		}
		case 7:
		{
			System.out.println("seven");
			break;
		}
		case 2:
		{
			System.out.println("two");
			break;
		}
		}
		}
		}
}
