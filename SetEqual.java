
public class SetEqual {

	public static void main(String[] args) {
		int i=isSetEqual(new int[]{1,2,3,5,6},new int[]{1,3});
		System.out.println(i);

	}
    public static int isSetEqual(int[] a,int[] b){
    	int cnt=0;
    	for (int i = 0; i < a.length; i++) {
			
    		cnt=0;
    		for (int j = 0; j < b.length; j++) {
				if(a[i]==b[j]){
					cnt++;
					
				}
			}
    		if(cnt==0){
    			return 0;
    		}
		}
    	for (int i = 0; i < b.length; i++) {
			
    		 cnt=0;
    		for (int j = 0; j < a.length; j++) {
				if(a[i]==b[j]){
					cnt++;
					
				}
			}
    		if(cnt==0){
    			return 0;
    		}
		}
    	return 1;
    }
}
