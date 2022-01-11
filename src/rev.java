
public class rev {
	void reverse(String str)
	{
		if(str==null)
		System.out.println(str);
		else
			System.out.println(str.charAt(str.length())-1);
		reverse(str.substring(0,str.length()-1));
		
	}
	public static void main(String args[])
	{
		String str = "i am running";
		rev obj = new rev();
		obj.reverse(str);
		
	}

}
