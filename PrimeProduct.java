
public class PrimeProduct {

	public static void main(String[] args) {
		int i=isPrimeProduct(22);
		System.out.println(i);

	}
	public static int isPrimeProduct(int a){
     for(int i=2;i<a;i++){
    	 if(isPrime(i)==1){
    		 for (int j = 2; j < a; j++) {
    			 if(isPrime(j)==1&&i*j==a){
    				 return 1;
    			 }
			}
    	 }
     }
     return 0;
	}
  public static int isPrime(int a){
	  for (int i = 2; i < a; i++) {
		if(a%i==0){
			return 0;
		}
	}
	  return 1;
  }
}
