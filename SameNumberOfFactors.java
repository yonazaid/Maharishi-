
public class SameNumberOfFactors {

	public static void main(String[] args) {
		int i=isSameNumberOfFactors(7,21);
        System.out.println(i);
	}
	public static int isSameNumberOfFactors(int n1,int n2){
		int cnt1=0;
		int cnt2=0;
			for (int i = 1; i <= n2; i++) {
				if(n1%i==0){
					cnt1++;
				}
				if(n2%i==0){
					cnt2++;
				}
			}
			if(cnt1==cnt2){
				return 1;
			}
			return 0;
	}
}
