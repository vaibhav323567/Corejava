/*
Vaibhav Sharma
===================================


*/

public class strfn1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,k=0,len,p;
		String s="I am learning core java";
		len=s.length();
		//int temp=0;
		while(s.indexOf(' ',i)!=-1){
			//temp++;
			p=s.indexOf(' ',i);
			if(s.indexOf(' ',i)!=-1)
			System.out.println(s.substring(i,p));	
			i=p+1;
			
		}
	}

}
