
public class Power {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i=isPower(new int[]{63,1});
		System.out.println(i);

	}
   public static int isPower(int[] a){
	   int pwr=1;
	   int sum=0;
	   for(int i=0;i<a.length;i++){
		   sum=sum+a[i];
	   }
	   for (int i = 1; i < 1000; i++) {
		    pwr=pwr*2;
            if(sum==pwr){
            	return 1;
            }
            if(pwr>sum){
            	return 0;
            }
	}
	   return 1;
   }
}
