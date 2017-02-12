
public class Meera {

	public static void main(String[] args) {
		int i=isMeera(new int[]{0,4,8});
		System.out.println(i);

	}
  public static int isMeera(int[] a){
	 int countZero=0;
	 int countPrime=0;
	 int prime=0;
	  for(int i=0;i<a.length;i++){
		  countPrime=0;
		  if(a[i]==0){
			  countZero++;
			
		
		  }
		  for(int j=1;j<=a[i];j++){

			  if(a[i]%j==0){
				  countPrime++;
			  }
		  }
         if(countPrime==2){
        	 prime++;
         }
	  }
	  
	  if(countZero!=0&&prime==0){
		  return 0;
	  }
	  else if(countZero==0&&prime!=0){
		  return 0;
		  
	  }


	  return 1;
  }
}
