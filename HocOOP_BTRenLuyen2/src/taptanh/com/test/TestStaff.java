package taptanh.com.test;

import java.lang.reflect.Executable;

import taptanh.com.model.Employee;
import taptanh.com.model.Executive;
import taptanh.com.model.Staff;

public class TestStaff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staff st = new Staff();
		
		Employee teo = new Employee();
		teo.setName("Nguyễn Văn Tèo");
		teo.setAddress("Hà Nội");
		teo.setPhone("836483");
		teo.setPayRate(0.5);
		teo.setSocialSecurityNumber("ABC123");
		st.addStaffMember(teo);
		
		Employee ty = new Employee();
		ty.setName("Nguyễn Văn Tý");
		ty.setAddress("HCM");
		ty.setPhone("83663");
		ty.setPayRate(0.8);
		ty.setSocialSecurityNumber("AB274123");
		st.addStaffMember(ty);
		
		Executive an= new Executive();
		an.setName("ANNNN");
		an.setAddress("HẢi Dương");
		an.setPayRate(0.7);
		an.setPhone("093745");
		an.setSocialSecurityNumber("Ahsdu86");
		an.awardBonus(467);
		st.addStaffMember(an);
		
		st.payDay();
		
		
	}

}
