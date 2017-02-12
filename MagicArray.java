
public class MagicArray {

	public static void main(String[] args) {
	 int i=isMagic(new int[]{13,4,6,8});
	 System.out.println(i);

	}
   public static int isMagic(int[] a){
	   int sum=0;
	   for(int i=1;i<a.length;i++){
		   if(isPrime(a[i])==1){
			   sum=sum+a[i];
		   }
	   }
	   if(sum==a[0]||(sum==0&&a[0]==0)||(sum==0&&isPrime(a[0])==1)){
		   return 1;
	   }
	   return 0;
   }
   public static int isPrime(int a){
	   for(int i=2;i< a;i++){
		   if(a%i==0){
			   return 0;
		   }
	   }
	   return 1;
   }
}
