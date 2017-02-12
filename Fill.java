
public class Fill {

	public static void main(String[] args) {
	int[] a=fill(new int[]{3,4,5,6,5,6},3,9);
	System.out.print("{");
      for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+", ");
		if(i==a.length-1){
			System.out.print(a[i]);
		}
	}
      System.out.print("}");
	}
   public static int[] fill(int[] a,int p,int n){
	   int[] b=new int[n];
	   int j=0;
	   for (int i = 0; i < n; i++) {
		   b[i]=a[j];
		   j++;
		   if(j==p){
			   j=0;
		   }
		
	}
	   return b;
   }
}
