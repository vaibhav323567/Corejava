/*
Vaibhav Sharma
=====================================
*/


public class consultant extends employee {

	int hours;
	consultant(int eid, String ename,	int hours, int rateperunit) {
		super(eid, ename, rateperunit);
		this.hours=hours;
		// TODO Auto-generated constructor stub
	}


	
	public int calcmonthlysalary()
	{
		int salary;
		salary= hours*rateperunit;
		return salary;
	}
	
}

