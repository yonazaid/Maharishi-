
public class Centre {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = isCenter(new int[]{1});
		System.out.println(i);

	}
	public static int isCenter(int[] a){
		if(a.length%2==0){
			return 0;
		}
		int mid=a.length/2;
		for (int i = 0; i < a.length; i++) {
			if(i!=mid && a[i] <= a[mid]){
				return 0;
				
			}
		}
		return 1;
	}

}
