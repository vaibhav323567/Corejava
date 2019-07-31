/*
Vaibhav Sharma
=====================================
*/



abstract class employee {
	
	int eid;
	String ename;
	int rateperunit;
	
	public abstract int calcmonthlysalary();
	
	employee(int eid, String ename, int rateperunit){
		
		this.eid = eid;
		this.ename = ename;
		this.rateperunit = rateperunit;
				
	}
	

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getRateperunit() {
		return rateperunit;
	}

	public void setRateperunit(int rateperunit) {
		this.rateperunit = rateperunit;
	}

	/**
	 * @param args
	 */
	
	
	
	

}
