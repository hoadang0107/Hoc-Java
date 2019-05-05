package taptanh.com.model;

import java.util.Date;

public abstract class Person implements IMammal {
	
	private String firstName;
	private BloodGroup blood;
	private Address homeAddress;
	private Address schoolAddress;
	@Override
	public void setDateOfBirth(Date dob) {
		// TODO Auto-generated method stub

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public int getAgeAsDays() {
		// TODO Auto-generated method stub
		return 0;
	}

}
