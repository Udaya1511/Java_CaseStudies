package CaseStudy2;

public class Operators_CaseStudy {
	
	public static void main(String[] args) {
		
		int x = 10, y = 20;
		int result;

		//addition
		result = x + y;
		System.out.println("x + y = " + result);

		//subraction
		result = x - y;
		System.out.println("x - y = " + result);

		//multiplication
		result = x*y;
		System.out.println("x * y = " + result);

		//division
		result = y/x;
		System.out.println("y / x = " + result);

		//modulers
		result = x % 3;
		System.out.println("x % 3 = " + result);
		
		
		//AssignmentOperators
		
		int a = 5;
		int var;
		
		var = a; // a value is 5
		System.out.println("variance using = " + var);
//		
		var += a; // a value is 5 ----> var +=a which means ---> 5+5(5 is a value which is constant) = 10 now value of var becomes 10
		System.out.println("variance using += " + var);
		
		var *= a; // a value is 10 ----> var*=a ----> 10*5(5 is a value which is constant) = 50
		System.out.println("variance using *= " + var);
		
		//BitwiseOperators
		
		int s = 10;
		int result1 = x << 5;
		
		System.out.println("before left shift = " + s);
		System.out.println("after left shift = " + result1);
		
		//TernearyOperators
		
		int feb = 29;
		String result2;
		
		result2 = (feb == 28) ? "Not a leap year" : "leap year";	
		System.out.println(result);
		
		//unaryOperators
		
		int d=10, c=20, result4=+x;

		System.out.println("+x= "+result);

		result4=-y;

		System.out.println("-y= "+result);

		result4=++x;

		System.out.println("++x="+result);

		result4=--y;

		System.out.println("--y="+result);

		boolean ok =false;

		System.out.println(ok);

		System.out.println(!ok);
		
		
		
	}

}
