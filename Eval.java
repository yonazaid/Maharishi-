
public class Eval {

	public static void main(String[] args) {
	     int i=isEval(new int[]{0,1,2,3,4},1);
	     
	     System.out.println(i);

	}
	public static int isEval(int[] a,int n){
		int sum=0;
		int expon=1;
		int multpy=1;
		int k=0;
		for (int i = a.length-1; i >=0; i--) {
			
			multpy=1;
			expon=1;
			for (int j = a.length-1-k; j >=1; j--) {
				expon=expon*n;
			}
			multpy=multpy*a[i]*expon;
			sum=sum+multpy;
			k++;
		}
		return sum;
	}

}
