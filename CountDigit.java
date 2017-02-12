
public class CountDigit {

	public static void main(String[] args) {
		int i=isCountDigit(3,3);
        System.out.println(i);
	}
	public static int isCountDigit(int a,int b){
		int rem=0;
		int cnt=0;
		if(a<0 ||b<0){
			return -1;
		}
		
		while(a>10){
			rem =a%10;
			a=a/10;
			if(rem==b){
				cnt++;
			}
		}
		if(a==b){
			cnt++;
		}
		return cnt;
	}

}
