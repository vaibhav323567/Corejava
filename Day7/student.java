/*
Vaibhav Sharma
==================================

*/


public class student {

	int std_id,m1,m2;
	String name;
	float avg;
	public student(int std_id,String name, int m1, int m2 ) {
		
		this.std_id = std_id;
		this.m1 = m1;
		this.m2 = m2;
		this.name = name;
		this.avg = average();
	}
	public float average(){
		avg=(m1+m2) /2;
	return avg;
	}
	
}
