
public class FibCount {

	public static void main(String[] args) {
		int i =isFibCount(7);
		System.out.println(i);

	}
	public static int isFibCount(int a){
		int n1=0;
		int n2=1;
		int b=0;
		int sum=0;
		for(int i=1;i<=a;i++){
			sum=n1+n2;
			if(sum>a){
				break;
			}
			b=sum;
			n1=n2;
			n2=sum;
		}
		return b;
	}

}
