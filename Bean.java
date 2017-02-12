
public class Bean {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	int i=isBean(new int[]{2,3,4,5});
	System.out.println(i);

	}
	public static int isBean(int[] a){
		boolean flag=false;
		for(int i=0;i<a.length;i++){
			flag=false;
			for (int j = 0; j < a.length; j++) {
				if(a[i]==a[j]-1||a[i]==a[j]+1){
					flag=true;
					break;
				}
			}
			if(!flag){
				return 0;
			}
		}
		return 1;
	}

}
