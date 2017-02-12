
public class LargeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =isLargestSum(new int[]{1,2,3,-4});
		System.out.println(i);

	}
  public static int isLargestSum(int[] a){
	  int sum=0;
	  for (int i = 0,j=1; i < a.length-1; i++,j++) {
		 if(a[i]+a[j]>sum){
			 sum=a[i]+a[j];
		 }
	}
	  return sum;
  }
}
