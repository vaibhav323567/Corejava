/*
Vaibhav Sharma
============================

*/


public class primeseries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,c=0,sum=0;;
		for( i=13; i<30; i++)
		{
			c=0;
			for(j=1;j<=i;j++)
			{
				if((i%j)==0)
				{
					c++;
				}
			}
			if(c==2)
				{
				System.out.println(i);
				sum=sum+i;
				//System.out.println(sum);
				}
		}
System.out.println(sum);
	}

}
