
public class test {
public static void main(String args[]) {
	int a[] = new int[2];
	System.out.println("out of try");
	try {
		System.out.println("invalid array"+a[3]);
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println("exceptioniscaught");
	}
	finally {
		System.out.println("finally is executed");
	}
}
}
