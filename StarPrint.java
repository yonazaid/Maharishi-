
public class StarPrint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		printStar(new char[]{'a','b','a','c','a','b'});
		

	}
	public static void printStar(char[] a){
		char[] c=new char[a.length];
		
		
		for (int i = 0; i < a.length; i++) {
			int cnt=0;
			boolean flag=false;
			for (int j = 0; j < a.length; j++) {
				if(a[i]==a[j]){
					cnt++;
					
				}
			}
			for (int k = 0; k< c.length; k++) {
				if(a[i]==c[k]){
					flag=true;
				}
			}
			if(!flag){
				c[i]=a[i];
				System.out.print(a[i]+"---");
				for (int j = 0; j < cnt; j++) {
					System.out.print("@");
				}
				System.out.println();
			}

		}
	}

}
