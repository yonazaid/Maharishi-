
public class Dolphine {

	public static void main(String[] args) {
		int i=isDolphine(new int[]{2,4,5,4,10});
		System.out.println(i);
	}
	public static int isDolphine(int[] a){
		int count=0;
		int k=0;
		int oddCount=0;
		int evencount=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0){
				count++;
				
			}
			else{
				oddCount++;
				break;
			}
		}
		if(oddCount==0){
			return 0;
		}
		for(int j=a.length-1;j>=0;j--){
			if(a[j]%2==0){
				evencount++;
				k=j;
			}
			else{
				break;
			}
			
		}

		if(evencount==count){
			return 1;
		}
		return 0;
	}

}
