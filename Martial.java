
public class Martial {

	public static void main(String[] args) {
		int i = isMartial(new int[]{1,2,1,2,1,2,1,4,1,1});
		System.out.println(i);

	}
	public static int isMartial(int[] a){
		int cnt1=0;
		int cnt2=0;
		int y=1;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==1){
				cnt1++;
			}
			else if(a[i]==2){
				cnt2++;
			}
			if(a[i]==a[y]&&y<=a.length-1){
				return 0;
			}
		}
		if(cnt1<=cnt2){
			return 0;
		}
		return 1;
	}

}
