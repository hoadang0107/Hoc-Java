package taptanh.com.model;

public class SinhVien implements ILamViec,IGiaiTri{

	@Override
	public void complexity() {
		// TODO Auto-generated method stub
		System.out.println("Công việc phức tạp");
		
	}

	@Override
	public void difficulty() {
		// TODO Auto-generated method stub
		System.out.println("Công việc khó");
		
	}

	@Override
	public void hatHo() {
		// TODO Auto-generated method stub
		
		System.out.println("Hát Hò");
	}

}
