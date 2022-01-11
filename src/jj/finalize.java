package jj;
public class finalize {
	public static void main(String args[]){
	try {
		int didv = 25/6;
		System.out.println(+didv);
	}
	catch(ArithmeticException e) {
		System.out.println("Exception Caught");
	}
	finally {
		System.out.println("it always execute");
	}
}
}
