
public class SquantiallyBounded {

	public static void main(String[] args) {
		int i=isSorted(new int[]{-1,2});
		System.out.println(i);

	}
	public static int isSorted(int[] a){
		int j=0;
		for (int i = 0; i < a.length; i++) {
			j=i+1;
			while(j<=a.length-1){
				if(a[i]>a[j]){
					return 0;
				}
				j++;
			}
		}
		int k=isSquantial(a);
		return k;
	}
public static int isSquantial(int[] a){
	int count=0;
	int j=0;
	for (int i = 0; i < a.length; i++) {
		j=i;
		count=0;
		while(j<=a.length-1){
			if(a[i]<0){
				return 0;
			}
		else if(a[i]==a[j]){
				count++;
			}
			j++;
		}
		if(count>a[i]){
			return 0;
		}
	}
	return 1;
}
}
