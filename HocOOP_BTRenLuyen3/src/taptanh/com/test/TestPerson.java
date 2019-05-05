package taptanh.com.test;

import java.util.ArrayList;

import taptanh.com.model.Man;
import taptanh.com.model.Person;
import taptanh.com.model.Woman;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Person>dsPerson = new ArrayList<Person>();
		Person an = new Man();
		an.setFirstName("An");
		Person hong = new Woman();
		hong.setFirstName("Hong");
		((Woman)hong).setWearingMakeup(true);
		
		dsPerson.add(an);
		dsPerson.add(hong);
		
		for(Person ps: dsPerson) {
			if(ps instanceof Man) {
				System.out.println(ps.getFirstName()+" la nam");
			}
			else if(ps instanceof Woman) {
				System.out.println(ps.getFirstName()+" la nu.");
			}
		}
		
		
		
	}

}
