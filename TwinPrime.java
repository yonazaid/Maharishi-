
public class TwinPrime {
	public static void main(String[] args) {
		int i=isTwinPrime(53);
		System.out.println(i);

	}
   public static int isTwinPrime(int a){
	   int b=a-2;
	   int cnt=0;
	   boolean flag=true;
      while(flag){
    	  cnt=0;
    	  for(int i=2;i<b;i++){
    		  if(b%i==0){
    			  cnt++;
    		  }
    	  }
    	  if(cnt==0){
    		  return 1;
    	  }
    	  b=b+4;
    	  flag=false;
    	  
      }
      return 0;
   }
  
}
