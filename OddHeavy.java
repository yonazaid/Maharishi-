
public class OddHeavy {

	public static void main(String[] args) {
	int i=isOddHeavy(new int[]{1,1,1,1});
	System.out.println(i);

	}
    public static int isOddHeavy(int[] a){
    	int oddMin=2000;
    	int evenMax=-1;
    	for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0){
				if(a[i]>evenMax){
					evenMax=a[i];
				}
			}
			else{
				if(a[i]<oddMin){
					oddMin=a[i];
				}
			}
		}
    	if(oddMin >evenMax){
    		return 1;
    	}
    	return 0;
    }
}
