
public class CubePerfect {

	public static void main(String[] args) {
	    int i =isCubePerfect(152);
	    System.out.println(i);

	}
	public static int isCubePerfect(int n){
		int rem=0;
		int sum=0;
		int a=n;
		while(n>0){
			rem=n%10;
			n=n/10;
			sum=sum+rem*rem*rem;	
		}
		if(sum==a){
			return 1;
		}
		return 0;
	}
}
