public class employee {
	int id;
	int salary;
	static String ceo;
	public void Show() {
		System.out.println(id +":" + salary +":" + ceo);
	}
	public static void main(String args[])
	{
		employee karthik = new employee();
		karthik.id = 7;
		karthik.salary = 4000;
		employee.ceo = "raj";
		employee gopi = new employee();
		gopi.id = 6;
		gopi.salary = 6000;
		employee.ceo = "raj";
		karthik.Show();
		gopi.Show();
			}
}
