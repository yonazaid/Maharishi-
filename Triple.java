
public class Triple {

	public static void main(String[] args) {
		int i=isTriple(new int[]{1,2,1,2,1});
		System.out.println(i);

	}
   public static int isTriple(int[] a){
	   int cnt=0;
	   for (int i = 0; i < a.length; i++) {
		cnt=0;
		for (int j = 0; j < a.length; j++) {
			if(a[i]==a[j]){
				cnt++;
			}
		}
		if(cnt!=3){
			return 0;
		}
	}
	   return 1;
   }
}
