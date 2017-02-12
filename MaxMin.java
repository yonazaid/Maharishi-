
public class MaxMin {

	public static void main(String[] args) {
		int i = isMaxMin(new int[]{9,0,5,9});
		System.out.println(i);

	}
	public static int isMaxMin(int[] a){
		int max=a[0];
		int min=a[0];
		int indexMax=0;
		int indexMin=0;
		int countMin=0;
		int countMax=0;
		for(int i=0;i<a.length;i++){
			if(a[i]>max){
				max=a[i];
				indexMax=i;
			}
			if(a[i]<min){
				min=a[i];
				indexMin=i;
			}
		}
		for (int i = 0; i < a.length; i++) {
			if(max==a[i]){
				countMax=countMax+1;
			}
			else if (min==a[i]){
				countMin=countMin+1;
			}
		}
		if(indexMin-indexMax==1||indexMin-indexMax==-1||countMax>=2||countMin>=2||max==min){
			return 0;
		}
		return 1;
	}

}
