
public class OddValent {

	public static void main(String[] args) {
		int i=isOddValent(new int[]{3,3,3,3,3,3});
		System.out.println(i);

	}
	public static int  isOddValent(int[] a){
		int cnt=0;
		boolean flag=false;
		for (int i = 0; i < a.length; i++) {
			cnt=0;
			for (int j = 0; j < a.length; j++) {
				if(a[i]==a[j]){
					cnt++;
				}
				if(a[i]%2!=0){
					flag=true;
				}
			}
			if(flag&&cnt>=2){
				return 1;
			}
		}
		
		return 0;
		
	}
	/*
    public static int isPrime(int a){
    	if(a==1){
    		return 0;
    	}
          for (int i = 2; i < a; i++) {
			if(a%i==0){
				return 0;
				
			}
		}	
          return 1;
    }
    */
}
