
public class DaniEven {

	public static void main(String[] args) {
	int i=isBalanced(new int[]{1,3,5,6,8});
    System.out.println(i);
	}
   public static int isBalanced(int[] a){
	   
	   int cnt=0;
	   int k=0;
	   boolean flag=false;
	   for (int i = 0,j=1; i < a.length-1; i++,j++) {
          
      		if(a[i]%2==0 &&a[j]%2==0){
    	    flag=true;
      		
          }
      	if(a[i]%2==0){
      			cnt++;
      		}

		
	
	
   }
	   if(a[k]%2==0){
	   cnt++;
	  
   }
	  
	   if(cnt==2&&flag){
		   return 1;
	   }
	   return 0;
}
}