
public class Packed {
	
	
public static void main(String[] args){
	int i=isPacked(new int[]{2,2,3,2,3,3,2});
	System.out.println(i);
}
public static int isPacked(int[] a){
	int cnt=0;
	int j=0;
	for(int i=j;i<a.length;i++){
	      i=j;
		cnt=0;
	
             if(j>=a.length){
            	 break;
             }
    	   while(a[i]==a[j]){
    		   cnt++;
    		   
    		   j++;
    		   if(j>a.length-1){
    			   break;
    		   }
    	   }
       
	  
	   if(cnt!=a[i]){
		  
		   return 0;
	   }
       
	}
	return 1;
}
}
