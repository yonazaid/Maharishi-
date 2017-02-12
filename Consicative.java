
public class Consicative {

	public static void main(String[] args) {
		int i=isConsicative(12);
		System.out.println(i);
		

	}
public static int isConsicative(int a){
	int b=0;
	int c=0;
	for (int i = 2; i <= a; i++) {
		if(a%i==0){
			c++;
			if(c==1){
				
			b=i;
		}
			else{
				if(i-b==1){
					return 1;
				}
				b=i;
	}

}
}
	return 0;
	}}