
public class Try {

 
	public static void main(String[] args) {
     int[] x={8,4,2,1};
    int i= isGuthen(x);
    System.out.println(i);
	}
public static int isGuthen(int[] a){
	boolean flag=true;
	int j=1;
	for(int i=0;i<a.length-1;i++){
		if(a[i]%2==0 && a[i]/2==a[j]){
			
		}
		else if(a[i]%2!=0  && (a[i]*3+1)==a[j]){
			
		}
		else{
			flag=false;
		}
		j++;
	}
	if(!flag){
		return 0;
	}
	return 1;
}
}
