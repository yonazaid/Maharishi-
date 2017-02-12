public class DaniExericise {
	public static void main(String[] args) {
		int[] i = isAccess(350);
		System.out.print("{");
		for (int j = 0; j < i.length; j++) {
			if(j==i.length-1){
				System.out.print(i[j]);
			}
			else{
				System.out.print(i[j]+" ,");
			}
		}
          System.out.println("}");
	}
	public static int[] isAccess(int a){
		int rem=0;
		int[] b= new int[10];
		int j=0;
		for(int i=2;i<a;i++){
			rem=0;
			if(isPrime(i)){
				while(rem==0){
					rem=a%i;
					if(rem==0){
						b[j]=i;
						j++;
					}
					else{
						break;
					}
					a=a/i;
				}
			}
		}
		int[] c=new int[j];
		for(int i=0;i<j;i++){
			c[i]=b[i];
		}
		return c;
	}
	public static boolean isPrime(int a){
		for (int i = 2; i < a; i++) {
			if(a%i==0){
				return false;				
			}
		}
	return true;
	}
}
