
public class Layered {

	public static void main(String[] args) {
		int i=isLayered(new int[]{2,2,3,3,6,6});
		System.out.println(i);

	}
public static int isLayered(int[] a){
	int cnt=0;
	for (int i = 0; i < a.length; i++) {
		cnt=0;
		for (int j = 0; j < a.length; j++) {
			if(a[i]==a[j]){
				cnt++;
			}
	     if(a[j]>a[i]){
	    	 break;
	     }
				
		}
		if(cnt <=1){
			return 0;
		}
	}
	return 1;
}
}
