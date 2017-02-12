
public class Sequence {

	public static void main(String[] args) {
		int i=isSequence(new int[]{1,1,2,1,2,3,1,2,3,4});
		System.out.println(i);

	}
	public static int isSequence(int[] a){
	     int p=0;
	     int len=0;
	     int k=1;
	     for(int i=1;i<=a[a.length-1];i++){
	    	 len=len+i;
	     }
	     if(a.length!=len){
	    	 return 0;
	     }
	     for(int i=1;i<=a[a.length-1];i++){
	    	 k=1;
	    	 for(int j=1;j<=i;j++){
	    		if( a[p]!=k){
	    			return 0;
	    		}
	    		 
	    		 k++;
	    		 p++;
	    	 }
	    	 
		}
		return 1;
	}
}
