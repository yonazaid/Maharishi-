
public class ConFactor {

	public static void main(String[] args) {
		int i=isContinousFacotr(90);
		System.out.println(i);

	}
	public static int isContinousFacotr(int a){
		int b=1;
		
		for (int i = 2; i < a; i++) {
		int	pro=1;
			for (int j =i; j < a ; j++) {
			    
			     if(j==i){
			    	 b=j;
			    	 pro=pro*b;
			    	
			     }
			     if(j-b==1){
			    	 pro=pro*j;
			    	 b=j;
			    	 if(pro==a){
			    		 return 1;
			    	 }
			     }

			}
		}
		return 0;
	}

}
