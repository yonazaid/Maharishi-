
public class SameNum {

	public static void main(String[] args) {
		int i=isSameNumber(23,97);
		System.out.println(i);

	}
   public static int isSameNumber(int n,int m){
	   int cntN=0;
	   int cntM=0;
	   if(n<0||m<0){
		   return 0;
	   }
	   for (int i = 1; i <= m; i++) {
		if(i<=n && n%i==0){
			cntN++;
		}
		if(m%i==0){
			cntM++;
		}
	}
	   if(cntM==cntN){
		   return 1;
	   }
	   return 0;
   }
}
