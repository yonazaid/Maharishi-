
public class Trival {

	public static void main(String[] args) {
		int i=isTrival(new int[]{20,19,10,10,10,19,20,10});
		System.out.println(i);

	}
public static int isTrival(int[] a){
	int count=0;
	int[] c=new int[a.length];
	for(int i=0;i<a.length;i++){
		boolean flag=true;
		if(i==0){
			c[i]=a[i];
			count++;
		
		}
		else{
			for(int j=0;j<i;j++){
				if(c[j]==a[i]){
					c[i]=a[i];
					flag=false;
				
				}
		}
			if(flag){
				c[i]=a[i];
				count++;
				
			}
		
		}
	
}
	if(count==3){
		return 1;
	}
	return 0;
}
}
