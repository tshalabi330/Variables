
public class Variables {

	public static void main(String[] args) {
		int a = 63;
		int b = 45;

		//comment comment comment
		System.out.println("a is " + a);
		System.out.println("b is " + b);
		
		a = a + 10;
		a += 10; //extended assignment operator
		
		a = a + 1;
		a += 1;
		a++;
		
		System.out.println("a is " + a);
		
		double c = Math.PI;
		int d = (int)c;
		long e = Math.round(c);
		System.out.println("c is " + c);
		System.out.println("d is " + d);
		System.out.println("e is " + e);


	}

}
