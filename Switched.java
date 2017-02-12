
public class Switched {

	public static void main(String[] args) {
		int i = isSwitched(new int[]{1,3,1,3});
		System.out.println(i);

	}
	public static  int isSwitched(int[] a){
		int j=0;
		int i=0;
		int d=0;
		int p=0;
		int cnt=0;
		int cnt1=0;
			for (int k = 0; k < a.length; k++) {
				if(1==a[k]){
					cnt++;
					if(cnt==1){
						i=k;
					}
					else{
						j=k;
					}
				}
			
				if(3==a[k]){
					cnt1++;
					if(cnt==1){
						d=k;
					}
					else{
						p=k;
					}
					
				}
			}
		if(i<d && d<j){
			return 0;
		}
		else if(i<p && p<j){
			return 0;
		}
		return 1;
		
		
	}

}
