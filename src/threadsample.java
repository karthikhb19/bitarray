public class threadsample implements Runnable{
	public void run() {
		System.out.println("thread is running");
	}
	public static void main(String args[]) {
		threadsample O2 = new threadsample();
		Thread th1 = new Thread(O2,"my name:karthik");
		Thread th2 = new Thread("roll no:23");
		th1.start();
		th2.start();
	    String str = th1.getName();
	    String str2 = th2.getName();
		System.out.println(str);
		System.out.println(str2);
	}

}
