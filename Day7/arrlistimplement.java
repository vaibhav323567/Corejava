/*
Vaibhav Sharma
==================================

*/



import java.util.ArrayList;


public class arrlistimplement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<student> semester = new ArrayList<student>();
		student ramesh = new student(101,"Ramesh",80,90);
		student rakesh = new student(102,"Rakesh",70,80);

		student seema = new student(103,"Seema",60,90);

		student priya = new student(104,"Priya",50,60);

		arrlistimplement ex = new arrlistimplement();
		semester.add(ramesh);
		semester.add(rakesh);
		semester.add(seema);
		
		ex.display(semester);


	}
	
	public void display(student s)
	{
		System.out.println("ID : "+s.std_id+"\n"+"Name: "+"\n"+"physics: "+s.m1+"\n"+"chemistry: "+s.m2+
				"\n"+"avg: "+s.avg);
		
	}
	public void display(ArrayList<student> std)
	{
		for(student s : std){
		System.out.println("========================");
		s.average();
			System.out.println("ID : "+s.std_id+"\n"+"Name: "+"\n"+"physics: "+s.m1+"\n"+"chemistry: "+s.m2+
				"\n"+"avg: "+s.avg);
		
	}
		}
}
