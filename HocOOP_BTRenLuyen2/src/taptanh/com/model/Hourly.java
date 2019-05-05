package taptanh.com.model;

public class Hourly extends Employee {
	private int hoursWorked;
	
	public void addHours(int moreHours) {
		this.hoursWorked= moreHours;
	}
	
	@Override
	public double pay() {
		// TODO Auto-generated method stub
		return this.hoursWorked*50;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
