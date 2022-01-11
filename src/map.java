
public class map {
	int roll;
	String name;
	//constructor //
	map(int roll, String name)
	{
		this.roll= roll;
		this.name="string name";
		
	}
	//main method//
	public static void main(String args[]) {
		map obj= new map(6,"karthik");
		System.out.println("the roll no is"  + obj.roll);
		System.out.println("the name is" + obj.name);
		
	}

}
