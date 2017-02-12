
public class ExamCheck {


	public static void main(String[] args) {
		int i =sass(54,2);
		System.out.println(i);

	}
	public static int sass(int n,int p){
		int rem=0;
		int ct=0;
		while(rem==0 && n >1){
			rem=n%p;
			if(rem==0){
				ct++;
			}
			n=n/p;
		}
		return ct;
	}

}
