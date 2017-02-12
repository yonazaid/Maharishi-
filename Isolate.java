
public class Isolate {

	public static void main(String[] args) {
		int i=isIsolalte(7);
		System.out.println(i);

	}
public static int isIsolalte(int a){
	int square=a*a;
	int remainder=square%10;
	int cube=square*a;
	if(cube<10 && square<10){
		if(cube!=square){
			return 1;
		}
		return 0;
	}
	boolean flag1=true;
	boolean flag2=true;
	while(flag1){
		if(square<10){
			 remainder=square;
			 flag1=false;
		}
		else{
			remainder=square%10;
			
			square=square/10;
			
			cube=a*a*a;
		}

		while(flag2){
			int rem=cube%10;
			//System.out.println(rem);
			cube=cube/10;
			if(rem==remainder){
				return 0;
			}
	
			if(cube <10){
				if(cube==remainder){
					return 0;
				}
				flag2=false;
			}
		}
	}
	return 1;
}
}
