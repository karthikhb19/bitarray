import java.util.Arrays;
public class arrayadd {
	static int[]a=new int[] {1,3,11};
	static int[]b=new int[] {2,4,6};
	static int[]c= add(a,b);
	static int[]add(int[]a,int[]b){
	int[]c = new int[(int)Math.max(a.length,b.length )];
	for(int i=0;i<c.length;i++) {
		if(a.length>i) {
			c[i]+=a[i];
		}
		if(b.length>i) {
			c[i]+=b[i];
		}
	}
	return c;
		
	}
	public static void main(String args[]) {
		System.out.println(Arrays.toString(c));
	}
}