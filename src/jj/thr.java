package jj;
public class thr {
	int a= 10;
	int b= 0;
	void multiply() {
		try{
			if(b==0) {
				throw new ArithmeticException("invalid data");
			}
			else {
				int res = a*b;
				System.out.println("input is valid:"+res);
			}
		}
		catch(ArithmeticException e){
			System.out.println("Exception occurs");
			}
	}
	public static void main(String args[]) {
		thr t1 = new thr();
		t1.multiply();
	}

}

