
public class ZeroLimited {

	public static void main(String[] args) {
		int i=isZeroLimited(new int[]{1,0,1,1,0,1,1,0});
		System.out.println(i);

	}
	public static int isZeroLimited(int[] a){
		for (int i = 0; i < a.length; i++) {
            if(3*i+1<=a.length-1&&a[3*i+1]!=0){
            	return 0;

            }
             if(i>0 && 3*i<=a.length-1&&(a[3*i]==0 || a[3*i-1]==0)){
				return 0;
        }
            
		}
		if(a[0]==0){
			return 0;
		}
		return 1;
	}
}
