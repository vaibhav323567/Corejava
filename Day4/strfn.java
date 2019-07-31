/*
Vaibhav Sharma
============================

*/



public class strfn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,len;
		String s="I am learning core java";
		len=s.length();
		while(i<len){
			if(s.charAt(i)==' ')
				System.out.println();
			else
				System.out.print(s.charAt(i));
		
			i++;
		}
	}

}
