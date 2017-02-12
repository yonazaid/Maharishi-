
public class Bunker2 {

	public static void main(String[] args) {
		boolean i=isBunker(120);
		System.out.println(i);

	}
	public static boolean isBunker(int a){
		int sum=1;
		for(int i=0;i<a;i++){
			sum=sum+i;
			if(sum==a){
				return true;
			}
		}
		return false;
	}

}
