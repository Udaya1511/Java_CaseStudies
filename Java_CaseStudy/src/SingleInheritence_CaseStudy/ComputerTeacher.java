package SingleInheritence_CaseStudy;



public class ComputerTeacher extends Teacher{
	
	public void mainSubject() {
		System.out.println("main subject is Physics");

	}
	
	public static void main(String[] args) {
		
		ComputerTeacher CT = new ComputerTeacher();
		
		CT.collegeName();
		CT.Designation();
		CT.mainSubject();
		
		
	}

}
