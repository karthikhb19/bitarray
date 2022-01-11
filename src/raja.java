public class raja {

	   public raja()
	   {
		System.out.println("Class Car");
	   }
	   public void vehicleType()
	   {
		System.out.println("Vehicle Type: Car");
	   }
	}
	class Maruti extends raja{
	   public Maruti()
	   {
		System.out.println("Class Maruti");
	   }
	   public void brand()
	   {
		System.out.println("Brand: Maruti");
	   }
	   public void speed()
	   {
		System.out.println("Max: 90Kmph");
	   }
	}
class latest extends Maruti{

	   public latest()
	   {
		System.out.println("Maruti Model: 800");
	   }
	   public void speed()
	   {
		System.out.println("Max: 80Kmph");
	   }
	   public static void main(String args[])
	   {
		 latest obj=new latest();
		 obj.vehicleType();
		 obj.brand();
		 obj.speed();
	   }
	}