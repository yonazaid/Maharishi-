
public class AllPoss {

	public static void main(String[] args) {
		int i=isAllPossibilities(new int[]{1,3,2,0});
		System.out.println(i);

	}
  public static int isAllPossibilities(int[] a){
	  for (int i = 0; i < a.length; i++) {
		  boolean flag=false;
		  for(int j=0;j<a.length;j++){
			  if(i==a[j]){
				  flag=true;
			  }
		  }
		if(!flag){
			return 0;
		}
	}
	  return 1;
  }
}
