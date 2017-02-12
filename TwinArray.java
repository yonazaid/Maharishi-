
public class TwinArray {

	public static void main(String[] args) {
		int i = isTwinArray(new int[]{3,13,8,9,7});
		System.out.println(i);

	}
   public static int isTwinArray(int[] a){
	   
	   for (int i = 0; i < a.length; i++) {
		
		   for (int j = i; j < a.length; j++) {
			   if(isPrime(a[i])==1&&isPrime(a[j])==1&& (a[i]-a[j]==2||a[i]-a[j]==-2)){
				   return 1;
			   }
			  
		}
	}
	   return 0;
   }
   public static int isPrime(int a){
	   for (int i = 2; i < a; i++) {
		if(a%i==0){
			return 0;
		}
	}
	   return 1;
   }
}
