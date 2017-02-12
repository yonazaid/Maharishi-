
public class SmallFactory {

	public static void main(String[] args) {
		int i = isSmallFactor(7,30);
		System.out.println(i);

	}
	public static int isSmallFactor(int a,int b){
		
		for(int i=2;i< a;i++){
			for (int j = 2; j < a; j++) {
				if(i*j==b){
					return 1;
				}
			}
		}
		return 0;
	}

}
