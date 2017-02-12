
public class Check {

	public static void main(String[] args) {
		int i=isCheck(new int[]{1,2,3,4,1,4});
		System.out.println(i);

	}
	public static int isCheck(int[] a){
		
		int[] b=new int[a.length];
		int cnt=0;
		int flag=0;
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if(a[i]==b[j]){
					flag++;
				}
			}
			if(flag==0){
				b[i]=a[i];
				cnt++;
			}
		}
		
		return cnt;
	}

}
