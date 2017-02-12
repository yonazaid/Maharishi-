
public class PairedNum {

	public static void main(String[] args) {
		int i=isPaired(new int[]{1,4,1,4,5,6},5);
		System.out.println(i);

	}
	public static int isPaired(int[] a,int n){
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(a[i]+a[j]==n&&i+j==n){
					return 1;
				}
			}
		}
		
		return 0;
	}

}
