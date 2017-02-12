
public class Factorial {

	public static void main(String[] args) {
		int fact=1;
		int p=0,k=0;
		int j=1;
		int n=9;
		for(int i=1;i<=10;i++){
			fact=fact*i;
		}
        System.out.println(fact);
        for(int s=0;s<=10;s++){
        int	xfact=1;
        int 	yfact=1;
            for(int i=1;i<=j;i++){
            	xfact=xfact*i;
            	p=j;
            	
            	
            }
            for(int i=n;i>=1;i--){
            	yfact=yfact*i;
            	k=n;
            	
            }
            j++;
            n--;
            System.out.println(xfact+yfact);
            if(xfact+yfact-1==fact){
            	System.out.println(p+" and "+k);
            	break;
            }
        }
       
	}

}
