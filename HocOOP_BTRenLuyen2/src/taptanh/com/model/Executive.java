package taptanh.com.model;

public class Executive extends Employee {
	
	private double bonus;

	
	public void awardBonus(double execBonus) {
		this.bonus = execBonus;
		System.out.println("Lãnh bonus: "+ this.bonus);
		
	}
	
	@Override
	public double pay() {
		// TODO Auto-generated method stub
		return super.pay() + this.bonus;
	}

}
