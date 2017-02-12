
public class Bunker {

	public static void main(String[] args) {
		boolean t=isBunker(new int[]{6,10,1,7});
		System.out.println(t);

	}
public static boolean isBunker(int[] a){
	boolean oneFlag=false;
	boolean primeFlag=false;
	for(int i=0;i<a.length;i++){
		if(a[i]==1){
			oneFlag=true;
		}
		boolean j=isPrime(a[i]);
		if(j){
			primeFlag=true;
			
		}
	}
	if(oneFlag &&primeFlag){
		return true;
	}
	return false;
}
public static boolean  isPrime(int a){
	if(a==1){
		return false;
	}
	for(int i=2;i<a;i++){
		if(a%i==0){
			return false;
		}
		
	}
	return true;
}
}
