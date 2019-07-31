/*
Vaibhav Sharma
===================================


*/



public class exeptiontest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int[] b1 ={23,45,65,11,33};
			System.out.println(b1[4]);
			System.out.println(b1[5]);
			System.out.println("hi");
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("in catch blk");
		}
		System.out.println("out of catch blk");
	}

}
