
public class LegalNumber {


	public static void main(String[] args) {
		int i=isLegalNumber(new int[]{1,0,1,3},2);
		System.out.println(i);

	}
public static int isLegalNumber(int[] a,int base){
	for(int i=0;i<a.length;i++){
		if(a[i]>base){
			return 0;
		}
	}
	int base10=convertToBase10(a,base);
	return base10;
}

public static int convertToBase10(int[] a,int base){
	int sum=0;
	int expontialValue=1;
	for (int i = a.length-1; i >= 0; i--) {
		if(i==a.length-1){
			sum=sum+(a[i]*expontialValue);
		}
		else{
			expontialValue=base*expontialValue;
			sum=sum+(a[i]*expontialValue);
		}
	}
	return sum;
}


}

