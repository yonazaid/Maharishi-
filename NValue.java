
public class NValue {

	public static void main(String[] args) {
		boolean t=isNValue(new int[]{1,9,1,2,3,4,5},6);
		System.out.println(t);

	}
	public static boolean isNValue(int[] a,int n){
		int count=0;
		boolean flag=false;
		int[] b=new int[a.length];
		for(int i=0;i<a.length;i++){
			if(i==0){
				b[i]=a[i];
				count++;
			}
			else{
				flag=false;
				for(int j=0;j<b.length;j++){
					if(a[i]==b[j]){
						flag=true;
						break;
					}
				}
				if(!flag){
					b[i]=a[i];
					count++;
				}
			}
		}
		if(count==n){
			return true;
		}
		return false;
	}

}
