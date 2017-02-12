
public class Equal {

	public static void main(String[] args) {
		int i = isEqual(new int[]{1,1,2,1,1,2});
		System.out.println(i);

	}
	public static int isEqual(int[] a){
		int pre=0;
		int next=0;
		boolean flag=false;
			for (int j = 0; j < a.length; j++) {
				if(1==a[j]){
					if(flag){
						next++;
					}
					else
					pre++;
				}
				else if(a[j]==2&&next==0){
					flag=true;
				}
				else{
					return 0;
				}
			}

		if(next==pre&&flag&&(next!=0&& pre!=0)){
			return 1;
		}
		return 0;
	}

}
