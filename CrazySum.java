
public class CrazySum {

	public static void main(String[] args) {
		int sum=isCrazy(new int[]{2, 3, 5, 2});
		System.out.println(sum);

	}
	public static int isCrazy(int[] a){
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i]*i;
		}
		return sum;
	}

}
