
public class DualArray {

	public static void main(String[] args) {
		boolean t=isDual(new int[]{1,2,1,2,5,5,5});
		System.out.println(t);

	}
	public static boolean isDual(int[] a){
		int count=0;
		for (int i = 0; i < a.length; i++) {
			count=0;
			for (int j = 0; j < a.length; j++) {
				if(a[i]==a[j]){
					count++;
				}
			}
			if(count>2||count <2){
				return false;
			}
		}
		return true;
	}

}
