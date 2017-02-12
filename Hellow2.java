
public class Hellow2 {

	public static void main(String[] args) {
		int i =isHellow(new int[]{5,8,1,2,0,0,0,0,3,4,7,9});
		System.out.println(i);

	}
	public static int isHellow(int[] a){
		int star=0;
		int end=0;
		int cnt=0;
		int p=0;
		int q=0;
		
		if(a.length%2==0){
			end=a.length/2;
			star=a.length/2+1;
		
			
		}
		else{
			end=a.length/2;
			star=a.length/2;
			cnt=-1;
			
			
		}
		for(int i=end;i>=0;i--){
			
			if(a[i]==0){
				cnt++;
			
			}
			else if(a[i]==0&&p!=0){
				q++;
			
			}
			else{
				
					p++;
				
			}
			
		}
	
		for(int i=star;i<a.length;i++){
			
			if(a[i]==0){
				cnt++;
			
			}
			else if(a[i]==0&&p!=0){
				q++;
			
			}
			else{
				
					p++;
				
			}
		}
	System.out.println(cnt);
		
		if((a.length%2==0&&cnt%2!=0)){
			return 70;
		}
		else	if(a.length%2!=0&&cnt%2==0||q!=0){
			return 90;
		}
		return 1;
	}

}
