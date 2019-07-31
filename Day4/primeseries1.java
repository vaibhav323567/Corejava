/*
Vaibhav Sharma
============================

*/



public class primeseries1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,sum=0,f=0,c;
		
		for(i=1;i<70;i++)
		{	
			c=0;
			for(int j=1;j<i;j++)
			{
				if(i%j==0)
				{
					c++;
				}
			
			if(c==2){
			if((i%4==0)||(i%4==1))
				System.out.println(i);
			
			else if(i%4==2)
				sum=i;
		}
			}
		}
	}

}
