
public class Median {

	public static void main(String[] args) {
	int[] x={1,2,4,4,5,1,};
	int i=isMedian(x);
	System.out.println(i);
	}
public static int isMedian(int[] a){
	int median=0;

	if(a.length%2==0){
		median=a.length/2-1;
		int t=median+1;
		int p=median-1;
		int sum=a[median];
		if(sum==15){
			return 0;
		}
		for(int i=0;i<a.length;i++){
			sum=sum+a[t];
			t++;
			if(sum>15){
				return 0;
			}
			else if(sum==15){
				return 1;
			}
			else{
				sum=sum+a[p];
				p--;
				if(sum>15){
					return 0;
				}
				else if(sum==15){
					return 1;
				}
			}
				
		}
	}
		median=a.length/2;
		int sumT=a[median];
		int r=median+1;
		int q=median-1;
		if(sumT==15){
			return 1;
		}
		for(int i=0;i<a.length;i++){
			sumT=sumT+a[q]+a[r];
			if(sumT==15){
				return 1;
			}
			if(sumT>15){
				return 0;
			}
			q--;
			r++;
		}
		return 1;
	
}
}
