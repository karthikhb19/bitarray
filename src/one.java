class one {
	public void fun() {
		System.out.println("multilevelinhertiance");
	}
}
class two extends one{
	public void car() {
		System.out.println(" maruthi is oldest fasion");
	}
}
class three extends two{
	public void latest() {
		System.out.println("audi&bmw is latest fasion");
	}
public static void main(string[] args) {
		three obj = new three();
		obj.fun();
		obj.car();
		obj.latest();
	}
}