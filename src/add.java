
public class add {
	int a;
	int b;
	add(){
		a=10;
		b=20;
		}
	void display(add obj)
	{
		System.out.println("a = "+obj.a + " b ="+obj.b);
	}
	void get() {
		display(this);
	}
	public static void main(String args[]) {
		add object = new add();
		object.get();
	}

}
