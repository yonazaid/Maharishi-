
public class Fancy {

	public static void main(String[] args) {
		int i= isFancy(15);
		System.out.println(i);

	}
	public static int isFancy(int a){
		int n1=1;
		int n2=1;
		int sum=0;
		for (int i = 1; i < a; i++) {
			sum=2*n1 + 3*n2;
			if(sum==a){
				return 1;
			}
			n1=n2;
			n2=sum;
		}
		return 0;
	}

}
