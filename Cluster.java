
public class Cluster {

	public static void main(String[] args) {
	int[] a=clusterCampo(new int[]{4,4,4,4,3,3,4,4,2,4,5,5});
	
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]);
	
		}
	}
     
	
public static int[] clusterCampo(int[] a){
	int s=1;
	int j=0;
	int[] b=new int[a.length];
	for (int i = 0; i < a.length; i++) {
		if(i==0){
			b[j]=a[i];
		}
		else{
			if(a[i]!=a[i-1]){
				j++;
				s++;
				b[j]=a[i];
			}
		}
	}
	int[] c=new int[s];
	for (int i = 0; i < c.length; i++) {
		c[i]=b[i];
	}
	return c;
}
}
