
public class Mindiff {

	public static void main(String[] args) {
		int i=mindis(13013);
        System.out.println(i);
	}
   public static int mindis(int a){
	  int fact=0;
	   int mindiff1=a;
	   for(int i=1;i<=a;i++){
		   if(a%i==0){
			if(i==1){
			fact=i;
			}
			else{
				int mindiff=i-fact;
				fact=i;
				if(mindiff1>mindiff){
					mindiff1=mindiff;
				}
			}
		   }
	   }
	return mindiff1;
   }
}
