/*
Vaibhav Sharma
============================

*/



public class fn1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p=0,i=0,c=0;
		String s="I am learning core java";
		while((s.indexOf('a',i))!=-1)
		{
			p=s.indexOf('a',i);
			i=p+1;
			c++;
		}
		System.out.println(c);

	}

}
