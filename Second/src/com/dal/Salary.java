package com.dal;

public class Salary {
	private double basic;
	private double hr;
	private double pf;
	private double da;
	private double totalsalary;
	public double getTotalsalary() {
		return totalsalary;
	}
	public void setTotalsalary(double basic,double hra,double pf,double da) {
		this.totalsalary = basic+hra+pf+da;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	public double getHr() {
		return hr;
	}
	public void setHr(double hr) {
		this.hr = hr;
	}
	public double getPf() {
		return pf;
	}
	public void setPf(double pf) {
		this.pf = pf;
	}
	public double getDa() {
		return da;
	}
	public void setDa(double da) {
		this.da = da;
	}
	
	@Override
	public String toString() {
		return "Salary [basic=" + basic + ", hr=" + hr + ", pf=" + pf + ", da=" + da + ", totalsalary=" + totalsalary
				+ "]";
	}
}
