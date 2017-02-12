
public class SmartArray {

	public static void main(String[] args) {
		int i=isSmart(11);
		System.out.println(i);

	}
	public static int isSmart(int a){
		int pr=1;
		for(int i=1;i< 100;i++){
			pr=pr+i-1;
			if(pr==a){
				return 1;
			}
			else if(pr>a){
				break;
			}
		}
		return 0;
	}

}
