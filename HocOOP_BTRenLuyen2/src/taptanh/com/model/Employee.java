package taptanh.com.model;

public class Employee extends StaffMember {
	
	protected String  socialSecurityNumber;
	protected double payRate;
	

	@Override
	public double pay() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\t"+ socialSecurityNumber+"\t"+payRate;
		
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public double getPayRate() {
		return payRate;
	}

	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}

}
