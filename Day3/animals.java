/*
Vaibhav Sharma
=================================
*/




public class animals {
	String habitat;
	int age,lifespan,no_of_legs;
	
	public String displaydet(){
		String str="habitat is "+habitat+"\n"
					+"age is"+age+"\n"
					+"lifespan is "+lifespan+"\n"
					+"no of legs are "+no_of_legs;
		
		return str;
	}
	public float expectedremainglife()
	{
		float remaininglife;
		remaininglife = lifespan-age;
		return remaininglife;
	}
	
	

}
