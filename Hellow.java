
public class Hellow {

	public static void main(String[] args) {
		boolean t=isHellow(new int[]{1,0,3,0,0,0,0,0,3,4,8});
        System.out.println(t);
	}
public static boolean isHellow(int[] a){
	if(a.length%2==0){
		return false;
	}
	
		int mid=a.length/2+1;
		if(a[mid]!=0&&a[mid-1]!=0&&a[mid+1]!=0){
		
			return false;
		}
	return true;
}
}
