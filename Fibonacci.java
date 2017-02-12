
public class Fibonacci {

	public static void main(String[] args) {
	int i=isFibonacci(13);
	System.out.println(i);

	}
   public static int isFibonacci(int a){
	   int sum=0;
	   int n1=0;
	   int n2=1;
	   for(int i=0;i<=a;i++){

		   sum=n1+n2;
		   if(sum==a){
			   return 1;
		   }
		   n1=n2;
		   n2=sum;
	   }
	   return 0;
   }
}
