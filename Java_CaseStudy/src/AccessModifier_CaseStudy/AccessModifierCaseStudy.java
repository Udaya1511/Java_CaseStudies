package AccessModifier_CaseStudy;

public class AccessModifierCaseStudy {
	
	private void privateAccess() {
		
		int a = 143;
		System.out.println(a);

	}
	
	public void publicAccess() {
		int a = 143;
		System.out.println("I am Public :" + a);

	}

	protected void protectedAccess() {
		int a = 143;
		System.out.println("I am protected : " + a);

	}
	
	void DefaultAccess() {
		
		int a = 143;
		System.out.println("I am Default : " + a);

	}
	

}
