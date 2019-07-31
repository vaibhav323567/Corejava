/*
Vaibhav Sharma
=====================================
*/

public class fte extends employee {
	int days;
	
	fte(int eid, String ename,int days, int rateperunit) {
		super(eid, ename, rateperunit);
		this.days=days;
		// TODO Auto-generated constructor stub
	}
public int calcmonthlysalary()
{
	int salary;
	salary= days*rateperunit;
	return salary;

}
}
