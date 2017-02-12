
public class MedHav {
	public static void main(String[] args) {
		int[] x={2,1,1,1,12,1};
		int i=isMadHav(x);
		System.out.println(i);
	}
 public static int isMadHav(int[] a){ 
	 int k=1;
	 int p=2;
	 int sum=0;
  for(int i=0;i<a.length;i++){
	  sum=0;
		 for(int j=k;j<k+p;j++){
          sum=sum+a[j];
 		 }
  if(a[0]==sum){
  }
  else{
	  return 0;
  }
		 k=k+p;
		 p=p+1;
         if(k==a.length){
        	 break;
         }
  }  
  return 1;
 }
}
