
public class Vanilla {

	public static void main(String[] args) {
		int i=isVanilla(new int[]{1,11,111,2111});
		System.out.println(i);

	}
public static int isVanilla(int[] a){
	int k=a[0]%10;
	for(int i=0;i<a.length;i++){
		while(a[i]>10){
			int rem=a[i]%10;
			a[i]=a[i]/10;
			if(k!=rem){
				return 0;
			}
			
		}
		if(k!=a[i]){
			return 0;
		}
	}
	return 1;
}
}
